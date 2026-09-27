Good Listener
===

The Vaadin front end for the AI Vacation Planner. Accepts chat queries, displays responses, and prompts the user to confirm each tool invocation before it runs (human-in-the-loop).

- Runs on port `8070`.
- Talks to the `planner` app's backend (`backend-host`, default `http://localhost:8080`).
- No API keys required directly — all LLM/tool calls go through the `planner` service.

Run locally:
```
./mvnw spring-boot:run
```

For a production build (minified frontend bundle):
```
./mvnw clean install -Pproduction
```
