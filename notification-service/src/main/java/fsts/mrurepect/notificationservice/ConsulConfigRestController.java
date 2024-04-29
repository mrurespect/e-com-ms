package fsts.mrurepect.notificationservice;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConsulConfigRestController {
    private  ConsulConfig consulConfig;
    private  VaultConfig vaultConfig;

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
