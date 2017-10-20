package string.palindrome;

public class LongestShuffledPalindrome {

	public int longestPalindrome(String s){
		int count = 0;
		boolean flag = false;
		int char_arr[] = new int[256];
		
		for(int i = 0; i < s.length(); i++)
			char_arr[s.charAt(i)]++;
		
		for(int i = 0; i < char_arr.length; i++){
			if(char_arr[i] % 2 == 0)
				count += char_arr[i];
			else if(char_arr[i] % 2 == 1){
				flag = true;
				count += char_arr[i] - 1;
			}
		}
		if(flag)
			return count + 1;
		else
			return count;
	}
	
	public static void main(String[] args) {
		LongestShuffledPalindrome lsp = new LongestShuffledPalindrome();
		System.out.println(lsp.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

	}

}
