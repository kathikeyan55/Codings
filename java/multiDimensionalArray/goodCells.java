/*
Given a boolean Matrix of size N*M, A cell of the matrix is called "Good" if it is completely surrounded by the cells containing '1' i.e. each adjacent cell (which shares a common edge) contains '1'. Your task is to find the number of such cells.

See the below example for a better understanding
Input
First line of input contains two space- separated integers N and M. Next N lines of input contain M space- separated integers depicting the values of the matrix.

Constraints:-
3 <= N, M <= 500
0 <= Matrix[][] <= 1
Output
Print the number of good cells.
Example
Sample Input:-
3 3
1 1 0
1 1 1
1 1 1

Sample Output:-
1

Explanation:- 
Only cell at position 1, 1 is good

Sample Input:-
5 4
1 0 1 0
0 1 0 1
1 0 1 0
0 1 0 1
1 0 1 0

Sample Output:-
3

Explanation:-
(1, 2), (2, 1) and (3, 2) are good cells
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class goodCellls {
	public static void main (String[] args) {
        Scanner  scanner = new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int matrix[][]=new int [row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				matrix[i][j]=scanner.nextInt();
			}
		}
        scanner.close();
		int ans=goodCellls(matrix,row,column);
		System.out.print(ans);
	}
	private static int goodCellls(int[][] matrix,int row , int column){
		int ctn=0;
		for(int i=1;i<row-1;i++){
			for(int j=1;j<column-1;j++){
				if(matrix[i-1][j]==1 && matrix[i+1][j] ==1 &&
				 matrix[i][j-1]==1 && matrix[i][j+1]==1) ctn++;
			}
		}
		return ctn;
	}
}