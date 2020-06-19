package com.Simplilearn.Forloop;

public class Forloop2 {

	public static void main(String[] args) {
		double salary []= {10000,20000,30000,40000};
		double totalsal=0.0;
		double avgsal=0.0;
		for(int index=0;index<salary.length;index++){
			System.out.println("The employee :"+index+"salary is:"+salary[index]);
			totalsal = totalsal+salary[index];
		}
		avgsal=totalsal/salary.length;
		System.out.println("Te total salary is:"+totalsal);
		System.out.println("Te average salary is:"+avgsal);
	}

}
