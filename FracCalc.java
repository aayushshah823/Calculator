 import java.util.Scanner;
/**
 * @author Aayush Shah
 * @version Frac Calc Project
 */
 public class FracCalc {
	 
	/**
	 * The main method should accept user input, calculate the results, and
	 * print results to the screen. It should terminate when the user enters
	 * "quit".
	 */
	public static void main(String[] args) 
	{
		//System.out.println("2 + 2 = ");
	//	System.out.println(calculate("2 + 2"));
		
		System.out.println("Type in the numbers below");
		Scanner sc = new Scanner(System.in);
		String theNumberIInput = "";
				
		while(!theNumberIInput.equals("quit"))
		{
			
			theNumberIInput = sc.nextLine();
			if (theNumberIInput.equals("quit"))
			{
				System.out.println("Check back later, GoodBye..!!");
			}
			else
			{
				calculate(theNumberIInput);
			}
		}
			
	}
	
	/**
	 * Performs fractional arithmetic
	 * Precondition: input will be a String that begins with an integer or
	 *   fraction, followed by a space, followed by an operator (+, -, *, or /),
	 *   followed by a space, followed by an integer or fraction 
	 * @param line User input (example: "2 + 2" or "1/2 * -1_3/4")
	 * @param Fraction 
	 * @return calculated value based on user input (example: 4 or -7/8)
	 */
	public static Fraction calculate(String line)
	{
		String operator;
		String leftHandSide;
		String rightHandSide;
		int spaceOffset;
		
		
		spaceOffset = line.indexOf(" ");
		
		
		leftHandSide = line.substring(0, spaceOffset);
				
		operator = line.substring(spaceOffset+1, spaceOffset+2);
		
		
		rightHandSide = line.substring(spaceOffset+3);
		
		
		Fraction f = new Fraction(leftHandSide);
	   
	    
	    Fraction f1 = new Fraction(rightHandSide);
	   
	    
	   Fraction result;
	   if(operator.equals("+"))
	   {
		   result = f.add(f, f1);
		   result.reduce(f, f1);
		   System.out.println(result);
		   
	   }
	   
	   else if(operator.equals("-"))
	   {
		   result = f.subtract(f, f1);
		   result.reduce(f, f1);

		   System.out.println(result);
	   }
	   
	   else if(operator.equals("*"))
	   {
		   result = f.multiply(f, f1);
		   result.reduce(f, f1);
		   System.out.println(result);
	   }
	   
	   else
	   {
		   result = f.divide(f, f1);
		   result.reduce(f, f1);
		   System.out.println(result);
	   }
	   
		return result;
	}
}