package in.srid.edge_router;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class EdgeRouterApplication {
    public static void main(final String[] args) {
        SpringApplication.run(EdgeRouterApplication.class);
    }

    @Bean
    public ExternalUrlMappingFilter externalUrlMappingFilter() {
        return new ExternalUrlMappingFilter();
    }
}
