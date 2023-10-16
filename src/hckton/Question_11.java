package hckton;
import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String string_input = read.nextLine();
		
		read.close();
		
		
		if(string_input.isBlank()) {
			System.out.println("No String entered");
		}
			
			else {
				String array[] = string_input.split("is");
				System.out.println("string split array:  ");
				for(String i : array) {
				System.out.println(i);
				}
				
			}
		}

	}
