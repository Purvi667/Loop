package com.Simplilearn.dowhileloop;

public class Dowhileloop3 {

	public static void main(String[] args) {
		String students[]= {"Bob","John","James"};
		int index =0;
		do {
			System.out.println("The player No:" +index +"and name is:"+students[index]);
			index++;
		}while(index < students.length);




System.out.println("--------------");
int ind=0;
String searchstud="John";
String replacestud="Raju";
do {


	System.out.println("The student:" +students[ind]);
	
	if(searchstud.equals(students[ind])) {
		students[ind]=replacestud;
		
	}
	ind++;
	
	}while(ind<students.length); 

	
	


System.out.println("After replacing:");
int i=0;
do {
	System.out.println("The player No:" +index +"and name is:"+students[i]);
	i++;
}while(i < students.length);
	}
}

