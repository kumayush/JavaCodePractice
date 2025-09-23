package revisioncodes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
	public static void WebsiteLinkExtractor(String text) {
		String regex="https?://[\\w\\.\\-]+\\.[a-z]{2,3}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		while(m.find()) {
			String url=m.group();
			System.out.println("extracted url is : "+url);
		}
		
	}
	
	public static void Spacereplace(String text) {
		String regex="\\s";
		String replacement="_";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		String replacedString=m.replaceAll(replacement);
		System.out.println("string with whitespaces replaced : "+replacedString);
		
	}
	
	public static void VowelStart(String text) {
		String regex="^[aeiouAEIOU][A-Za-z]*";
		Boolean bool=Pattern.matches(regex, text);
		if (bool) {
			System.out.println("starts with vowel");
		}
		else {
			System.out.println( "does not start with vowel");
		}
		
	}

	public static void main(String[] args) {
		String text="this is a website https://www.a15-yushtesting.commmmmm";
		WebsiteLinkExtractor(text);
		
		String text2="geeks for geeks";
		Spacereplace(text2);
		
		String text3="plephant"	;
		VowelStart(text3);
		

	}

}
