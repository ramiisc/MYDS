package arrays;

public class MatrixZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 9, 1, 2, 3 }, { 4, 5, 2, 1 }, { 4, 5, 0, 1 } };
		int r = matrix.length;
		int c = matrix[0].length;
		System.out.println("rows:"+r);
		System.out.println("cols:"+c);
		boolean[] rows = new boolean[r];
		boolean[] cols = new boolean[c];
		
		
		System.out.println("before:");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = true;
					cols[j] = true;
				}
			}
		}

		for (int i = 0; i < rows.length; i++) {
			if (rows[i]) {
				for (int j = 0; j < c; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < cols.length; i++) {
			if (cols[i]) {
				for (int j = 0; j < r; j++) {
					matrix[j][i] = 0;
				}
			}
		}
		
		System.out.println("after:");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
