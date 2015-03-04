import java.util.ArrayList;
import java.util.Scanner;

public class Longestline {

	public static void main(String[] args) {

		try (Scanner sr = new Scanner(System.in)) {

			ArrayList<String> lines = new ArrayList<String>();
			int maxlength = 0;
			while (sr.hasNextLine()) {
				String line = sr.nextLine();
				lines.add(line);
				if (line.length() > maxlength)
					maxlength = line.length();
			}
				
			
			for(int i = 0; i < lines.size(); ++i){
				
				if (lines.get(i).length() == maxlength) {
					String[] words = lines.get(i).split(" ");
					int wordcount = words.length;
					System.out.format("%d: %d %d%n", i+1, wordcount,
							lines.get(i).length());
				}

			}

		}

	}

}
