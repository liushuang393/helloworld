package com.example.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mvcdemo.model.User;

@Controller
public class UserController {

    @GetMapping("/user")
    public String showForm() {
        return "userForm"; // 返回视图名称
    }

    @PostMapping("/user/submit")
    public String submitForm(@RequestParam String name, @RequestParam int age, Model model) {
        User user = new User(name, age);
        model.addAttribute("user", user); // 将 Model 传递给视图
        return "result"; // 返回结果页面
    }
}
