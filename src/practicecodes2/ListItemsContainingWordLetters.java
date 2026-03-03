package practicecodes2;

public class ListItemsContainingWordLetters {

	public static boolean checkExistence(String item,String word) {
		int countItem[]=new int[256];
		int countWord[]=new int[256];
		for (int i=0;i<item.length();i++) {
			countItem[item.charAt(i)]++;
		}
		for (int i=0;i<word.length();i++) {
			countWord[word.charAt(i)]++;
		}
		
		for (int i=0;i<256;i++) {
			if( countWord[i]>countItem[i]) {
				return false;
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		String[] items = {"rabbit", "bribe", "dog"};
        String word = "bib";
        for (int i = 0; i < items.length; i++) {
            if (checkExistence(items[i], word)) {
                System.out.println(items[i]);
            }
        }

	}

}
