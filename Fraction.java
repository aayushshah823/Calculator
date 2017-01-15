/**
 * @author Aayush Shah
 * @version Frac Calc Project
 */
public class Fraction
{
	// Declare some private variables here
	private int num1;
	private int den1;
	
	/**
	 * Constructs a Fraction from the given String
	 * @param f Initial fraction. Can be an integer (like "4"), a fraction
	 *   (like "1/2"), or a mixed number (like "1_5/8")
	 */
	public Fraction(String f) 
	{
		// Your code goes here
		String num;
		String den;
		String wholeFraction = "0";
		 
		if(f.contains("_")) 
		{
			int c = f.indexOf("_");
			wholeFraction = f.substring(0, c);
			
			int e = f.indexOf("/");
			num = f.substring(c+1, e);
			
			den = f.substring(e+1);
		
		}
		
		else if(f.contains("/"))
		{
			int i = f.indexOf("/");
			num = f.substring(0, i);
					
			
			den = f.substring(i+1);
					
		}
		
		else
		{
			num = f.substring(0);
			
			den = "1";
			
		}
		
		num1 = Integer.parseInt(num);
				
		den1 = Integer.parseInt(den);
				
		num1 = ((den1*Integer.parseInt(wholeFraction)) + num1);
	  }

	/**
	 * Constructs a Fraction with the given numerator and denominator
	 * @param num The numerator of the fraction
	 * @param den The denominator of the fraction
	 */
	public Fraction(int num, int den)
	{
		// Your code goes here
		num1 = num;
		den1 = den;
	
	}
		
	/**
	 * Constructs a new Fraction with the given numerator and denominator
	 * For instance "1/2 + 1/2" would be a new fraction that is "2"
	 * @param f The fraction on left hand side
	 * @param f1 The fraction on right hand side
	 * @return the answer as a new fraction
	 */
	public Fraction add(Fraction f, Fraction f1)
	{
		if(f.den1 == 0)			
    	{
    		System.out.println("LHS is undefined, you cannot divide any number by zero.");
    		System.out.print("Ans is:" + " ");
    		return new Fraction(f1.num1,f1.den1 );
    	}
		
		else if (f1.den1 == 0)
		{
			System.out.println("RHS is undefined, you cannot divide any number by zero.");
			System.out.print("Ans is:" + " ");
    		return new Fraction(f.num1,f.den1 );
		}
		
		else if (f.num1 == 0)
		{
			//System.out.println("LHS is zero, because zero divided by anything is 0.");
			System.out.print("Ans is:" + " ");
    		return new Fraction(f1.num1,f1.den1 );
		}
		
		else if (f1.num1 == 0)
		{
			//System.out.println("RHS is zero, because zero divided by anything is 0.");
			System.out.print("Ans is:" + " ");
    		return new Fraction(f.num1,f.den1 );
		}

	
		else if(f.den1 != f1.den1)
    	{
			System.out.print("Ans is:" + " ");
    		return new Fraction((f.num1*f1.den1 + f.den1*f1.num1),(f.den1*f1.den1));
    	}
		
    	else              										
    	{
    		System.out.print("Ans is:" + " ");
    		return new Fraction((f.num1+f1.num1),(f.den1));   	
    	}
	}	
	
	/**
	 * Subtracts the fraction based on given numerator and denominator
	 * For example, "1/2 - 1" would become "-1/2"
	 * @param f The fraction on left hand side
	 * @param f1 The fraction on right hand side
	 * @return the answer as a new fraction
	 */
	
	public  Fraction subtract(Fraction f, Fraction f1)
	{
	    if(f.den1 == 0 )			
	    {
	         System.out.println("LHS is undefined, you cannot divide numerator by zero.");
	         System.out.print("Ans is:" + " ");
	         return new Fraction(f1.num1,f1.den1 );
	    }
	    
	    else if (f1.den1 == 0)
		{
			System.out.println("RHS is undefined, you cannot divide any number by zero.");
			System.out.print("Ans is:" + " ");
    		return new Fraction(f.num1,f.den1 );
		}
		
		else if (f.num1 == 0)
		{
			System.out.print("Ans is:" + " ");
    		return new Fraction(f1.num1,f1.den1 );
		}
		
		else if (f1.num1 == 0)
		{
			System.out.print("Ans is:" + " ");
    		return new Fraction(f.num1,f.den1 );
		}
	  	    
	    else if(f.den1 != f1.den1)
	    {
	    	System.out.print("Ans is:" + " ");
	    	 return new Fraction((f.num1*f1.den1 - f.den1*f1.num1),(f.den1*f1.den1));
	    }
	   
	    else                        			 
	    {
	    	System.out.print("Ans is:" + " ");
	    	 return new Fraction((f.num1-f1.num1),(f.den1));
	    }
	}
	
	/**
	 * Multiplies both fraction from given numerator and denominator
	 * For example, "1/2 * 2" would become "1" - a new fraction 
	 * @param f The fraction on left hand side
	 * @param f1 The fraction on right hand side
	 * @return the answer as a new fraction 
	 */
	
	public Fraction multiply(Fraction f, Fraction f1)
	{
		 
	       if(f.den1 == 0 || f1.den1 == 0 || f.num1 == 0 || f1.num1 == 0)
	       {
	            System.out.println("The answer is:" + 0); 
	            return null;
	       }
	       
	       else if (f.den1 < 0 || f1.den1 < 0 || f.num1 < 0 || f1.num1 < 0)
	       {
	    	   System.out.print("Ans is:" + " ");
	    	   return new Fraction((f.num1*f1.num1),(f.den1*f1.den1));
	       }
	       else
	       {
	    	   System.out.print("Ans is:" + " ");
	    	   return new Fraction((f.num1*f1.num1),(f.den1*f1.den1));
	       }
	       
	 }
	
	/**
	 * Divides the fraction from given numerator and denominator
	 * For example, "1/2 / 2" would become "1/4"
	 * @param f The fraction on left hand side
	 * @param f1 The fraction on right hand side
	 * @return the answer as a new fraction 
	 */
	
	 public  Fraction divide(Fraction f, Fraction f1)
	 {
		 if ((f.num1*f1.den1 == 0) || (f.den1*f1.num1 == 0))
		 {
			 System.out.println("Undefined, you cannot divide any number by zero.");
			 return null;
		 }
		 
		 else if((f.num1 < 0) || (f.den1 < 0) || (f1.num1 < 0) || (f1.den1 < 0))
		 {
			 System.out.print("Ans is:" + " ");
			 return  new Fraction((f.num1*f1.den1),(f.den1*f1.num1));
		 }
		 else
		 {
			 System.out.print("Ans is:" + " ");
			 return  new Fraction((f.num1*f1.den1),(f.den1*f1.num1));	 
		 }
		       
	 }
	 
	// calculate the GCD (greatest common divisor)
	 
	 public int gcd(int a, int b) 
	 { 
	        
	       if (a == 0) { return b; } 
	       if (b == 0) { return a; } 
	       return gcd(b, a % b); 
     } 

	 /**   
	  * Returns the reduced Fraction
	  * @param f The fraction on left hand side
	  * @param f1 The fraction on Right hand side
	  */ 

	 public void reduce(Fraction f, Fraction f1){
		    int gcf = 1, smaller;
		    if (num1 < den1)
		    {
		        smaller = num1;
		    }
		    else{
		        smaller = den1;
		    }
		    for (int i = 1; i <= smaller; i++)
		    {
		        if(num1 % i == 0 && den1 % i ==0)
		        {
		            gcf = i;
		        }
		    }
		    num1 = num1 / gcf;
		    den1 = den1 / gcf;
	 
	 }
	 
	 
	
	/**
	 * Returns the Fraction as a String, as a lowest-terms mixed number
	 * For example, "1_1/2" would be valid output, while "3/2" or "1_2/4"
	 * would both be invalid.
	 */
	   public String toString() 
	   {
		// TODO: replace this with something better
		   if (num1 == 0 || den1 == 0)
		   {
			   System.out.print("");
		   }
		   
		   if (num1 % den1 == 0) 
	       { 
	           return Integer.toString(num1 / den1); 
	       } 
		
		   else if(num1 / den1 == 0)
		   {
			   return num1 + "/" + den1;
		   }
		   
		   else 
	        { 
	            return (num1 / den1) + "_" + (num1 % den1) + "/" + den1; 
	        } 
	   }
}