package practicecodes;

public class HollowSquare {

	public static void main(String[] args) {
		int row=5;
		int column=6;
		for (int i=0;i<row;i++) 
		{
			if (i==0||i==row-1) 
			{
				
				for (int j=0;j<column;j++) 
				{
					System.out.print('*');
				}
			}
			else 
			{
				System.out.print('*');
				for (int j=0;j<column-2;j++) 
				{
					System.out.print(' ');
				}
				System.out.print('*');
					
			}
			System.out.println();
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
