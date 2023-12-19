package ir.co.isc.push.service.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ir.co.isc.push")
public class PushServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                PushServiceApplication.class, args
        );
    }
}
