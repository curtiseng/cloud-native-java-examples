package com.example.prometheusdropwizard.config;


import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.exporter.MetricsServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangzifeng
 */
@Configuration
public class PrometheusEndpoint {

    private DropwizardExports dropwizardExports;

    public PrometheusEndpoint(DropwizardExports dropwizardExports) {
        this.dropwizardExports = dropwizardExports;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new MetricsServlet(collectorRegistry()), "/metrics");
    }

    @Bean
    public CollectorRegistry collectorRegistry() {
        CollectorRegistry collectorRegistry = new CollectorRegistry();
        collectorRegistry.register(dropwizardExports);
        return collectorRegistry;
    }

}
