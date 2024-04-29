package fsts.mrurepect.notificationservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.vault.annotation.VaultPropertySource;


@Data @NoArgsConstructor @AllArgsConstructor
@VaultPropertySource("secret/keypair")
@ConfigurationProperties(prefix = "vault")
public class VaultConfig {
    private String username;
    private String password;
}
