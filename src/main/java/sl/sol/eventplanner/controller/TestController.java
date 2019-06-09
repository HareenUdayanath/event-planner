package sl.sol.eventplanner.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test}")
    private String signingKey;

    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public String greeting() {
        return signingKey;
    }
}
