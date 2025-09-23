package sdetInterviewCodes;

public class ExcelColumnName {
    public static String getColumnName(int n) {
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            n--; 
            int remainder = n % 26;
            char letter = (char) ('A' + remainder);
            //result.insert(0, letter);
            result.append(letter);
            n = n / 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Column name for 26: " + getColumnName(26)); // Z
        System.out.println("Column name for 27: " + getColumnName(27)); // AA
        System.out.println("Column name for 52: " + getColumnName(52)); // AZ
        System.out.println("Column name for 53: " + getColumnName(53)); // BA
    }
}