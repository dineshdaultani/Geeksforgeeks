package string.binary;

public class SubstringStartEndWithOne {

	public void getSubstrings(String str){
		
		for(int i = 0; i < str.length(); i++){
			for(int j = i + 1; j <= str.length(); j++){
				String curr_str = str.substring(i, j);
				if(curr_str.charAt(0) == '1' && curr_str.charAt(curr_str.length() - 1) == '1' && curr_str.length() > 1)
					System.out.println(curr_str);
			}
		}
	}
	
	public void getSubstringsOptimized(String str){
		int index = 0;
		while(index < str.length()){
			if(str.charAt(index) == '1'){
				int i = index + 1;
				while(i < str.length()){
					if(str.charAt(i) == '1')
						System.out.println(str.substring(index, i+1));
					i++;
				}
			}
			index++;
		}
	}
	
	public static void main(String[] args) {
		String str = "00100101";
		SubstringStartEndWithOne ssewo = new SubstringStartEndWithOne();
		ssewo.getSubstrings(str);
		System.out.println("Other optimized function output: ");
		ssewo.getSubstringsOptimized(str);
	}

}
