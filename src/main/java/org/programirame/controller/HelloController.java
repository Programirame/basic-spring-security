package org.programirame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Basic controller to demonstrate a basic REST service.
 */
@RestController
public class HelloController {

    /**
     * Says Hello to the logged in user.
     *
     * @param principal the principal object for the logged in user.
     * @return the strign greeting.
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(@Autowired Principal principal) {
        return "Hello " + principal.getName();
    }
}
