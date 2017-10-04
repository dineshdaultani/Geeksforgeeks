package strings.basics;
import java.util.HashSet;
public class RemoveDuplicates {

	public String removeDups(String str){
		String output = "";
		HashSet<Character> hset = new HashSet<Character>();
		for(char ch: str.toCharArray()){
			if(!hset.contains(ch)){
				output = output + ch;
				hset.add(ch);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		String str = new String("Geeks for Geeks");
		RemoveDuplicates rd = new RemoveDuplicates();
		System.out.println("original string: " + str);
		System.out.println("string after removing duplicates: " + rd.removeDups(str));
	}
}
