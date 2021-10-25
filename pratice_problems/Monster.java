/**
 * Rahul is playing a game in which he has to kill a monster in order to win the game. He has N types of weapons available with him having different attack powers and different weights. Rahul can pick a weapon only if it is not heavier than D.
Given the health of the monster H, the attack powers and weights of weapons, what is the minimum number of weapons required in order to kill the monster?

Note:- A weapon can only be used once.
Input
First line of input contains three space separated integers N, D and H.
Second line contains N space separated integers depicting the attack power of each weapon.
Third line of input contains the weight of each weapon.

Constraints:-
1 < = N < = 100000
1 < = D, Weight[i] < = 100000
1 < = H, Power[i] < = 100000000
Output
Print the minimum number of weapons required or print -1 if it is impossible to win the game.
Sample Input:-
5 5 15
3 8 16 12 6
3 4 10 6 5

Sample Output:-
3

Sample Input:-
5 3 12
3 1 3 6 19
4 5 3 4 8

Sample Output:-
-1
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Monster {
	public static void main (String[] args) {
      Scanner scanner = new Scanner (System.in);
      int n = scanner.nextInt();
      int d = scanner.nextInt();
      int h = scanner.nextInt();
      long[] power = new long[n];
      for(int i=0;i<n;i++){
          power[i] = scanner.nextLong();
      }
      ArrayList<Long> validPowers = new ArrayList<>();
      for(int i=0;i<n;i++){
          long w = scanner.nextLong();
          if(w<=d){
              validPowers.add(power[i]);
          }
      }
      Collections.sort(validPowers);
      long sum=0;
      int count=0;
      boolean flag = false;

      for(int i=validPowers.size()-1;i>=0;i--){
          sum+=validPowers.get(i);
          count++;
          if(sum>=h){
              System.out.print(count);
              flag = true;
              break;
          }
      }

      if(!flag){
          System.out.print("-1");
      }
	}
}