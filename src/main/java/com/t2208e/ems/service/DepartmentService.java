package com.t2208e.ems.service;

import com.t2208e.ems.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentById(int departmentId);
    List<DepartmentDto> getAllDepartment();
    DepartmentDto updateDepartment(int departmentId, DepartmentDto updateddepartment);
    public void deleteDepartment(int departmentId);
}
