package fsts.mrurepect.notificationservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "token") //search properties with prefix token
@Data
public class ConsulConfig {
    private Long  accesstokentimeout;
    private Long  refreshtokentimeout;
}
