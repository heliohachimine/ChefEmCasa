package com.example.chefemcasabff.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig(
        @Value("\${app.name}") val name: String,
        @Value("\${app.version}") val version: String
) {
    @Bean
    fun customOpenAPI(): OpenAPI? = OpenAPI()
            .info(
                    Info()
                            .title(this.name)
                            .version(this.version)
                            .license(
                                    License()
                                            .name("Apache 2.0")
                                            .url("http://www.apache.org/licenses/LICENSE-2.0")
                            )
            )
}