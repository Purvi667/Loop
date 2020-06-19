package com.Simplilearn.dowhileloop;

public class Dowhileloop2 {

	public static void main(String[] args) {
		String players[]= {"Sachin","Kholi","Usuf","Rena","Dhoni"};
		int index =0;
		do {
			System.out.println("The player No:" +index +"and name is:"+players[index]);
			index++;
		}while(index < players.length);

}
}