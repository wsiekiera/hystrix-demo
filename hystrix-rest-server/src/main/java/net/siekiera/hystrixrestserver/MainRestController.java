package net.siekiera.hystrixrestserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
    @Value("${custom.server.name}")
    private String serverName;

    @RequestMapping(value = "/send")
    public HystrixResponse sendPackage() {
        HystrixResponse hystrixResponse = new HystrixResponse();
        hystrixResponse.setServerName(serverName);
        return hystrixResponse;
    }
}
