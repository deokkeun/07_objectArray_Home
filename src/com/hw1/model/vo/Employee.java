package com.hw1.model.vo;

public class Employee {

	private int empNo;
	private String empName;
	private String dept;
	private String jop;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	
	public Employee() {}
	
	public Employee(int empNo, String empName, int age, char gender, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	public Employee(int impNo, String empName, String dept, String jop, int age, char gender, int salary, double bonusPoint, String phone, String address) {
		this.empNo = impNo;
		this.empName = empName;
		this.dept = dept;
		this.jop = jop;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	

//	- empNo : int // 사번
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
//	- empName : String // 사원명
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
//	- dept : String // 소속부서
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
//	- job : String // 직급
	public String getJop() {
		return jop;
	}
	
	public void setJop(String jop) {
		this.jop = jop;
	}
	
//	- age : int // 나이
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
//	- gender : char // 성별
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
//	- salary : int // 급여
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
//	- bonusPoint : double // 보너스포인트
	public double getBonusPoint() {
		return bonusPoint;
	}
	
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
//	- phone : String // 전화번호
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	- address : String // 주소
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String information() {
		String str = "emp[" + empNo + "] : " + empNo + ", " + empName + ", " + dept + ", " + jop + ", " + age
				 + ", " + gender + ", " + salary + ", " + bonusPoint + ", " + phone + ", " + address; 
		
		return str;
	}
	
	
	
	
	
	
	
	
}
