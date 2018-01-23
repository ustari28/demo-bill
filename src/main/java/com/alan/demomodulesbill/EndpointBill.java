package com.alan.demomodulesbill;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class EndpointBill {

    @RequestMapping(method = RequestMethod.GET, value = "/bill")
    public String account() {
        return "Bill";
    }
}
