package com.ruggedcode.graphql.controller

import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

import com.ruggedcode.graphql.service.ConfigurationService

@Controller
class VersionController @Autowired()(configurationService: ConfigurationService) {
  @RequestMapping(path = Array("/version"), method = Array(RequestMethod.GET), produces = Array(MediaType.TEXT_PLAIN_VALUE))
  @ResponseBody
  def handleRequest(): String = {
    "Service version " + configurationService.getVersion
  }
}