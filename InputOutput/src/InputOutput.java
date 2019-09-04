import java.util.Scanner;

public class InputOutput {

	
	public static void main(String[] args) {
		Scanner scannar = new Scanner (System.in);
		
		int intNumber;
		double doubleNumber;
		float floatNumber;
		char charLetter;
		boolean booleanValue;
		String stringWord;
		System.out.println("Enter Integer number");
		intNumber=scannar.nextInt();
		System.out.println("Enter Double number");
		doubleNumber=scannar.nextDouble();
		System.out.println("Enter Float number");
		floatNumber=scannar.nextFloat();
		System.out.println("Enter a char");
		charLetter=scannar.next().charAt(0);
		System.out.println("Enter a String");
		stringWord=scannar.next();
		System.out.println("Enter Boolean Value");
		booleanValue=scannar.nextBoolean();
		
		System.out.println(intNumber+" , " + doubleNumber +" , "+ floatNumber+" , "+charLetter+" , "+stringWord+" , "+ booleanValue);
		

	}

}
