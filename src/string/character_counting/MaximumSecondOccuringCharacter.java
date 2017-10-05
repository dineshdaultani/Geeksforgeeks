package string.character_counting;

public class MaximumSecondOccuringCharacter {
	
	public char getSecondChar(String str){
		int count[] = new int[256];
		int current_count = 0, max_count = 0, second_max_count = 0;
		int max_char = -1, second_max_char = -1;
		for(char ch: str.toCharArray())
			count[ch]++;
		
		for(int i = 0; i < count.length; i++){
			current_count = count[i];
			if(current_count > max_count){
				max_count = current_count;
				second_max_char = max_char;
				max_char = i;
			}
			else if(current_count != max_count && current_count > second_max_count){
				second_max_count = current_count;
				second_max_char = i;
			}
		}
		if(second_max_char != -1)
			return (char)second_max_char;
		else{
			//System.out.println("Hi");
			return 0;
		}
	}
	
	
	public static void main(String[] args) {
		String str = "abcd";
		MaximumSecondOccuringCharacter msoc = new MaximumSecondOccuringCharacter();
		System.out.println(msoc.getSecondChar(str));
	}

}
