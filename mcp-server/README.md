Airbnb MCP Server
===

A Spring Boot app that exposes a mock Airbnb property-search tool over the [MCP](https://modelcontextprotocol.io/) protocol, for the `planner` app to call.

- Runs on port `8090` (SSE transport).
- `propertiesSearch` tool returns stubbed listings near a given zip code — no external API or credentials required.
- No environment variables needed to build or run standalone.

Run locally:
```
./mvnw spring-boot:run
```
