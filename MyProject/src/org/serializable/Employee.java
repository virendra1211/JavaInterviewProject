package org.serializable;
import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -179812851346930637L;
	private int id;
	private String name;
	private String email;
	private Double salary;
	private double ids;
	private static int myid=5001;
	
	/*
		if student is not serialized then will get java.io.NotSerializableException: while deserializing or serializing the object
	 */
	/// private  transient Student stu = new Student(); ** even when deserialize will get null
	private   Student stu = new Student();
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public static int getMyid() {
		return myid;
	}
	public static void setMyid(int myid) {
		Employee.myid = myid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}