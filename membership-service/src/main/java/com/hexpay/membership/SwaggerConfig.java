package com.hexpay.membership;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI membershipOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Membership Service API")
                        .version("v1"));
    }
}
