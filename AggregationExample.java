package com.agg;

public class AggregationExample {
	//control+space+enter
	public static void main(String[] args) {
		Address address=new Address("vizag","AP","India");
		Employee e=new Employee(1,"anusha",address);
		System.out.println(e.toString());
	}
	
}
