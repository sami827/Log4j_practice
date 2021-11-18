package demo;

public class practice {

	public static void main(String[] args) {

		String input = "this is a string";
		String output = reverse(input);

		System.out.println(output);

	} 

	private static String reverse(String input) {
		String reverse = "";

		if (input.isEmpty()) {
			System.out.println("The input is empty");
		}

		if (input.length() == 1) {
			reverse = input;
		} else {
			String[] textArray = input.split("\\s+");

			for (String text : textArray) {

				reverse = text + " "+ reverse;
			}
		}

		return reverse;
	}

}
