/**
 * N people are waiting in line to get food. The ith person takes Arr[i] amount of time to get food. A person is happy if the amount of time he has to wait is less than or equal to the amount of time he takes to get food. The time a person waits is the sum of time people in front of him take to get food. Now you have to rearrange the people in the line such that the maximum number of people in the line are happy and report the maximum number of people that can be happy.
Input
The first line of input contains a single integer N.
The second line of input contains N integers denoting Arr[i].

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 1000000000
Output
Print the maximum number of people that can be happy after the rearrangement.
N people are waiting in line to get food. The ith person takes Arr[i] amount of time to get food. A person is happy if the amount of time he has to wait is less than or equal to the amount of time he takes to get food. The time a person waits is the sum of time people in front of him take to get food. Now you have to rearrange the people in the line such that the maximum number of people in the line are happy and report the maximum number of people that can be happy.
Input
The first line of input contains a single integer N.
The second line of input contains N integers denoting Arr[i].

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 1000000000
Output
Print the maximum number of people that can be happy after the rearrangement.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FoodLine {
	public static void main (String[] args) {
      Scanner scanner = new Scanner (System.in);
      int n = scanner.nextInt();
      long arr[] = new long[n];
      for(int i=0;i<n;i++){
          arr[i]=scanner.nextLong();
      }
      Arrays.sort(arr);
      int count = 0 ;
      long waitTime =0;
      for(int i=0;i<n;i++){
          if(waitTime<=arr[i]){
              count++;
               waitTime=waitTime+arr[i];
          }
         
      }
      System.out.print(count);
	}
}