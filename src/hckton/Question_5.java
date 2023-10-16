package hckton;

import java.util.Arrays;
import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		l=sc.nextInt();
		int a[]=new int [l];
		System.out.println("Enter the "+l+ " integer values: ");
		for(int i=0;i<l;i++)
		{
		a[i]=sc.nextInt();
		}
		sc.close();
		Question_5 q=new Question_5();
		q.findout(l,a);
	}
	public void findout(int s, int b[])
	{
	Arrays.sort(b);
	
	for(int i=0;i<s;i++)
	{
	int count=1;
	for(int j=i+1;j<s;j++)
	{
	if (b[j]==b[j-1])
	{
	count ++;
	i++;
	}
	else
	break;
	}
	if(count==1)
	{
	System.out.println(b[i]+" is unique no.");
	}
	else
	{
	System.out.println("The occurence of "+b[i]+" is "+count);
	}
	}
	System.out.println("Sorted array is "+	Arrays.toString(b));

	}

}
