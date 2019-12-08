package com.fyh.ssb.web;

import com.fyh.ssb.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class HelloController {
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User getUser(){
        User user = new User();
        user.setName("小啊打发");
        user.setAge(20);
        user.setPass("1231");
        return user;
    }


    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        System.out.println("user:"+user);
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode()+ "-" + error.getDefaultMessage());
            }
        }
    }

}
