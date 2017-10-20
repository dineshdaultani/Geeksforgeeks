package string.character_counting;

public class MaxConsecutiveChar {

	public char getCount(String str){
		char max_ch = '\0';
		int max_count = 0;
		char prev_ch = '\0';
		int curr_count = 0;
		for(char ch: str.toCharArray()){
			if(ch != prev_ch){
				if(curr_count > max_count){
					max_count = curr_count; max_ch = prev_ch;
				}
				curr_count = 1;
			}else
				curr_count++;
			prev_ch = ch;
		}
		if(curr_count > max_count){
			max_count = curr_count; max_ch = prev_ch;
		}
		return max_ch;
	}
	
	public static void main(String[] args) {
		MaxConsecutiveChar mcc = new MaxConsecutiveChar();
		System.out.println(mcc.getCount("aaaabbcbbb"));
	}
}