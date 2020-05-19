package com.ruggedcode.graphql

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

object GraphqlApplication {
  def main(args: Array[String]) : Unit = SpringApplication.run(classOf[GraphqlApplication], args :_ *)
}

@SpringBootApplication
class GraphqlApplication {}
