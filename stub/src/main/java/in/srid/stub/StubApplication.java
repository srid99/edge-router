package in.srid.stub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class StubApplication {
    public static void main(final String[] args) {
        SpringApplication.run(StubApplication.class);
    }

    @RestController
    public static class StubController {

        @GetMapping("/api/stub/hello")
        public String helloFromStubWithGETMethod() {
            return "Hello from stub (GET)";
        }

        @DeleteMapping("/api/stub/hello")
        public String helloFromStubWithDELETEMethod() {
            return "Hello from stub (DELETE)";
        }

        @PostMapping("/api/stub/hello")
        public String helloFromStubWithPOSTMethod() {
            return "Hello from stub (POST)";
        }

        @PutMapping("/api/stub/hello")
        public String helloFromStubWithPUTMethod() {
            return "Hello from stub (PUT)";
        }
    }
}
