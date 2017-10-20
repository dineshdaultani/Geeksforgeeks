package string.palindrome;

public class LongestPalindrome {

	public String getLongestPalindrome(String str){
		String largest_str = "";
		for(int i = 0; i < str.length(); i++){
			for(int j = i + 1; j <= str.length(); j++){
				String curr_str = str.substring(i, j);
				if(new StringBuilder(curr_str).reverse().toString().equals(curr_str) && curr_str.length() > largest_str.length()){
					largest_str = curr_str;
				}
					
			}
		}
			
		return largest_str;
	}
	
	public static void main(String[] args) {
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.getLongestPalindrome("abccccdd"));

	}

}
