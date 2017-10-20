package string.character_counting;

public class CountSubstringKDistinct {
	
	public int count_substrings(String str, int k){
		String out_str = "";
		int total_substr = 0;
		int count_arr[] = new int[256];
		for(int i = 0; i < str.length(); i++){
			for(int j = i + 1; j <= str.length(); j++){
				out_str = str.substring(i, j);
				System.out.println(out_str);
				for(int l = 0; l < out_str.length(); l++){
					count_arr[out_str.charAt(l)]++;
				}
				int count = 0;
				for(int m = 0; m < count_arr.length; m++){
					if(count_arr[m] > 0)
						count++;
				}
				if(count == k)
					total_substr++;
				count_arr = new int[256];
			}
		}
		return total_substr;
	}
	
	public int count_substrings_optimized(String str, int k){
		int count_arr[] = new int[256];
		for(int i = 0; i <= str.length(); i++){
			for(int j = i + 1; j <= str.length(); j++){
				
			}
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		CountSubstringKDistinct cskd = new CountSubstringKDistinct();
		String str = "abcbaa";
		System.out.println(cskd.count_substrings(str, 3));
		System.out.println(cskd.count_substrings_optimized(str, 3));
		//System.out.println(str.charAt(6));
	}
}
