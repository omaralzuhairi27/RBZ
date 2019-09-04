import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner scannar = new Scanner(System.in);

		int intNumber;
		double doubleNumber;
		float floatNumber;
		char charLetter;
		boolean booleanTest;
		String stringWord;
		System.out.println("Enter Integer number");
		intNumber = scannar.nextInt();
		System.out.println("Enter Float number");
		floatNumber = scannar.nextFloat();
		System.out.println("Enter Double number");
		doubleNumber = scannar.nextDouble();

		System.out.println("Enter a char");
		charLetter = scannar.next().charAt(0);
		scannar.nextLine();
		System.out.println("Enter a String");
		stringWord = scannar.nextLine();
//		System.out.println("Enter Boolean Value");
//		booleanTest = scannar.nextBoolean();

//		if (intNumber > 3 && floatNumber > 4.5) {
//			System.out.println("int und float korrekt");
//		} else if (doubleNumber <= 2.1 || booleanTest == true) {
//			System.out.println("Double oder boolean korrekt");
//		} else {
//			System.out.println("weder noch");
//		}

		 System.out.println(intNumber+" , " + doubleNumber +" , "+ floatNumber+" ,"+charLetter+" , "+stringWord);

	}

}
