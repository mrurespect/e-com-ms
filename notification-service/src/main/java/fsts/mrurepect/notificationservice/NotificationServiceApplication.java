package fsts.mrurepect.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.vault.core.VaultKeyValueOperationsSupport;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.Versioned;

import java.util.Map;

@SpringBootApplication
public class NotificationServiceApplication {
    @Autowired
    private  VaultTemplate vaultTemplate;

    @Bean
    CommandLineRunner runner(){
        return args -> {
            System.out.println("Connected to vault: " + vaultTemplate.opsForSys().health());
            Versioned.Metadata metadata =
                vaultTemplate.opsForVersionedKeyValue("secret")
                    .put("keypair", Map.of("username", "admin", "password", "admin"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
    }


}
