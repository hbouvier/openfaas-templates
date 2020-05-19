package com.ruggedcode.graphql.controller

import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

import com.ruggedcode.graphql.service.HealthService
import com.ruggedcode.graphql.model.Health

@Controller
class HealthController @Autowired()(healthService: HealthService) {
  @RequestMapping(path = Array("/health"), method = Array(RequestMethod.GET), produces = Array(MediaType.APPLICATION_JSON_VALUE))
  @ResponseBody
  def handleRequest(): Health = {
    healthService.health()
  }
}