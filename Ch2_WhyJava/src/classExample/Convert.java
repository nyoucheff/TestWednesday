package classExample;

import java.util.Scanner; 
public class Convert { 
 public static void main (String [] args) {
  	Scanner reader = new Scanner (System.in);
  	double Fahrenheit;
  	double Celsius; 
  	System.out.print("Enter the degrees Fahrenheit: ");
  	Fahrenheit = reader.nextDouble ();	
  	Celsius = (Fahrenheit - 32) * 5.0/9.0; 
  	System.out.print("the equivalent in Celsius is ");
  	System.out.println (Celsius);
  	
  	reader.close();
  	}
}
