package com.dts.department.service;

import com.dts.department.entity.Department;
import com.dts.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService implements IDepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService: ");
        return departmentRepository.save(department);
    }

    @Override
    public Department findDepartmentById(Long id) {
        log.info("Inside findDepartmentById of DepartmentService: ");
        return departmentRepository.findById(id).get();
    }
}
