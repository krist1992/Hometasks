/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    
	public static void main (String [] args) {
	   
	    Scanner in = new Scanner (System.in);
		System.out.println("Enter User Name: ");
		String userName = in.nextLine ();
		
		System.out.printf ("Hello, %s!", userName);

	}
}
