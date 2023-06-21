package com.dts.department.service;

import com.dts.department.entity.Department;

public interface IDepartmentService {
    Department saveDepartment(Department department);

    Department findDepartmentById(Long id);
}
