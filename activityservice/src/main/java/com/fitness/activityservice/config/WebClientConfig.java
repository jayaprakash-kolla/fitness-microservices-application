package com.fitness.activityservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientConfig {
    /*
        This class is responsible for creating a "WebClient.Builder",
        using which we can make calls to other microservices.
    */

    @Bean
    @LoadBalanced
    // The "@LoadBalanced" annotation allows webclient to resolve "service name" via Ureka server.
    // so even if IP address is changed in the future, it won't be issue, since service name will not be change
    public WebClient.Builder getWebClientBuilder(){
        return WebClient.builder();
    }

}
