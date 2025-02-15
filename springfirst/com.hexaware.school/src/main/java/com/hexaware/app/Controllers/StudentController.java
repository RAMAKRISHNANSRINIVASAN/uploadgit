package com.hexaware.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.app.Entity.Student;
import com.hexaware.app.Exceptions.IDNotFoundException;
import com.hexaware.app.Service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studSer;
	@PostMapping("/saveStudent")
	Student saveStudent(@Valid @RequestBody Student s)
	{
		Student s2=studSer.saveSt(s);
		return s2;
		
	}
	@GetMapping("/getStudents")
	public List <Student> getStudents()
	{
		List<Student> users=studSer.getStuds();
		return users;
		
	}
	@DeleteMapping("/removeStud/{rno}")
	public Student removeStud(@PathVariable int rno)
	{
		Student s=studSer.remove(rno);
		return s;
		
	}
	@PutMapping("updateName/{rn}/{nm}")
	public String updateName(@PathVariable String nm,@PathVariable int rn)
	{
		String r=studSer.updateNM(nm,rn);
		return r;
	}
	@GetMapping("/getName/{rno}")
    public String getName(@PathVariable int rno) {
		String s=studSer.getNameByRollNumber(rno);
		return s;
    }
//	@GetMapping("/student/{rno}")
//	public Student getStudentById(@PathVariable int rno) throws Exception {
//	    return studSer.findStudentById(rno);
//	}
//	@GetMapping("/student/{id}")
//    public Student getStudentById(@PathVariable int id) {
//        return studSer.findStudentById(id);
//// custom exception
//
//}
	
	@GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        try {
            Student student = studSer.findStudentById(id);
            return new ResponseEntity<>(student, HttpStatus.OK);
        } catch (IDNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	
	  @PostMapping("/students")
	    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student) {
	        Student savedStudent = studSer.saveStudent1(student);
	        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	    }
	  
	  @PutMapping("/update/{roll}")
	    public ResponseEntity<Student> updateStudent(@PathVariable int roll, @Valid @RequestBody Student student) {
	        Student existingStudent = studSer.getStudentByRoll(roll);

	        if (existingStudent != null) {
	            student.setRoll(roll); // Ensure the roll number is set in the student object
	            Student updatedStudent = studSer.saveStudent1(student);
	            return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	   @PutMapping("/updateFee/{fee}/{roll}")
	    public String updateFee(@PathVariable double fee, @PathVariable int roll) {
	        return studSer.updateFee(fee, roll);
	    }
//	   @GetMapping("/students/findByName")
//	    public List<Student> findStudentsByName(@RequestParam String name) {
//	        return studSer.findStudentsByName(name);
//	    } // localhost:8080/students/findByName?name=John not having @PathVariable alter method fpr postman
	   
	   @GetMapping("/students/findByName/{name}")
	   public List<Student> findStudentsByName(@PathVariable String name) {
	       return studSer.findStudentsByName(name);
	   }

	
	
	
}
