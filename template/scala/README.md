# Scala function

```
faas-cli template pull https://github.com/hbouiver/openfaas-templates
```

`Simple query to run in http://localhost:8080/graphiql`

```graphql
mutation hello {
  hello
}

mutation hello_boby {
  hello(who: "boby")
}

query health { 
  health {
    ok
  	message
  }	
}

query version { 
  version 
}
```