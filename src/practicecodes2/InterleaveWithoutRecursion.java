package practicecodes2;

public class InterleaveWithoutRecursion {

    public static void main(String[] args) {

        String s1 = "WX";
        String s2 = "YZ";

        int n = s1.length();
        int m = s2.length();
        int total = n + m;

        // choose positions for s1 characters
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {

                char[] result = new char[total];

                // place s1 characters
                result[i] = s1.charAt(0);
                result[j] = s1.charAt(1);

                // fill remaining with s2 characters
                int s2Index = 0;
                for (int k = 0; k < total; k++) {
                    if (k != i && k != j) {
                        result[k] = s2.charAt(s2Index++);
                    }
                }

                System.out.println(new String(result));
            }
        }
    }
}
