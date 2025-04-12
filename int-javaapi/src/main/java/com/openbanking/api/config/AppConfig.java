package com.openbanking.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.openbanking.api.processor.TransactionProcessor;

@Configuration
public class AppConfig {

    @Bean
    public TransactionProcessor transactionProcessor() {
         return new TransactionProcessor();
    }
}
