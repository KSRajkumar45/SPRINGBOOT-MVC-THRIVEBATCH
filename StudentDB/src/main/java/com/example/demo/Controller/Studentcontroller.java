package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.domain.Studentdomain;

import java.util.ArrayList;
import java.util.List;  


@RestController  
public class Studentcontroller {  
    @Autowired  
    private StudentService stuService;   
    List<Studentdomain>userRecords = new ArrayList<>();
    @RequestMapping("/")  
    
    public List<Studentdomain> getAllStudent(){  
        return stuService.getAllStudent();  
    }     
    @RequestMapping(value="/addStudent", method=RequestMethod.POST)  
    public void addStudent(@RequestBody Studentdomain pojo){  
        stuService.addStudent(pojo);  
    }  
    @RequestMapping(value="/Student/{id}", method=RequestMethod.GET)  
    public Optional<Studentdomain> getStudent(@PathVariable long id){  
        return stuService.getStudent(id); 
    }
        
    @RequestMapping(value="/deleteStudent/{id}", method=RequestMethod.DELETE)  
    @ResponseBody
    public Optional<Studentdomain> delStudentById(Studentdomain pojo, @PathVariable("id") long id){  
          return stuService.delStudentById(id);        
    }  
    
       
}