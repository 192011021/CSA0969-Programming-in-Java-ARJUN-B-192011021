import java.util.*;
import java.io.*;
public class vote
{
	public static void main(String[] args)
	{
	    try 
	    {
	        int a,b;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter your age:");
	        a=sc.nextInt();
	        if(a>=18)
	        {
	              System.out.println("You are eligible to vote");
	   
	         }
           if(a<0)
           {
                System.out.println("Enter only positive values");
            }
	    
	        else
	        {
	           b=18-a;
	           System.out.println("You are allowed after"+b+"years");
	         }
	        
	    }
	    catch(Exception e)
	    {
	        System.out.println("Entry only integer value");
	    }
	}
}
	    
	    
	