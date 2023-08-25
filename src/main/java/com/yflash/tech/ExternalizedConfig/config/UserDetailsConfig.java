package com.yflash.tech.ExternalizedConfig.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "user1")
@Getter
@Setter
@NoArgsConstructor
public class UserDetailsConfig {

    private String firstName;
    private String lastName;

}
