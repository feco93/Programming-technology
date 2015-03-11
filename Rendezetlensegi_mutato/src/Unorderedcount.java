import java.util.ArrayList;
import java.util.Scanner;


public class Unorderedcount {
	
	private static int ComputeUnorderedCount(ArrayList<Integer> a) {
		int count=0;
		for (int i = 0; i < a.size(); ++i) {
			for (int j = i+1; j < a.size(); ++j) {
				if (a.get(i) > a.get(j))
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		try(Scanner sr = new Scanner(System.in)) {
			while(sr.hasNextLine()) {
				String line = sr.nextLine();
				ArrayList<Integer> vektor = new ArrayList<>();
				try(Scanner linescanner = new Scanner(line)) {
					while (linescanner.hasNextInt()) {
						int number = linescanner.nextInt();
						vektor.add(number);
					}
				}
				System.out.println(ComputeUnorderedCount(vektor));
			}
		}

	}

}
