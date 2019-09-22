import java.util.Scanner;

public class BMI_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double kgweight;
		double mheight;
		double lbweight;
		double inchheight;
		double metBMI;
		double engBMI;
		
		System.out.println("Would you like to use metric calculator(1) or English calculator(2)? ");
		int response = in.nextInt();
		in.close();
		
		if (response != 2) {
			Scanner scnr = new Scanner(System.in);
			System.out.print("\nPlease enter your weight in kilograms: ");
			kgweight = scnr.nextDouble();
			
			System.out.print("\nPlease enter your height in centimeters: ");
			mheight = scnr.nextDouble();
			mheight = mheight / 100;
			
			metBMI = kgweight / Math.pow(mheight,2 );
			System.out.printf("\nYour BMI is %.2d ", metBMI);
			scnr.close();	
			
		}
		else
		{
			Scanner scnre = new Scanner(System.in);
			System.out.print("\nPlease enter your weight in pounds: ");
			lbweight = scnre.nextDouble();
			
			System.out.print("\nPlease enter your height in inches: ");
			inchheight = scnre.nextDouble();
			
			engBMI = 703 * (lbweight / Math.pow(inchheight,2 ));
			System.out.printf("\nYour BMI is %.2d ", engBMI);
			scnre.close();	
		}
		System.out.print("\nThe BMI Categories are as follows:");
		System.out.print("\nUnderweight = <18.5");
		System.out.print("\nNormal weight = 18.5-24.9");
		System.out.print("\nOverweight = 25-29.9");
		System.out.print("\nObesity = BMI of 30 or greater");
	}
	
}
