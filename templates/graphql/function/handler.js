'use strict'
const { gql } = require('apollo-server-express');

const engine = process.env['APOLLO_GRAPH_MANAGER_APIKEY'] && process.env['APOLLO_GRAPH_MANAGER_VARIANTS'] ? {
  apiKey:    process.env['APOLLO_GRAPH_MANAGER_APIKEY'],
  schemaTag: process.env['APOLLO_GRAPH_MANAGER_VARIANTS']
} : undefined;

const typeDefs = gql`
  type Query {
    hello: String
  }
`;

const resolvers = {
  Query: {
    hello: () => 'Hello world!'
  },
};

module.exports = { typeDefs, resolvers, engine };
