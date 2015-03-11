import java.util.ArrayList;
import java.util.Scanner;

public class Orderedcount {

	private static int ComputeOrderedCount(ArrayList<String> a) {
		int maxcount = 1;
		int count = 1;
		for (int i = 1; i < a.size(); ++i) {

			if ( a.get(i).compareTo(a.get(i-1)) > 0 ) {
				count++;
				if (count > maxcount)
					maxcount = count;
			}
			else {
				count = 1;
			}

		}
		return maxcount;
	}

	public static void main(String[] args) {

		try (Scanner sr = new Scanner(System.in)) {
			while (!sr.hasNext("\\[\\]")) {
				String line = sr.nextLine();
				line = line.substring(1, line.length()-1);
				ArrayList<String> wordsofline = new ArrayList<>();
				try (Scanner linescanner = new Scanner(line)) {
					while (linescanner.hasNext()) {						
						wordsofline.add(linescanner.next());
					}
				}
				System.out.println(ComputeOrderedCount(wordsofline));
			}
		}

	}

}
