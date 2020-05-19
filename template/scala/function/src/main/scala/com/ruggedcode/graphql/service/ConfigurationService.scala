package  com.ruggedcode.graphql.service

import com.ruggedcode.graphql.config.GraphqlConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ConfigurationService @Autowired()(configurationService: GraphqlConfig) {
  def getVersion: String = {
    s"v${configurationService.version}"
  }
}