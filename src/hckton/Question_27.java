package hckton;

// to perform ascending order Quick sort

import java.util.Scanner;

public class Question_27 {
	
	private int[] array;
	private int[] tempMergArr;
	private int length;
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("enter size of your array");
	int size1=input.nextInt();
	int[] inputArr=new int[size1];
	System.out.println("please enter"+size1+" values ");
	for(int i=0;i<inputArr.length;i++){
	inputArr[i]=input.nextInt();
	}
	Question_27 prg = new Question_27();
	prg.sort(inputArr);
	System.out.print("Sorted Array: ");
	for(int i:inputArr){
	System.out.print(i);
	System.out.print(" ");
	}
	input.close();
	}
	public void sort(int[] inputArr) {
	this.array = inputArr;
	this.length = inputArr.length;
	this.tempMergArr = new int[length];
	doMergeSort(0, length - 1);
	}
	public void doMergeSort(int lowerIndex, int higherIndex) {
	if (lowerIndex < higherIndex) {
	int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	// Below step sorts the left side of the array
	doMergeSort(lowerIndex, middle);
	// Below step sorts the right side of the array
	doMergeSort(middle + 1, higherIndex);
	// Now merge both sides
	mergeParts(lowerIndex, middle, higherIndex);
	}
	}
	public void mergeParts(int lowerIndex, int middle, int higherIndex) {
	for (int i = lowerIndex; i <= higherIndex; i++) {
	tempMergArr[i] = array[i];
	}
	int i = lowerIndex;
	int j = middle + 1;
	int k = lowerIndex;
	while (i <= middle && j <= higherIndex) {
	if (tempMergArr[i] <= tempMergArr[j]) {
	array[k] = tempMergArr[i];
	i++;
	} else {
	array[k] = tempMergArr[j];
	j++;
	}
	k++;
	}
	while (i <= middle) {
	array[k] = tempMergArr[i];
	k++;
	i++;
	}
	}
}
