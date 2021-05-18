This project is intended to provide an application for league directors to manage players and scheduling.

# Kotlin API - Ktor

Ktor was chosen as the backend framework b/c I wanted to use Kotlin as the primary language in the backend 
and for its light weight. I'm interested in the difficulty for expanding the Features provided from the framework.

# Postgres DB - Exposed

Postgres was chosen as the DB to model the relational data between players, teams, games, etc.
Exposed is a common library for interacting with databases using Kotlin, and the DSL is a thin layer of abstraction
over SQL.

More challenging to me is dockerizing the DB + composing this with the API service!
