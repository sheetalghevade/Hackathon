package hckton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Question_31 {
	
	public static void main(String[] args) throws FileNotFoundException {
	String	path1="C:\\Users\\gheva\\OneDrive\\Desktop\\Selenium\\File1.txt";
	String	path2="C:\\Users\\gheva\\OneDrive\\Desktop\\Selenium\\File2.txt";
	try {
	BufferedReader input = new BufferedReader(new
	FileReader(path1));
	ArrayList list = new ArrayList();
	String line;
	while ((line = input.readLine()) != null) {
	list.add(line);
	}
	input.close();
	Collections.reverse(list);
	PrintWriter output = new PrintWriter(new
	BufferedWriter(new FileWriter(path2)));
	for (Iterator i = list.iterator(); i.hasNext();)
	{
	output.println((String) i.next());
	}
	output.close();
	}
	catch (IOException e) {
	System.err.println(e);
	}
	/*try{
	File sourceFile=new File(path1);
	Scanner content=new Scanner(sourceFile);
	PrintWriter pwriter =new PrintWriter(path2);
	while(content.hasNextLine())
	{
	String s=content.nextLine();
	StringBuffer buffer = new StringBuffer(s);
	buffer=buffer.reverse();
	String rs=buffer.toString();
	pwriter.println(rs);
	}
	content.close();
	pwriter.close();
	System.out.println("File is copied successful!");
	}
	catch(Exception e){
	System.out.println("Something went wrong");
	}
	}*/
	}
}
