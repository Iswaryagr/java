package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartList();

	public Department fetchDepartmentById(Long did);

	public void deleteDepartmentById(Long did);

	public Department updateDepartment(Long did, Department department);

	public Department fetchDepartmentByName(String departmentName);

	

}
