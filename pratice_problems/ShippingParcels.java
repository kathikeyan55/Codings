/**
 * 
A conveyor belt has parcels that must be shipped from one point to another within D days.

The i-th parcel on the conveyor belt has a weight of weights[i]. Each day,
 we load the ship with parcels on the conveyor belt (in the order given).
  We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the parcels on the conveyor belt being shipped within D days.
Input
The input line contains T, denoting the number of testcases. Each testcase contains two lines. First line N ,contains size of the conveyor belt and D days separated by space. Second line contains weights of parcels.

Constraints:
1 <= T <= 100
1 <= D <= N <= 5*10^4
1 <= weights[i] <= 500
Sum if N over all test cases is <= 1000000
Sample Input:
2
10 5
1 2 3 4 5 6 7 8 9 10
6 3
3 2 2 4 1 4

Sample Output:
15
6

Explanation:
Testcase 1: 
A ship capacity of 15 is the minimum to ship all the parcels in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10

Note that the cargo must be shipped in the order given, 
so using a ship of capacity 14 and splitting the parcels into parts like 
(2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ShippingParcels {
	public static void main (String[] args) {
         Scanner  scan = new Scanner(System.in);
         int textCase = scan.nextInt();
         while(textCase>0){
             int weightSize = scan.nextInt();
             int days = scan.nextInt();
             int[] weights = new int[weightSize];
             for(int i=0 ;i<weightSize;i++){
                 weights[i] = scan.nextInt();
             }
             System.out.print(shipWithinDays(weights,days));
             System.out.println();
             textCase--;
         }
	}
     public static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = 0,sum = 0;
        for(int i : weights){
            max = Math.max(i,max);
            sum += i;
        }
        
        int start = max,end = sum;
        int res = 0;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            int day = noOfDays(weights,n,mid);
            
            if(day <= days){
                res = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
    
    public static int noOfDays(int[] weights,int n,int maxWeight){
        int daysNo = 1, ans = 0;
        for(int i : weights){
            ans += i;
            
            if(ans > maxWeight){
                daysNo++;
                ans = i;
            }
        }
        return daysNo;
    }
}