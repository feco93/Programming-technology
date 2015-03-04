import java.util.ArrayList;
import java.util.Scanner;

public class Manhattandistance {
	
	public static int distance(ArrayList<Integer> a, ArrayList<Integer> b) {
		int sum = 0;
		for(int i = 0; i < a.size(); ++i) {
			sum += Math.abs(a.get(i)-b.get(i));
		}
		return sum;
	}

	public static void main(String[] args) {
		try (Scanner sr = new Scanner(System.in)) {
			ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
			while (sr.hasNextLine()) {
				String line = sr.nextLine();
				try(Scanner linescanner = new Scanner(line)) {
					ArrayList<Integer> vektor = new ArrayList<Integer>();
					while (linescanner.hasNextInt())
						vektor.add(linescanner.nextInt());
					matrix.add(vektor);
				}
			}
			int mindist = Integer.MAX_VALUE;
			for(int i = 0; i < matrix.size(); ++i) {
				for(int j = i+1; j < matrix.size(); ++j) {
					int dist = distance(matrix.get(i), matrix.get(j));
					if ( dist < mindist )
						mindist = dist; 
				}
			}
			System.out.println(mindist);
		}

	}

}
