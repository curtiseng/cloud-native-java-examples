package io.github.fallingyang.uaa.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yangzifeng
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
