package practicecode3;

/*Write a Java program that checks if a string has pq-balance if it contains at least 
one 'q' directly after each ‘p’. But a 'q' before the 'p' invalidates pq-balance.
*/
public class CheckPQBalanceinJava {
	public static boolean checkPQBalance(String str) {
        boolean seenP = false;
        boolean hasQAfterP = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'p') {
                seenP = true;
                hasQAfterP = false;  // reset for new 'p'
            }

            if (ch == 'q') {
                if (!seenP) {
                    return false;  // q before any p
                }
                hasQAfterP = true;
            }
        }

        // If we saw a 'p' but never got a 'q' after it
        if (seenP && !hasQAfterP) {
            return false;
        }

        return true;
    }


	public static void main(String[] args) {
		
		 System.out.println(checkPQBalance("gfqpqab")); 
	        
	}

}
