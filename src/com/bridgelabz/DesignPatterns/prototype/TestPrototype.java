package com.bridgelabz.DesignPatterns.prototype;

import java.util.List;

public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee empObject=new Employee();
		empObject.readData();
		
		//using clone method to get the Employee object
		Employee empNewObj=(Employee) empObject.clone();
		Employee empNewObj1=(Employee) empNewObj.clone();
		
		List<String> list=empNewObj.getEmpList();
		list.add("FlASH");
		
		List<String> list1=empNewObj1.getEmpList();
		list1.remove("Lisa");
		
		System.out.println("empObject List"+empObject.getEmpList());
		System.out.println("empNewObj List"+list);
		System.out.println("empNewObj1 List"+list1);
	}
}
