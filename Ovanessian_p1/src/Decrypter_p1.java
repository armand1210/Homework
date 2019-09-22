import java.util.Scanner;

public class Decrypter_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int first;
		int second;
		int third;
		int fourth;
		
		System.out.print("Enter encrypted first digit: ");
		first = in.nextInt();
		
		System.out.print("Enter encrypted second digit: ");
		second = in.nextInt();
		
		System.out.print("Enter encrypted third digit: ");
		third = in.nextInt();
		
		System.out.print("Enter encrypted fourth digit: ");
		fourth = in.nextInt();
		
		System.out.print("The encrypted four digit code is: " + first + second + third + fourth );
		
		int newFirst = (first + 10) - 7;
		int newSecond = (second + 10) - 7;
		int newThird = (third + 10) - 7;
		int newFourth = (fourth + 10) - 7;
		
		int tempVal = newFirst;
		newFirst = newThird;
		newThird = tempVal;
		
		int secondTempVal = newSecond;
		newSecond = newFourth;
		newFourth = secondTempVal;
		
		System.out.print("\nThe decrypted four-digit code is: " + newFirst + newSecond + newThird + newFourth);
	}

}
