package homework12;
import java.util.Arrays;
import java.util.Scanner;
public class task3 {

	
	      public static void main(String[ ] args)
	      {
	    	  
	    	  Scanner input = new Scanner(System.in,"UTF-8");
	  		System.out.println("Please enter text:");
	  		String ss = input.nextLine();
	  		String[] names = ss.split(" ");

	             sortStringExchange (names);
	               for ( int k = 0;  k < names.length;  k++ )
	                 System.out.println( names [ k ] );
	       }
	     
	       public static void sortStringExchange( String  x [ ] )
	       {
	             int i, j;
	             String temp;

	            for ( i = 0;  i < x.length - 1;  i++ )
	             {
	                 for ( j = i + 1;  j < x.length;  j++ )
	                 {  
	                          if ( x [ i ].compareToIgnoreCase( x [ j ] ) > 0 )
	                           {                                             
	                                       temp = x [ i ];
	                                       x [ i ] = x [ j ];    
	                                       x [ j ] = temp; 
	                                       
	                            } 
	                    } 
	              } 
	       } 
	 }