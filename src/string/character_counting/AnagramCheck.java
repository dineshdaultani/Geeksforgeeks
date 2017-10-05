package string.character_counting;
import java.util.HashMap;
public class AnagramCheck {
	
	public boolean checkAnagramHMap(String str1, String str2){
		HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
		for(int i = 0; i < str1.length(); i++){
			hmap1.put(str1.charAt(i), hmap1.getOrDefault(str1.charAt(i), 0) + 1);
		}
		HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();
		for(int i = 0; i < str2.length(); i++){
			hmap2.put(str2.charAt(i), hmap2.getOrDefault(str2.charAt(i), 0) + 1);
		}
		if(hmap1.equals(hmap2))
			return true;
		else{
			return false;
		}
	}
	
	public boolean checkAnagram(String str1, String str2){
		
		int count_str1[] = new int[256];
		int count_str2[] = new int[256];
		
		if(str1.length() != str2.length())
			return false;
		else{
			for(int i = 0; i < str1.length(); i++){
				count_str1[str1.charAt(i)]++;
				count_str2[str2.charAt(i)]++;
			}
			for(int i = 0; i < count_str1.length; i++){
				if(count_str1[i] != count_str2[i])
					return false;
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		AnagramCheck ac = new AnagramCheck();
		String str1 = "listen";
		String str2 = "silent";
		System.out.println(ac.checkAnagramHMap(str1, str2));
		System.out.println(ac.checkAnagram(str1, str2));
		
	}

}
