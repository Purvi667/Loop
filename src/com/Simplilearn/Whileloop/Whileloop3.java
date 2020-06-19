package com.Simplilearn.Whileloop;

public class Whileloop3 {

	public static void main(String[] args) {
		//list of IP's
		String ips[] = {"198.168.2.3","198.168.2.13","198.168.2.23","198.168.2.33","198.168.2.43"};
		int index=0;
		
		while(index<ips.length) {
			System.out.println("The Ip:" +ips[index]);
			index++;
		}
		System.out.println("--------------");
		int ind=0;
		String searchip="198.168.2.23";
		String replaceip="198.168.2.123";
		while(ind<ips.length) {
			System.out.println("The Ip:" +ips[ind]);
			
			if(searchip.equals(ips[ind])) {
				ips[ind]=replaceip;
			}
			ind++;
			
		}
	
		System.out.println("After replacing:");
		int i=0;
		while(i<ips.length) {
			System.out.println("The Ip:" +ips[i]);
			i++;
		}
}
}