package com.dts.department.controller;

import com.dts.department.entity.Department;
import com.dts.department.service.IDepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment (@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController:");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public  Department findDepartmentById (@PathVariable("id") Long id){
        log.info("Inside findDepartmentById method of DepartmentController:");
        return departmentService.findDepartmentById(id);
    }
}
