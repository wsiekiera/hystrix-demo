package net.siekiera.hystrixrestserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
    @RequestMapping(value = "/send")
    public HystrixResponse sendPackage() {
    return new HystrixResponse();
    }
}
