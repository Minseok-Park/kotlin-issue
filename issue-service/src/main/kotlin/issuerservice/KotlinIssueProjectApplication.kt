package issuerservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class KotlinIssueProjectApplication

fun main(args: Array<String>) {
    runApplication<KotlinIssueProjectApplication>(*args)
}
