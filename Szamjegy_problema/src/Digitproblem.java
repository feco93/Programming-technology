import java.util.Scanner;

public class Digitproblem {

	private static void Countdigits(String[] lines) {
		int[] digits = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < lines.length; ++i) {
			for (int j = 0; j < lines[i].length(); ++j) {
				switch (lines[i].charAt(j)) {
				case '0':
					digits[0]++;
					break;
				case '1':
					digits[1]++;
					break;
				case '2':
					digits[2]++;
					break;
				case '3':
					digits[3]++;
					break;
				case '4':
					digits[4]++;
					break;
				case '5':
					digits[5]++;
					break;
				case '6':
					digits[6]++;
					break;
				case '7':
					digits[7]++;
					break;
				case '8':
					digits[8]++;
					break;
				case '9':
					digits[9]++;
					break;
				}
			}
		}
	
		System.out.format("%d %d %d %d %d %d %d %d %d %d%n",
				digits[0],digits[1],digits[2],digits[3],digits[4],
				digits[5],digits[6],digits[7],digits[8],digits[9]);
		
	}

	public static void main(String[] args) {
		try (Scanner sr = new Scanner(System.in)) {
			while (sr.hasNextInt()) {
				int N = sr.nextInt();
				if (N == 0)
					break;
				String[] lines = new String[N];
				for (int i = 0; i < N; ++i) {
					lines[i] = String.valueOf(sr.nextInt());
				}
				Countdigits(lines);
			}
		}

	}

}
