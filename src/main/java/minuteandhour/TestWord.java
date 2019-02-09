package minuteandhour;

import java.util.ArrayList;
import java.util.List;

public class TestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "iabeaa";
		
		test = test.toLowerCase();
		List<String> vowelList = new ArrayList();
		
		char vowels[] = {'a','e','i','o','u'};
		
		for (int i =0 ; i < test.length(); i ++) {
			char s = test.charAt(i);
			for(int j=0; j< vowels.length ; j ++) {
				char c = vowels[j];
				if(c == s) {
					vowelList.add(Character.toString(s));
				}
			}
			
		}
		
		for(int i =0 ; i <= vowelList.size()-2; i++) {
			if(findPalindrome(vowelList)) {
				System.out.println("True : Contains a Palindrome");
				break;
			} else {
				vowelList.remove(i);
			}
		}
		
		System.out.println("Input string doesn't have a Palindrome");
	
	}
	
	private static boolean findPalindrome(List<String> temp) {
		int k=0;
		int j=0;
		int lsize = temp.size();
		int i;
		for (i=0; i<= lsize/2; i ++) {
			k++;
			if(temp.get(i).equals(temp.get(lsize - k))){
				j++;
			}else {
				return false;
			}
		}
		if(j >= lsize/2) {
			return true;
		}
		return false;
	}
	

}
