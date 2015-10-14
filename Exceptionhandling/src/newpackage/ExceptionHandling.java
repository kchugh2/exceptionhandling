package newpackage;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		 
		  int a, b, result=0;
		 
		  Scanner input = new Scanner(System.in);
		  try{
		  System.out.println("Input two integers");
		 
		  a = input.nextInt();
		  b = input.nextInt();
		  
		  if(b==0)
			  //throw new Exception("Zero Entered");
			  
		  result = (a / b);
		  } catch(Exception e){
			  System.out.println("Second integer must not be zero");
	      }finally{
	    		  input.close();
	      }
		 
		 
		  System.out.println("Result = " + result);
		  }
}
