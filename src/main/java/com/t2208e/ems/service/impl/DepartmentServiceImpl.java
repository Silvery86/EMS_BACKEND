package com.t2208e.ems.service.impl;

import com.t2208e.ems.dto.DepartmentDto;
import com.t2208e.ems.entity.Department;
import com.t2208e.ems.mapper.DepartmentMapper;
import com.t2208e.ems.repository.DepartmentRepository;
import com.t2208e.ems.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentById(int departmentId) {
        return null;
    }

    @Override
    public List<DepartmentDto> getAllDepartment() {
        return List.of();
    }

    @Override
    public DepartmentDto updateDepartment(int departmentId, DepartmentDto updateddepartment) {
        return null;
    }

    @Override
    public void deleteDepartment(int departmentId) {

    }
}
