package com.example.mapper;

import com.example.model.Department;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface DepartmentMapper {

    List<Department> getAllDepartments();

    Department getDepartmentById(String departmentId);

    void insertDepartment(Department department);

    void updateDepartment(Department department);

    void deleteDepartment(String departmentId);
}
