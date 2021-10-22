/**
 * Given a matrix of size M*N, your task is to find the maximum sum of a column.
Input
The first line of input contains two space- separated integers M and N. The next M lines of input contains N space- separated integers each depicting the values of the matrix.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[][] <= 100000
Output
Print the maximum sum between the columns.

example:
Sample Input:-
3 3
1 2 3
4 5 6
7 8 9

Sample Output:-
18

Explanation:-
1 + 4 + 7 = 12
2 + 5 + 8 = 15
3 + 6 + 9 = 18
maximum = 18

Sample Input:-
3 2
1 4
9 6
9 1

Sample Output:-
19
 */


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxSumColumn{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row=scanner.nextInt();
        int column=scanner.nextInt();
        int sum=0;

        int matrix[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        int iterator=column;
        int j=0;
        while (iterator>0){
            int i=0;
            int current_sum=0;
            while(i<row){
                current_sum+=matrix[i][j];
                i++;
            }
            sum=(current_sum>sum)?current_sum:sum;
            j++;
            iterator--;
        }
        System.out.println(sum);

    }
}