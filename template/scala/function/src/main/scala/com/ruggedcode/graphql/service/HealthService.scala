package  com.ruggedcode.graphql.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.ruggedcode.graphql.model.Health

@Service
class HealthService {
  def health() : Health = {
    Health(true, "OK")
  }
}
