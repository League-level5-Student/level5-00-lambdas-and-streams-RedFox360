package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
//		printCustomMessage((s)->{
//			for(int i = 0; i < 10; i++) {
//				System.out.println(s);
//			}
//		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((String s) -> {
			System.out.println(new StringBuilder(s).reverse().toString());
		}, "banana");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((String s) -> {
			boolean uppercase = true;
			for (char letter : s.toCharArray()) {
				if (uppercase) {
					System.out.print(Character.toUpperCase(letter));
				} else {
					System.out.print(Character.toLowerCase(letter));
				}

				uppercase = !uppercase;
			}

			System.out.print('\n');
		}, "apples are tasty");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((String s) -> {
			for (char letter : s.toCharArray()) {
				System.out.print(letter + ".");
			}
			System.out.print('\n');
		}, "apples are tasty");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.

		printCustomMessage((String s) -> {
			for (char letter : s.toCharArray()) {
				if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
					System.out.print(letter);
				}
			}
			System.out.print('\n');
		}, "apples are tasty");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
