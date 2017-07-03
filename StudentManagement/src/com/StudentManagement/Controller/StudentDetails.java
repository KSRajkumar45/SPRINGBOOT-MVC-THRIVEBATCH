package com.StudentManagement.Controller;


import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;

import com.StudentManagement.service.Collections;

import com.StudentManagement.Dao.DB;

public class StudentDetails {

	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		int choice;
		
		Collections c=new Collections();
		do
		{
		System.out.println("Student Database creation");
		System.out.println("Select a choice:");	  
		System.out.println("1. Insert");	    
		System.out.println("2. Display");   	  
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		choice=scan.nextInt();
		
		switch(choice)
		{		
		case 1:
		{
			c.InsertMethod();
			break;
		}		 
		case 2:	
		{
			c.Displaymethod();
			break;
		}
		case 3:
		{
			c.UpdateMethod();
			break;
			
		}
		case 4:
		{
		    c.DeleteMethod();
		    break;
		    
		}
		case 5:
        {
            System.exit(0);
        }
		default:
		{
			System.exit(0);
		}
			
		 }
		 }while(choice!=5);
			
			}
	}
