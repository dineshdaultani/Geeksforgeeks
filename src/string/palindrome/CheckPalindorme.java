package string.palindrome;

public class CheckPalindorme {

	public boolean checkPaliSB(String str){
		StringBuilder sb = new StringBuilder(str);
		if(sb.reverse().toString().equals(str))
			return true;
		else
			return false;
	}
	
	public boolean checkPali(String str){
		int left = 0;
		int right = str.length() - 1;
		while(left <= str.length()/2){
			if(str.charAt(left) != str.charAt(right))
				return false;
			left++; right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = new String("geeks");
		CheckPalindorme cp = new CheckPalindorme();
		System.out.println(cp.checkPaliSB(str));
		System.out.println(cp.checkPali(str));

	}

}
