package ir.co.isc.push.kafka.config.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfigData {

    @Value("${kafka-config.bootstrap-servers}")
    String bootstrapServers;

}
