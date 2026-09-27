AI Vacation Planner (Monorepo)
===

This repo bundles all three components of the AI Vacation Planner demo:

- **`planner/`** — Spring Boot app using Spring AI Tool Calling + RAG. See `planner/readme.md` for full details and run instructions.
- **`mcp-server/`** — Spring Boot MCP server exposing an Airbnb-style service over the MCP protocol.
- **`ui/`** — Vaadin frontend ("Good Listener") that drives the chat UI and confirms tool invocations.

See `planner/readme.md` for environment variables, build steps, and how to run everything with `docker compose`.
