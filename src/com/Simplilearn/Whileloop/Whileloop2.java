package com.Simplilearn.Whileloop;

public class Whileloop2 {

	public static void main(String[] args) {
		int numArr [] = {10,20,30,40,50};
		int i = 0;
		while(i < 5) {
			System.out.println("The index:" +i);
			System.out.println("The value:"+numArr[i]);
			i =i+1;
		}
		System.out.println("-----------------------------");
		//create while loop to sum an array
		int sum = 0;
		int j=0;
		while(j < numArr.length) {
			sum = sum + numArr[j];
			j++;
		}
		System.out.println("The sum is:"+sum);
	}

}
