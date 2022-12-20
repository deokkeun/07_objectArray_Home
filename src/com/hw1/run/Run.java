package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] employeeArr = new Employee[3];
		employeeArr[0] = new Employee();
		employeeArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		employeeArr[2] = new Employee(2, "김말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		System.out.println(employeeArr[0].information());
		System.out.println(employeeArr[1].information());
		System.out.println(employeeArr[2].information());
		
		System.out.println("================================================");
		
		employeeArr[0].setEmpNo(0); 
		employeeArr[0].setEmpName("김말똥");
		employeeArr[0].setDept("영업부");
		employeeArr[0].setJop("팀장");
		employeeArr[0].setAge(30);
		employeeArr[0].setGender('M');
		employeeArr[0].setSalary(3000000);
		employeeArr[0].setBonusPoint(0.2);
		employeeArr[0].setPhone("01055559999");
		employeeArr[0].setAddress("전라도 광주");
		

		employeeArr[1].setDept("기획부");
		employeeArr[1].setJop("부장");
		employeeArr[1].setSalary(4000000);
		employeeArr[1].setBonusPoint(0.3);
		
		
		for(int x = 0; x < employeeArr.length - 1; x++) {
			System.out.println(employeeArr[x].information());
		}


		System.out.println("=================================================");
		
		int avg = 0;
		for(int i = 0; i < employeeArr.length; i++) {
			int num = 0;
			num = (int)(employeeArr[i].getSalary() + 
					(employeeArr[i].getSalary() * employeeArr[i].getBonusPoint())) * 12;
			avg += num;
			System.out.println(employeeArr[i].getEmpName() + "의 연봉 : " + num + "원");
		}
		
		System.out.println("=================================================");
		
		
		System.out.printf("직원들의 연봉의 평균 : %d원", avg / employeeArr.length);
		
		
	}

}
