package com.fyh.ssb.web;

import com.fyh.ssb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Hello {
//    @RequestMapping("/")
//    public String index(ModelMap map) {
//        map.addAttribute("message", "http://www.ityouknow.com");
//        return "hello";
//    }

    @RequestMapping("/string")
    public String string(ModelMap map) {
        map.addAttribute("userName", "ityouknow");
        return "string";
    }

    @RequestMapping("/if")
    public String ifunless(ModelMap map) {
        map.addAttribute("flag", "no");
        return "if";
    }

    private List<User> getUserList(){
        List<User> list=new ArrayList<User>();
        User user1=new User("大牛",12,"123456");
        User user2=new User("小牛",6,"123563");
        User user3=new User("纯洁的微笑",66,"666666");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return  list;
    }

    @RequestMapping("/list")
    public String list(ModelMap map) {
        map.addAttribute("users", getUserList());
        return "list";
    }

    @RequestMapping("/url")
    public String url(ModelMap map) {
        map.addAttribute("type", "link");
        map.addAttribute("pageId", "springcloud/2017/09/11/");
        map.addAttribute("img", "http://www.ityouknow.com/assets/images/neo.jpg");
        return "url";
    }

    @RequestMapping("/eq")
    public String eq(ModelMap map) {
        map.addAttribute("name", "neo");
        map.addAttribute("age", 30);
        map.addAttribute("flag", "no");
        return "eq";
    }
}
