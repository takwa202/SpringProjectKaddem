package tn.esprit.spring.khaddem_takwa.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI().info(infoAPI());
    }

    public Info infoAPI() {
        return new Info().title("SpringDoc-Demo").description("TP étude de cas").contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact().name("Lassoued Takwa").email("takwa.lassoued@esprit.tn").url("https://www.google.com/");
        return contact;
    }
   /* @Bean
    public GroupedOpenApi productPublicApi() {
        return GroupedOpenApi.builder()

                .group("Only Product Management API")
                .pathsToMatch("/product/**")
                .pathsToExclude("**")
                .build();

    }*/
}
