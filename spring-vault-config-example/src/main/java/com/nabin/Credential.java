package com.nabin;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties("practice")
public class Credential {
 private String userName;
 private String password;
}
