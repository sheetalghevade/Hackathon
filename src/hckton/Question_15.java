package hckton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter input string");
		String[] str=scan.nextLine().split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for(String s: str){
		if(!al.contains(s)){
		al.add(s);
		}
		}
		Iterator<String> it= al.iterator();
		for(String s:al){
		System.out.print(it.next()+ " ");
		
		scan.close();
		}

	}

}
