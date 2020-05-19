package com.ruggedcode.graphql.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired

import com.ruggedcode.graphql.model.Health
import com.ruggedcode.graphql.service.HealthService


@Service
class HealthResolver @Autowired()(healthService: HealthService) extends GraphQLQueryResolver {
  def health(): Health = {
    Health(true, "OK")
  }
}
