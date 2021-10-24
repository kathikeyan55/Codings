/*
You are given a matrix Mat of m rows and n columns. 
The matrix is boolean so the elements of the matrix can only be either 0 or 1.
Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1.
 After doing the mentioned operation, you need to print the modified matrix.
Input
The first line of input contains T denoting the number of testcases. T testcases follow.
The first line of each testcase contains m and n denoting number of rows and number of columns.
Then next m lines contain n elements denoting the elements of the matrix.
Constraints:
1 <= T <= 20
1 <= m, n <= 700
Mat[I][j] ∈ {0,1}
Output
For each testcase, in a new line, print the modified matrix.
Example :
Input:
2
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
1 2
0 0

Output:
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
0 0

Explanation:
Testcase1: rows = 5 and columns = 4
The given matrix is
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Evidently, the first row contains a 1 so fill the whole row with 1.
 The third row also contains a 1 so that row will be filled too. 
 Finally, the last row contains a 1 and therefore it needs to be filled with 1 too.
The final matrix is
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int textCase=scanner.nextInt();
        boolean  flag;
        while (textCase>0){
            int row=scanner.nextInt();
            int column=scanner.nextInt();
            int i;
            while (row>0){
                flag=false;
                int arr[]=new int[column];
                for( i=0;i<column;i++){
                    arr[i]=scanner.nextInt();
                    if(arr[i]==1){
                        flag=true;
                    }
                }
                if(flag)
                    for( i=0;i<column;i++)
                        System.out.print(1+" ");
                    else
                    for( i=0;i<column;i++)
                        System.out.print(0+" ");
                    System.out.println();
                row --;
            }
            textCase--;
        }
        scanner.close();
    }
}