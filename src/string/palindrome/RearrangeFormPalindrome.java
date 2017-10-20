package string.palindrome;

public class RearrangeFormPalindrome {

	public boolean checkPalindrome(String str){
		
		int char_arr[] = new int[256];
		boolean flag = false;
		for(int i = 0; i < str.length(); i++)
			char_arr[str.charAt(i)]++;
		for(int i = 0; i < char_arr.length; i++){
			if(char_arr[i] % 2 == 0)
				continue;
			else if(char_arr[i] == 1 && flag == false)
				flag = true;
			else
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "geeksogeeks";
		RearrangeFormPalindrome rfp = new RearrangeFormPalindrome();
		System.out.println(rfp.checkPalindrome(str));
	}

}
