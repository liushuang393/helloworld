package com.example.service;

import com.example.mapper.DepartmentMapper;
import com.example.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartments();
    }

    public Department getDepartmentById(String departmentId) {
        return departmentMapper.getDepartmentById(departmentId);
    }

    public void saveDepartment(Department department) {
        if (getDepartmentById(department.getDepartmentId()) == null) {
            departmentMapper.insertDepartment(department);
        } else {
            departmentMapper.updateDepartment(department);
        }
    }

    public void deleteDepartment(String departmentId) {
        departmentMapper.deleteDepartment(departmentId);
    }
}
