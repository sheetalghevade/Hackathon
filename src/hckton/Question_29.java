package hckton;

// to perform Merge sort using recursion

import java.util.Scanner;

public class Question_29 {
	public static void merge(int data[], int left, int right, int middle) {
		int first_data = middle - left + 1;
		int second_data = right - middle;
		int a = 0, b = 0, c = left;
		int Left[] = new int[first_data];
		int Right[] = new int[second_data];
		for (int x = 0; x < first_data; x++) {
		Left[x] = data[left + x];
		}
		for (int y = 0; y < second_data; y++) {
		Right[y] = data[middle + 1 + y];
		}
		while (a < first_data && b < second_data) {
		if (Left[a] < Right[b]) {
		data[c] = Left[a];
		a++;
		c++;
		} else {
		data[c] = Right[b];
		b++;
		c++;
		}
		}
		while (a < first_data) {
		data[c] = Left[a];
		a++;
		c++;
		}
		while (b < second_data) {
		data[c] = Right[b];
		b++;
		c++;
		}
		}
		public static void MergeSort(int data[], int start, int end) {
		if (start < end) {
		int middle = (end + start) / 2;
		MergeSort(data, start, middle);
		MergeSort(data, middle + 1, end);
		merge(data, start, end, middle);
		}
		}
		public static void Non_recursive_mergeSort(int data[], int start, int end) {
		int i = 2, j = 0;
		while (i < data.length) {
		j = 0;
		while (j < data.length - 1) {
		int right = (j + i) - 1;
		int left = j;
		if (right > data.length) {
		right = data.length - 1;
		}
		int middle = (left + right) / 2;
		merge(data, left, right, middle);
		j = j + i;
		}
		i = i * 2;
		if (i >= data.length) {
		i = i / 2;
		merge(data, 0, data.length - 1, (i - 1));
		i = data.length;
		}
		}
		}
		
		
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter N ( how many numbers to be sorted)");
		int n = sc.nextInt();
		int [] data=new int[n];
		System.out.println("Enter "+n+ " numbers 1 by 1");
		for (int i=0 ; i<n; i++)
		{
		int number = sc.nextInt();
		data[i]=number;
		}
		System.out.print("List before sorting n");
		System.out.println();
		for (int i = 0; i < n; i++) {
		System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("After sorting, numbers are ");
		System.out.println();
		MergeSort(data, 0, data.length - 1);
		for (int i = 0; i < n; i++) {
		System.out.print(data[i] + " ");
		}
		sc.close();
		}

}
