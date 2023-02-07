package com.app.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DAO.EmpDao;
import com.app.pojos.Employee;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmpDao empdao;
	
	public EmployeeService() {
		System.out.println("In empserv"+getClass().getName());
	}
		public Employee addNewEmp(Employee emp) {
			
			return  empdao.save(emp);
			
			
		}
		public List<Employee> getAllEmps() {
			return empdao.findAll();
		}
		public void deleteEmp(Long id) {
			// TODO Auto-generated method stub
			 empdao.deleteById(id);
		}
		public Employee updateEmp(Employee emp) {
			
			return empdao.save(emp);
		}
	
		
	
	
}
