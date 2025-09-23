package practicecodes;

/*Given two integers n and m (m != 0). 
Find the number closest to n and divisible by m. 
If there is more than one such number, then output 
the one having maximum absolute value.

Examples: 

Input: n = 13, m = 4
Output: 12
Explanation: 12 is the closest to 13, divisible by 4.

Input: n = -15, m = 6
Output: -18
Explanation: Both -12 and -18 are closest to -15, 
but-18 has the maximum absolute value.*/

public class closest {
	
	static int closestNumber(int n, int m) {
        // find the quotient
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;

        // Check numbers around n
        for (int i = n - Math.abs(m); i <= n + Math.abs(m); ++i) {
            if (i % m == 0) {
                int difference = Math.abs(n - i);

                if (difference < minDifference || 
                   (difference == minDifference && Math.abs(i) > Math.abs(closest))) {
                    closest = i;
                    minDifference = difference;
                }
            }
        }
        return closest;
    }

	public static void main(String[] args) {
		 int n = 46, m = 7;
	        System.out.println(closestNumber(n, m));

	}

}
