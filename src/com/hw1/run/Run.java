package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] employeeArr = new Employee[3];
		employeeArr[0] = new Employee();
		employeeArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		employeeArr[2] = new Employee(2, "김말순", "교육부", "강사", 20, 'F', 100000, 0.01, "01011112222", "서울 마곡");
		
		System.out.println(employeeArr[0].information());
		System.out.println(employeeArr[1].information());
		System.out.println(employeeArr[2].information());
		
		System.out.println("================================================");
		
		employeeArr[0].setEmpNo(0); 
		employeeArr[0].setEmpName("홍길동");
		employeeArr[0].setDept("");
		employeeArr[0].setJop("");
		employeeArr[0].setAge(0);
		employeeArr[0].setGender('m');
		employeeArr[0].setSalary(0);
		employeeArr[0].setBonusPoint(0.0);
		employeeArr[0].setPhone("");
		employeeArr[0].setAddress("");
		
		
		
		
	}

}
