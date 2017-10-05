package string.character_counting;

import java.util.Arrays;

public class KthNonRepeatingCharacter {

	public static char findKthChar(String str, int k){
		char kth_char = '\0';
		int count[] = new int[256];
		for(int i = 0; i < str.length(); i++){
			count[str.charAt(i)]++;
		}
		for(int i = 0; i < str.length(); i++){
			if(count[str.charAt(i)] == 1 && k == 1){
				kth_char = str.charAt(i);
				k--;
			}else if(count[str.charAt(i)] == 1){
				k--;
			}
		}
		return kth_char;
	}
	
	public static char findKthChar2(String str, int k){
		int count [] = new int[256];
		int index [] = new int[256];
		
		for(int i = 0; i < count.length; i++){
			count[i] = 0;
			index[i] = str.length();
		}
		
		for(int i = 0; i < str.length(); i++){
			count[str.charAt(i)]++;
			if(count[str.charAt(i)] == 1 )
				index[str.charAt(i)] = i;
			else
				index[str.charAt(i)] = str.length();
		}
		Arrays.sort(index);
		return (char)index[k-1];
	}
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println(findKthChar(str, 3));
		System.out.println(findKthChar(str, 3));
	}

}
