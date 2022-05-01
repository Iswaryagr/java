package com.example.demo.repository;

//public interface DepartmentRepository {

//}
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Department;
public interface DepartmentRepository   extends JpaRepository<Department, Long> {

	//Department findByDepartmentName(String departmentName);

	Department findByDepartmentName(String departmentName);

	//Department findByDepartmentName(String departmentName);

}
