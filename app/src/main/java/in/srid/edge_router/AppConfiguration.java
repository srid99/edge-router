package in.srid.edge_router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfiguration {
    @Bean
    public ExternalUrlMappingFilter externalUrlMappingFilter() {
        return new ExternalUrlMappingFilter();
    }
}
