package com.example.model;

import java.util.Date;
import lombok.Data;

@Data
public class Department {

    private String departmentId;
    private String name;
    private String manager;
    private Date establishDate;
}
