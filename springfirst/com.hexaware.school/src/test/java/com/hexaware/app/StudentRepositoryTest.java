package com.hexaware.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hexaware.app.Dao.RepStudent;
import com.hexaware.app.Entity.Student;
import com.hexaware.app.Service.StudentService;

@SpringBootTest
public class StudentRepositoryTest {

@MockBean
private RepStudent rep;
@Autowired
private StudentService studSer;

@Test
void saveTest() {
	Student s=new Student(1,"Ram",20,20000.0,"Ram@gmail.com","chennai");
	rep.save(s);
}
@Test
public void getUserTest(){
	when(rep.findAll()).thenReturn(Stream
	.of(new Student(1,"Ram",20,20000.0,"Ram@gmail.com","chennai"),new Student(2, "John", 22, 25000.0, "John@gmail.com", "Mumbai")).collect(Collectors.toList()));  
	assertEquals(2,studSer.getStuds().size());
	
	
}
}