package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.domain.*;
import com.example.demo.repository.StudentRepo;
import com.example.demo.domain.Studentdomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  
public class StudentService {  
    @Autowired  
    private StudentRepo repo;  
    public List<Studentdomain> getAllStudent(){  
        List<Studentdomain>Studentdetails = new ArrayList<>();  
        repo.findAll().forEach(Studentdetails::add);  
        return Studentdetails;  
    }  
    public Optional<Studentdomain> getStudent(long id){  
        return repo.findById(id); 
    }  
    public void addStudent(Studentdomain Studentdetails){  
        repo.save(Studentdetails);  
    }  
    public Optional<Studentdomain> delStudentById(long id){  
       this.repo.delStudentById(id);  
        return null;
    }  
   
	
		
	
    
}  