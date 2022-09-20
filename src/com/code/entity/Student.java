package com.code.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Student_Id")	
int student_id;
	
	@Column(name="name")		
String name;
	@Column(name="country")	
String country;
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Student()
{
	
}
public Student(int student_id, String name, String country, String department) {
	
	this.student_id = student_id;
	this.name = name;
	this.country = country;
	this.department = department;
}

public Student(String name, String country, String department) {
	this.name = name;
	this.country = country;
	this.department = department;
}

@Override
public String toString() {
	return "student [student_id=" + student_id + ", name=" + name + ", country=" + country + ", department="
			+ department + "]";
}



@Column(name="department")	
String department;

}

