AI Vacation Planner (Monorepo)
===

[![CI](https://github.com/yuvarajsanjeevi/ai-vacation-planner/actions/workflows/ci.yml/badge.svg)](https://github.com/yuvarajsanjeevi/ai-vacation-planner/actions/workflows/ci.yml)

A demo of Spring AI's `Tool Calling` + `Retrieval Augmented Generation` (RAG), combined with a standalone MCP server and a human-in-the-loop confirmation flow for tool invocations.

### Components

| Module | What it is | Port |
|---|---|---|
| [`planner/`](planner/readme.md) | Spring Boot app — LLM inference/embeddings via Spring AI, exposes local `@Tool` methods and an MCP client | 8080 |
| [`mcp-server/`](mcp-server/README.md) | Spring Boot MCP server — mock Airbnb property search exposed over the MCP protocol | 8090 |
| [`ui/`](ui/README.md) | Vaadin front end ("Good Listener") — chat UI with tool-confirmation prompts | 8070 |
| Postgres (pgvector) | Vector store for RAG embeddings, run via `docker compose` | 5432 |

```
        ┌────────────┐        ┌──────────────────┐
 user ─▶│  ui (8070) │──────▶│  planner (8080)   │
        └────────────┘        │  (Tool Calling +  │
                               │   RAG over LLMs)  │
                               └─────────┬─────────┘
                                         │ MCP (SSE)          ┌────────────┐
                                         ├───────────────────▶│ mcp-server │
                                         │                     │  (8090)   │
                                         │                     └────────────┘
                                         ▼
                                ┌────────────────┐
                                │ pgvector (5432)│
                                └────────────────┘
```

### Running everything

See [`planner/readme.md`](planner/readme.md) for full setup: required API keys, environment variables, build steps, and how to run all four components with `docker compose`.

Quick reference — point the compose env vars at the subfolders in this repo:
```
export PLANNER_ROOT=$(pwd)/planner
export MCP_ROOT=$(pwd)/mcp-server
export LISTENER_ROOT=$(pwd)/ui
```

### CI

Each module is built and tested independently on every push/PR via [`.github/workflows/ci.yml`](.github/workflows/ci.yml).
