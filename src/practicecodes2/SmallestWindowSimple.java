package practicecodes2;

public class SmallestWindowSimple {

    public static boolean containsAll(String sub, String pattern) {

        for (char ch : pattern.toCharArray()) {
            if (!sub.contains(String.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "welcome to w3resource";
        String pattern = "tower";

        String smallest = "";
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String sub = str.substring(i, j);

                if (containsAll(sub, pattern)) {

                    if (sub.length() < minLength) {
                        minLength = sub.length();
                        smallest = sub;
                    }
                }
            }
        }

        System.out.println("Smallest window: " + smallest);
    }
}
