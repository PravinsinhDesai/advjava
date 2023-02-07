package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Employee;
@Repository
public interface EmpDao extends JpaRepository<Employee, Long> {

	
}
