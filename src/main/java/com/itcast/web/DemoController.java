package com.itcast.web;

import com.itcast.pojo.User;
import com.itcast.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    @Autowired
    private UserService userService;

    /*
    * test
    * */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        log.debug("lombok has been started!!!");
        return "hello spring";
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public User queryUser(@PathVariable("id") Long id){
        return userService.queryById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public User insertUser(@PathVariable("id") Long id){
        return userService.queryById(id);
    }
}
