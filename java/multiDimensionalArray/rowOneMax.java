/*

Given a boolean matrix of size N*M in which each row is sorted your task is to print the index of the row containing maximum 1's. If multiple answer exist print the smallest one.
Input
First line contains two space separated integers denoting values of N and M. Next N lines contains M space separated integers depicting the values of the matrix.

Constraints:-
1 < = M, N < = 1000
0 < = Matrix[][] < = 1
Output
Print the smallest index (0 indexing) of a row containing the maximum number of 1's.
sample i/p:
Sample Input:-
3 5
0 1 1 1 1
0 0 0 1 1
0 0 0 1 1

Sample Output:-
0

Sample Input:-
4 4
0 1 1 1
1 1 1 1
0 0 1 1
1 1 1 1

Sample Output:-
1
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class rowOneMax {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row=scanner.nextInt();
        int column=scanner.nextInt();
        int[][] matrix=new int [row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.print(rowWithMaximumOnes(matrix,row,column));
	}
    private static int rowWithMaximumOnes(int[][] matrix,int row,int column){
        int  ans=-1;
        int max=0;
        for(int i=0;i<row;i++){
            int ctn=0;
            for(int j=0;j<column;j++){
                if(matrix[i][j]==1) ctn++;
               if(ctn>max){
                   ans=i;
                   max=ctn;
               }
                if (ctn==column) {
                    
                    return i;
                }
            }
        }
        return ans;

    }
}