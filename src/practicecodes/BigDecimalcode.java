package practicecodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.math.BigDecimal;

public class BigDecimalcode {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading n
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }
        Arrays.sort(s, (s1, s2) -> {
            BigDecimal b1 = new BigDecimal(s1);
            BigDecimal b2 = new BigDecimal(s2);
            return b2.compareTo(b1); // Sort in descending order
        });
        for (String str : s) {
            System.out.println(str);
        }
    }
}