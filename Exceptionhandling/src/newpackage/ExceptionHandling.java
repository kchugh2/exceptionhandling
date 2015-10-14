package newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		 
		  int a, b, result=0;
		  String filename = (System.getProperty("user.dir") + File.separatorChar +"Integerdivision.txt");
			System.out.println(filename);
		        
		    PrintWriter writer = null;
			try {
				writer = new PrintWriter(new File(filename));
			} catch (FileNotFoundException e) {
				System.out.println("File does not exist!");
			}
			
		  Scanner input = new Scanner(System.in);
		  try{
		  System.out.println("Input two integers");
		 
		  a = input.nextInt();
		  b = input.nextInt();
		  
		  /*if(b==0)
			  //throw new Exception("Zero Entered");*/
			  
		  result = (a / b);
		  writer.println(result);
		  System.out.println(result);
		  } 
		  catch(Exception e){
			  System.out.println("Second integer must not be zero");
	      }finally{
	    		  input.close();
	    		  writer.close();
	      }
		 
		 
		  System.out.println("Result = " + result);
		  }
}
