package net.siekiera.hystrixrestclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunMe implements CommandLineRunner {
    @Autowired
    RestCallerService restCallerService;

    @Override
    public void run(String... args) throws Exception {
        restCallerService.callFirstNode();
//        restCallerService.callSecondNode();
//        restCallerService.callThirdNode();
//        restCallerService.callFourthNode();
    }
}
