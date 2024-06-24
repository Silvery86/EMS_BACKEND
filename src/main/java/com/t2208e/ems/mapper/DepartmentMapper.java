package com.t2208e.ems.mapper;

import com.t2208e.ems.dto.DepartmentDto;
import com.t2208e.ems.entity.Department;
import org.springframework.beans.BeanUtils;

public class DepartmentMapper {
    public static DepartmentDto mapToDepartmentDto(Department department){
        DepartmentDto departmentDto = new DepartmentDto();
        BeanUtils.copyProperties(department, departmentDto);
        return departmentDto;
    }

    public static Department mapToDepartment(DepartmentDto departmentDto){
        Department department = new Department();
        BeanUtils.copyProperties(departmentDto, department);
        return department;
    }
}
