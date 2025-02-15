package com.hexaware.app.Service;
import com.hexaware.app.Exceptions.IDNotFoundException;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.app.Dao.RepStudent;
import com.hexaware.app.Entity.Student;

@Service
public class StudentService {
	@Autowired
	RepStudent RepSt;
public Student  saveSt(Student s)
	
	{
		Student s2=RepSt.save(s);
		return s2;
	}
public List<Student> getStuds() {
	List<Student> li=(List)RepSt.findAll();
	return li;
}
public Student remove(int rno) {
	Student s=RepSt.findById(rno).orElse(null);
	if(s==null)
	{
	return null;
	}
	else
	{
		RepSt.delete(s);
	}
	return s;
}

public String updateNM(String nm, int rn) {
	Student s=RepSt.findById(rn).orElse(null);
	if(s==null)
	{
		return "not found";
	}
	else
	{
		s.setName(nm);
		RepSt.save(s);
		return "Name updated";
		
	}
	
	
}

public String getNameByRollNumber(int rno) {
    Student s = RepSt.findById(rno).orElse(null);
    if (s != null) {
        return s.getName();
    } else {
        return "Student not found";
    }

}

//public Student findStudentById(int rno) throws Exception {
//    return RepSt.findById(rno)
//            .orElseThrow(() -> new Exception("Student not found with Roll Number: " + rno));
//}

public Student findStudentById(int id) {
    return RepSt.findById(id)
            .orElseThrow(() -> new IDNotFoundException("Student not found with Roll Number: " + id));
}

//custom exception

public Student saveStudent1(Student student) {
    return RepSt.save(student);
}

public Student getStudentByRoll(int roll) {
    return RepSt.findById(roll).orElse(null);
}

@Transactional
public String updateFee(double fee, int roll) {
    int result = RepSt.updateFee(fee, roll);
    return result >= 1 ? "Updated" : "Not updated";
}

public List<Student> findStudentsByName(String name) {
    return RepSt.findByNameContaining(name);
}



}
