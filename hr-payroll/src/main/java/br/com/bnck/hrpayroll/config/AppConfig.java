package br.com.bnck.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: microsservicos
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 01/02/2022
 * Hora: 08:00
 */
@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}