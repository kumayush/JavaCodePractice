package practicecodes;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		for (i=1;i<=5;i++)
		{
			for (int j=0;j<5-i;j++) 
			{
				
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
		}
}
}
