package com.my.controller;

import com.my.service.UserService;
import com.my.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@PathVariable String username, String password, HttpSession session,Model model) {
        User user=userService.findUser(username,password);
        if (user !=null){
            session.setAttribute("USER_SESSION",user);
            return "index.jsp";
        }
        model.addAttribute("msg","用户名或密码错误，请重新输入！");
        return "login.jsp";
    }
}
