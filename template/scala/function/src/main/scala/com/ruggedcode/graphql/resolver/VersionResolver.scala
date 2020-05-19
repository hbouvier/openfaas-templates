package com.ruggedcode.graphql.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired
import com.ruggedcode.graphql.service.ConfigurationService



@Service
class VersionResolver @Autowired()(configurationService: ConfigurationService) extends GraphQLQueryResolver {
  def version(): String = {
    "Service version " + configurationService.getVersion
  }
}