import java.util.*;
public class Combination
{
// Function to print all sub strings
public static void Substring(String str, int len) 
{
    // Pick starting point
	
    for (int n = 0; n <= len-1; n++) 
    {    
        // Pick ending point
        for (int i = 0; i <= len - n-1; i++) 
        {
            int j = i + n ;
            for (int k = i; k <= j; k++) 
               {
		 System.out.print( str.charAt(k));
             	}
           System.out.print("\n");
        }
    }
}
 
// Driver program to test above function
public static void main(String args[]) 
{
	Scanner sc = new Scanner(System.in);
    	String str = "";
	System.out.println("Enter the String : ");
	str=sc.next();
	Substring(str,str.length());
	//System.out.println( str.length());
	//System.out.println(str.charAt(0));
    	//System.out.println("\nStatus of case Test is " + Substring(str, str.length()));
	//sc.nextLine();
    
}
}
