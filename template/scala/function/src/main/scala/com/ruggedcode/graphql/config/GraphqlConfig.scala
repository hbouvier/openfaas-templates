package com.ruggedcode.graphql.config

import scala.beans.BeanProperty
import org.springframework.stereotype.Component
import org.springframework.boot.context.properties.ConfigurationProperties

@Component
@ConfigurationProperties("graphql")
case class GraphqlConfig() {
  @BeanProperty var version: String = _
}