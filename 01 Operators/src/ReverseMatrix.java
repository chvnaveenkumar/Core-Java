public class ReverseMatrix {
	public static void main(String args[]) {
		int[][] arr = {{2,3,5,7},{5,6,7,2},{7,8,2,1}};
		int[][] reverse = new int[4][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				reverse[j][i] = arr[i][j];
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("Revers of Matrix");
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(reverse[i][j]);
			}
			System.out.println();
		}
		
	}
}
