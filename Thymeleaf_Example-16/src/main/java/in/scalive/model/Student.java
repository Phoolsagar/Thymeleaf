package in.scalive.model;

public class Student {
 private String gender;
 private String name;
 private String course;

 
 public Student(String gender, String name, String course) {
	this.gender = gender;
	this.name = name;
	this.course = course;
}

 public Student() {

	
 }
 

 public String getGender() {
	return gender;
}

 public void setGender(String gender) {
	this.gender = gender;
 }

 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public String getCourse() {
	return course;
 }
 public void setCourse(String course) {
	this.course = course;
 }
 
 
}
