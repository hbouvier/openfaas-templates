"use strict"
const { ApolloServer } = require('apollo-server');
const handler = require('./function/handler');
const server = new ApolloServer(handler);
const port = process.env.http_port || 3000;

server.listen(port).then(({ url }) => {
  console.log(`OpenFaaS Apollo GraphQL 🚀 listening on ${url}`);
});
