package string.character_counting;

public class CountSubstrSameLastFirst {

	public int getCount(String str){
		String curr_str = "";
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			for(int j = i + 1; j <= str.length(); j++){
				curr_str = str.substring(i, j);
				if(curr_str.charAt(0) == curr_str.charAt(curr_str.length() - 1)){
					count++;
				}
			}
		}
		return count;	
	}
	
	
	public static void main(String[] args) {
		String str = "aba";
		CountSubstrSameLastFirst csslf = new CountSubstrSameLastFirst();
		System.out.println(csslf.getCount(str));
	}

}
