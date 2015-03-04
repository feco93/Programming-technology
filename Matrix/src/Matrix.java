import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		try (Scanner sr = new Scanner(System.in)) {
			int N = sr.nextInt();
			int M = sr.nextInt();
			int[][] matrix = new int[N][M];

			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < M; ++j) {
					matrix[i][j] = sr.nextInt();
				}
			}

			int[] counter = new int[M];
			int max0 = -1;
			for (int i = 0; i < M; ++i) {
				counter[i] = 0;
				for (int j = 0; j < N; ++j) {
					if (matrix[j][i] == 0)
						counter[i]++;
				}
				if (counter[i] > max0)
					max0 = counter[i];
			}

			boolean first = true;
			for (int i = 0; i < M; ++i) {
				if (counter[i] == max0)
					if (first) {
						System.out.print(i + 1);
						first = false;
					} else {
						System.out.print(" " + (i + 1));
					}
			}
			System.out.println();
		}
	}

}
