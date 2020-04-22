# Apollo GraphQL function

```
faas-cli template pull https://github.com/hbouiver/openfaas-templates
```

Integration with Apollo Schema registry `https://engine.apollographql.com/`

APOLLO_GRAPH_MANAGER_APIKEY=
APOLLO_GRAPH_MANAGER_VARIANTS=

`apollo.config.js`
service.name = "hello_faas_schema"

```bash
apollo service:push --endpoint=https://localhost:3000/graphql --tag dev
```