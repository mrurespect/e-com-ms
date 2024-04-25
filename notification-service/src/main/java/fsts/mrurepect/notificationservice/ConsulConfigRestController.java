package fsts.mrurepect.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/config")
public class ConsulConfigRestController {
    private final ConsulConfig consulConfig;
    private final VaultConfig vaultConfig;

    public ConsulConfigRestController(ConsulConfig consulConfig, VaultConfig vaultConfig) {
        this.consulConfig = consulConfig;
        this.vaultConfig = vaultConfig;
    }

    @GetMapping("/consul")
    public ConsulConfig getConsulConfig() {
        return consulConfig;
    }
    @GetMapping("/vault")
    public VaultConfig getVaultConfig() {
        return vaultConfig;
    }
}
