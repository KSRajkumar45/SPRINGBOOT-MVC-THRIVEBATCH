package com.example.demo.domain;

import javax.persistence.Entity;  
import javax.persistence.Id;
import javax.persistence.Table;  
@Entity  
@Table(name="Studentdb")
public class Studentdomain {  
    @Id  
    private long id;  
    private String name;  
    private String dpt;
   
	private String email;
	
    public Studentdomain(){}  
    
    public long getId() {  
        return id;  
    }  
    public void setId(long id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
}