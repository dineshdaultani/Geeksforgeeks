package string.character_counting;

public class KAnagrams {

	public boolean check_k_anagram(String str1, String str2, int k){
		int arr_1[] = new int[256];
		int arr_2[] = new int[256];
		int count_diff = 0;
		if(str1.length() != str2.length())
			return false;
		else{
			for(int i = 0; i < str1.length(); i++){
				arr_1[str1.charAt(i)]++;
				arr_2[str2.charAt(i)]++;
			}
			for(int i = 0; i < arr_1.length; i++){
				count_diff += Math.abs(arr_1[i] - arr_2[i]);
			}
			System.out.println(count_diff);
			
			if(count_diff/2 <= k)
				return true;
			else
				return false;
		}
		
	}
	
	public static void main(String[] args) {
		String str1 = "geeks"; // a:3  n:1  g:1  r:1  m:1
		String str2 = "eggkf"; // a:2  n:0  g:1  r:2  m:2
		KAnagrams kana = new KAnagrams();
		System.out.println(kana.check_k_anagram(str1, str2, 1));

	}

}
