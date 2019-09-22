import java.util.Scanner;

public class Encrypter_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int first;
		int second;
		int third;
		int fourth;
		
		System.out.print("Enter first digit: ");
		first = in.nextInt();
		
		System.out.print("Enter second digit: ");
		second = in.nextInt();
		
		System.out.print("Enter third digit: ");
		third = in.nextInt();
		
		System.out.print("Enter fourth digit: ");
		fourth = in.nextInt();
		
		System.out.print("Your four digit code is: " + first + second + third + fourth );
		
		int newFirst = (first + 7) % 10;
		int newSecond = (second + 7) % 10;
		int newThird = (third + 7) % 10;
		int newFourth = (fourth + 7) % 10;
		
		int tempVal = newFirst;
		newFirst = newThird;
		newThird = tempVal;
		
		int secondTempVal = newSecond;
		newSecond = newFourth;
		newFourth = secondTempVal;
		
		
		
		System.out.print("\nThe encrypted four-digit code is: " + newFirst + newSecond + newThird + newFourth);
	}

}
