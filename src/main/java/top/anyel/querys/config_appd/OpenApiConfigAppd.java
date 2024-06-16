package top.anyel.querys.config_appd;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "NCAPAS API",
                version = "1.0",
                description = "Examen de Distribuidas",
                contact = @Contact(name = "Desarrollado por Anyel EC", email = "soporte@ncapas.com"),
                license = @License(name = "Apache 2.0", url = "http://springdoc.org")
        ),
        servers = @Server(url = "http://localhost:8080")
)
public class OpenApiConfigAppd {
}