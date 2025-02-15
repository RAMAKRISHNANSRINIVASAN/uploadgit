package com.hexaware.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaware.app.Entity.Student;

@Repository
public interface RepStudent extends JpaRepository<Student, Integer> {
	@Modifying
    @Query("UPDATE Student SET fee = :fee WHERE Roll = :roll")
    int updateFee(@Param("fee") double fee, @Param("roll") int roll);
	
	List<Student> findByNameContaining(String name);

	

}
