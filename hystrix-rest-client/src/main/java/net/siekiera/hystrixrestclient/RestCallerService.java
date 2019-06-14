package net.siekiera.hystrixrestclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestCallerService {
    private Logger logger = LoggerFactory.getLogger(RestCallerService.class);

    @HystrixCommand(fallbackMethod = "callSecondNode")
    public void callFirstNode() {
        logger.info("callFirstNode started");
        RestTemplate restTemplate = new RestTemplate();
        HystrixResponse hystrixResponse = restTemplate.getForObject("http://localhost:8081/send", HystrixResponse.class);
        logger.info(hystrixResponse.toString());
    }

    @HystrixCommand(fallbackMethod = "callFirstNode")
    public void callSecondNode() {
        logger.info("callSecondNode started");
        RestTemplate restTemplate = new RestTemplate();
        HystrixResponse hystrixResponse = restTemplate.getForObject("http://localhost:8082/send", HystrixResponse.class);
        logger.info(hystrixResponse.toString());
    }

    public void callThirdNode() {
        logger.info("callThirdNode started");
        RestTemplate restTemplate = new RestTemplate();
        HystrixResponse hystrixResponse = restTemplate.getForObject("http://localhost:8083/send", HystrixResponse.class);
        logger.info(hystrixResponse.toString());
    }

    public void callFourthNode() {
        logger.info("callFourthNode started");
        RestTemplate restTemplate = new RestTemplate();
        HystrixResponse hystrixResponse = restTemplate.getForObject("http://localhost:8084/send", HystrixResponse.class);
        logger.info(hystrixResponse.toString());
    }
}
