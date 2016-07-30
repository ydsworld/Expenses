package com.ydsworld.controller;

import com.ydsworld.model.user.User;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("messsage", "Hello");
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model){
        User user = new User();
        user.setFirstName("Arun");
        user.setLastName("Patel");
        model.addAttribute("messsage", user);
        return "login";
    }

}
