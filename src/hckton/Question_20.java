package hckton;

import java.util.Scanner;

public class Question_20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println(" enter ur string \n");
		String inputString=input.nextLine();
		int[] occured=new int[128];
		for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i)!=' ')
				occured[inputString.charAt(i)]++;
				}
				for(int j=0;j<occured.length;j++){
				if(occured[j]>1 && ( j >=48 &&j<= 57)){
				System.out.println((char)(j) + " integer and is repeated "+occured[j]+ " times"
				);
				}
				if(occured[j]>1 && ( j >=65 &&j<= 90)){
				System.out.println((char)(j) + " Upper Case character and is repeated "+occured[j]+ " times" );
				}
				if(occured[j]>1 && ( j >=97 &&j<= 122)){
				System.out.println((char)(j) + " Lower Case character and is repeated "+occured[j]+ " times" );
				}
				}
				input.close();
				}
	
	
	
}
