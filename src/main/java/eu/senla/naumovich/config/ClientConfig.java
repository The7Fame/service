package eu.senla.naumovich.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ClientConfig {
    private static final  String URL = "https://jsonplaceholder.typicode.com/posts";

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl(URL)
                .build();
    }
}
