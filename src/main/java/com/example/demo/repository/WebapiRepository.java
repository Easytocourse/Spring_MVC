package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface WebapiRepository extends CrudRepository<Employee, Integer> {
	
//	@Query("from Employee where name=?1")
	List<Employee> findByName(String name);

}
