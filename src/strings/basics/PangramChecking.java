package strings.basics;
import java.util.HashMap;
public class PangramChecking {

	public boolean checkPangramHMap(String str){
		HashMap<Character, Boolean> hmap = new HashMap<Character, Boolean>();
		
		for(int i = 0; i < str.length(); i++){
			if(!hmap.containsKey(str.charAt(i)))
				hmap.put(str.charAt(i), true);
		}
		for(char ch = 'a'; ch <= 'z'; ch++ ){
			if(!hmap.containsKey(ch))
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		PangramChecking pc = new PangramChecking();
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(pc.checkPangramHMap(str.toLowerCase()));
	}

}
