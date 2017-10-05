package string.character_counting;
import java.util.HashMap;
public class MaximumOccuringCharacter {

	public char getMaxOccurs(String str){
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		int max_count = 0, count = 0;
		char max_char = '\0';
		for(int i = 0; i < str.length(); i++){
			count = hmap.getOrDefault(str.charAt(i), 0) + 1;
			hmap.put(str.charAt(i), count);
			if(count > max_count){
				max_count = count;
				max_char = str.charAt(i);
			}
		}
		return max_char;
	}
	
	public char getMaxOccurs2(String str){
		int count[] = new int[256];
		int current_count, max_count = 0;
		char max_char = '\0';
		for(char ch: str.toCharArray()){
			current_count = count[ch]++;
			if(current_count > max_count){
				max_count = current_count;
				max_char = ch;
			}
		}
		return max_char;
	}
	
	public static void main(String[] args) {
		MaximumOccuringCharacter moc = new MaximumOccuringCharacter();
		String str = new String("test");
		System.out.println(moc.getMaxOccurs(str));
		System.out.println(moc.getMaxOccurs2(str));

	}

}
