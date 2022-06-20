package com.isakayabasi.springboot_crud_restfulwebservice.repository;

import com.isakayabasi.springboot_crud_restfulwebservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
