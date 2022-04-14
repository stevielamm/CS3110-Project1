
import java.util.Scanner;

public class Floats {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Press q to quit " + "\nor");
		System.out.print("Please enter a string: ");

		String floats = scan.nextLine();
		if (floats.equals("q")) {

			System.out.print("exited program");
			System.exit(0);

		}

		// checks if string contains a f. F, d, or D or _
		if (floats.contains("f") || floats.contains("F") || floats.contains("d") || floats.contains("D")) {

			floats = floats.replace("f", " ");
			floats = floats.replace("F", " ");
			floats = floats.replace("d", " ");
			floats = floats.replace("D", " ");
			floats = floats.replace(" ", "");
			System.out.println("float -> " + floats);

		}

		// check if string is an integer
		else if (floats.matches(".*[0-9].*") && (!floats.matches("^\\s*\\d+(?:\\.\\d+)?\\s*[a-zA-Z]+$"))) {
			System.out.println("float -> " + floats);

		}
		if (floats.matches("^\\s*\\d+(?:\\.\\d+)?\\s*[a-zA-Z]+$")) {
			System.out.println("reject");
			System.exit(0);

		}
		if (floats.contains("_") || (floats.contains("-") || (floats.contains("..")))) {
			System.out.println("reject");
			System.exit(0);

		}

		// check if string is in scientific notation and splits it into two parts
		if (floats.matches("^(-?\\d+)\\.?\\d+(e-|e\\+|e|\\d+)\\d+$")) {
			System.out.println("This is in scientific notation");
			String[] arrOfStr = floats.split("[e]");
			String part1 = arrOfStr[0];
			String part2 = arrOfStr[1];

			System.out.println("decimal: " + part1);
			System.out.println("exponent: " + part2);
			double str1 = Double.parseDouble(part1);
			double str2 = Double.parseDouble(part2);

			System.out.println(str1 * Math.pow(10, str2));

		}

	}
}
