package com.StudentManagement.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;

import com.StudentManagement.model.Student;

import com.StudentManagement.Dao.DB;

public class Collections {
	
	String name;
	int age;
	String dpt;
	Scanner scan = new Scanner(System.in);
	int choice;
	List<Student> studentList = new ArrayList<Student>();
	
	
	 public void InsertMethod() throws SQLException
	    {
		 
		 Connection con=DB.createConnection();
		 PreparedStatement ps=con.prepareStatement("insert into Collection(name,age,dpt) values(?,?,?)");
		 Student Student =new Student();
		 
		 System.out.println("Enter Student name: ");
		 name=scan.next();		 
		 Student.setName(name);	 
		 ps.setString(1,Student.getName());
		 
		 System.out.println("enter the age");
		 age=scan.nextInt();		
		 Student.setAge(age);
		 ps.setInt(2, Student.getAge());
		
		 
		 
		 System.out.println("enter the department");
		  dpt=scan.next();
		 Student.setDpt(dpt);
		 ps.setString(3,Student.getDpt());
		 
		
		 studentList.add(Student);
		 int i=ps.executeUpdate();
	     con.close();   
	    }
	 public void UpdateMethod() throws SQLException
	    {	
		 
		 Connection con=DB.createConnection();
			PreparedStatement ps=con.prepareStatement("update Collection set age=?,dpt=? where name=? ");
		 System.out.println("enter the student name to update details");
		 name=scan.next();		 
			
		 ListIterator<Student> ti = studentList.listIterator();
		 		
		 System.out.println("Enter new age");	
		 int newAge=scan.nextInt();	
		 System.out.println("Enter new department");	
		 String newDept = scan.next();
		 for (int i = 0; i < studentList.size(); i++) 
		 {	
		 	 		    
			 Student Student = ti.next();		
			 if(Student.getName().equals(name)) 
			 {	
				 Student.setAge(newAge);	
				 ps.setInt(1, Student.getAge());
				 Student.setDpt(newDept);	
				 ps.setString(2,Student.getDpt());
				 Student.setName(name);
				 ps.setString(3,Student.getName());
				 
				 }		         		    
			 ti.remove();		     
			 ti.add(Student);	
			
			 }		       
		 int i=ps.executeUpdate();      
		 }
	    
	 public void DeleteMethod() throws SQLException
	    {
		 Connection con=DB.createConnection();
			PreparedStatement ps=con.prepareStatement("delete from Collection where name=?");
		 Student Student =new Student();
		 System.out.println("Enter student name whose record you want to Delete: ");
	        name = scan.next();
		 Iterator<Student> iter=studentList.iterator();
		 while(iter.hasNext()){
			 if(iter.next().getName().equals(name))
			 {
				 iter.remove();
				 ps.setString(1,Student.getName());
				 System.out.println("The student "+ name +" details is deleted");
			 }
		 
		 }
		 int i=ps.executeUpdate();
		 }
	    
	 public void Displaymethod() throws SQLException
	 {
		 Connection con=DB.createConnection();
			PreparedStatement ps=con.prepareStatement("select * from Collection");
			
		 for (Student s: studentList)
			 System.out.println(s);
		 
	 }
}
