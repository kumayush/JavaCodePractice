package practicecode3;

public class SortByStringLength {

	public static void main(String[] args) {
		String [] arr= {"welcome", "hi", "java", "programming", "to"};
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1-i;j++) {
				if(arr[j].length()>arr[j+1].length()) {
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
for (String a:arr) {
	System.out.println(a);
}
	}

}
