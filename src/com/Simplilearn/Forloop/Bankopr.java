package com.Simplilearn.Forloop;

public class Bankopr {
	 static int  account []= {101,102,103,104,105,106};
	static String accountname []= {"john","Mike","Devit","Will","Sam","Marry"};
	 static double accountbalance []= {10000,20000,30000,40000,50000,60000};


	public static void main(String[] args) {
		Bankopr.showbalance(103);
		Bankopr.depositbalance(103,700000);
	}
	public static void showbalance(int accountno) {
	for(int i=0;i<Bankopr.account.length;i++) {
		if(Bankopr.account[i]==accountno) {
			System.out.println("the account number:"+Bankopr.account[i]+"account name:"+Bankopr.accountname[i]+"account balance:"+Bankopr.accountbalance[i]);
			;
			
		}
	}
}
	public static void depositbalance(int accountno,double amount) {
		for(int i=0;i<Bankopr.account.length;i++) {
			if(Bankopr.account[i]==accountno) {
				Bankopr.accountbalance[i]=Bankopr.accountbalance[i]+amount;
				System.out.println("the account number:"+Bankopr.account[i]+"account name:"+Bankopr.accountname[i]+"account balance:"+Bankopr.accountbalance[i]);
				;
				
			}
		}
	}
}
