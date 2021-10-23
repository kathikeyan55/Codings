import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Diagonal {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
		int N=scanner.nextInt();
		int mat[][]=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				mat[i][j]=scanner.nextInt();
			}
		}
		int a=primaryDiagonal(mat);
		int b=secondaryDiagonal(mat);
		System.out.print(b+" "+a);
	}
	private static int primaryDiagonal(int mat[][]){
		int sum=0;
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				if(i+j==mat.length-1) sum+=mat[i][j];
			}
		}
		return sum;

	}
	private static int secondaryDiagonal(int mat[][]){
			int sum=0;
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				if(i==j) sum+=mat[i][j];
			}
		}
		return sum;
	}
}