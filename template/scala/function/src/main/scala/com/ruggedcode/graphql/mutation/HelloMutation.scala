package com.ruggedcode.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
class HelloMutation extends GraphQLMutationResolver {
  def hello(who: String): String = {
    s"""Hello, ${Optional.ofNullable(who).orElse("Springboot GraphQL")}"""
  }
}
