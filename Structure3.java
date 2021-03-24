package atiAssignment;

public class Structure3 {

	public static void main(String[] args) {
		 int i, j;
	     int n = 7; //row
	    
	        for(i=1; i<=n; i++) 
	        { 
	            for(j=1; j<=i; ++j) 
	            { 
	                System.out.print(j); 
	            } 
	            while(j<8) {
	                System.out.print("*");
	                j++;
	            }
	            
	            	System.out.println(); 
	        } 
	        
	      
	}

}
