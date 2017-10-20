package string.palindrome;

public class RotationStringPali {

	public boolean checkPalindromeSB(String str){
		String curr_str = "";
		for(int i = 0; i < str.length(); i++){
			curr_str = str.substring(i) + str.substring(0, i);
			StringBuilder sb = new StringBuilder(curr_str);
			if(sb.reverse().toString().equals(curr_str))
				return true;	
		}
		return false;
	}
	
	public boolean checkPalindrome(String str){
		String curr_str = "";
		for(int i = 0; i < str.length(); i++){
			curr_str = str.substring(i) + str.substring(0, i);
			int left = 0, right = curr_str.length() - 1;
			while(left < curr_str.length()/2){
				if(curr_str.charAt(left) != curr_str.charAt(right))
					break;
				left++; right--;
			}
			if(left >= right)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str = "dabcbadd";
		RotationStringPali rsp = new RotationStringPali();
		System.out.println(rsp.checkPalindromeSB(str));
		System.out.println(rsp.checkPalindrome(str));
	}
}
