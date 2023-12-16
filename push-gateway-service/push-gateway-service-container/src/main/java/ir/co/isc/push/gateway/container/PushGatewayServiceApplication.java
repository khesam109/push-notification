package ir.co.isc.push.gateway.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ir.co.isc.push")
public class PushGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                PushGatewayServiceApplication.class, args
        );
    }
}
