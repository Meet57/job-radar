package com.acc.jobradar.config;

import com.acc.jobradar.invertedindex.TrieNode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public TrieNode invertedIndexRoot() {
        return new TrieNode();
    }

    @Bean
    public com.acc.jobradar.autocomplete.TrieNode autoCompleteRoot() { return new com.acc.jobradar.autocomplete.TrieNode(); }

}
