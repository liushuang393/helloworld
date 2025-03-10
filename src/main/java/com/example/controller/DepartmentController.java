package com.example.controller;

import com.example.model.Department;
import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/form")
    public String showForm() {
        return "departmentForm";
    }

    @PostMapping("/submit")
    public String submitDepartment(@ModelAttribute Department department) {
        departmentService.saveDepartment(department);
        return "redirect:/department/list";
    }

    @GetMapping("/list")
    public String listDepartments(Model model) {
        model.addAttribute("departments", departmentService.getAllDepartments());
        return "departmentList";
    }

    @GetMapping("/edit/{id}")
    public String editDepartment(@PathVariable("id") String departmentId, Model model) {
        Department department = departmentService.getDepartmentById(departmentId);
        model.addAttribute("department", department);
        return "departmentForm";
    }

    @GetMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable("id") String departmentId) {
        departmentService.deleteDepartment(departmentId);
        return "redirect:/department/list";
    }
}
