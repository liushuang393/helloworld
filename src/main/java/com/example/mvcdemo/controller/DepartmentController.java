package com.example.mvcdemo.controller;

import com.example.mvcdemo.model.Department;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DepartmentController {

    @GetMapping("/department")
    public String showDepartmentForm() {
        return "departmentForm";
    }

    @PostMapping("/department/submit")
    public String submitDepartment(@RequestParam("name") String name, Model model) {
        Department department = new Department();
        department.setName(name);
        model.addAttribute("department", department);
        return "departmentResult";
    }
}