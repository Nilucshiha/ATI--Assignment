package atiAssignment;

public class Structure2 {

	public static void main(String[] args) {
		 int i, j;
	     int n = 5; // Star
	     for(i=1; i<n; i++) 
	        { 
	            for(j=1; j<=i; j++) 
	            { 
	                System.out.print("*"); 
	            } 
	            	i=i+1;
	            	System.out.println(); 
	        } 
	        
	        for(i=n; i>=1; i--) 
	        { 
	            for(j=1; j<=i; j++) 
	            { 
	                System.out.print("*"); 
	            } 
	            	i=i-1;
	            	System.out.println(); 
	        } 
	}

}
