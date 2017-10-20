package string.character_counting;

public class KthCharDecryptedString {

	public char findChar(String str, int k){
		String out_str = new String();
		String curr_str = new String();
		boolean flag = false;
		int len = 0;
		for(int i = 0; i < str.length(); i++){
			
			if(!Character.isAlphabetic(str.charAt(i)) && flag == true){
				len = len * 10 + Character.getNumericValue(str.charAt(i));	
			}else if(!Character.isAlphabetic(str.charAt(i)) && flag == false){
				flag = true;
				len = Character.getNumericValue(str.charAt(i));
			}
			else{
				while(len >= 1){
					out_str += curr_str;
					len--;
				}
				curr_str = "";
				
				flag = false;
				curr_str += str.charAt(i);
			}
		}
//		while(len >= 1){
//			out_str += curr_str;
//			len--;
//		}
		System.out.println(out_str);
		return out_str.charAt(k);
	}

	
	public static void main(String[] args) {
		KthCharDecryptedString obj = new KthCharDecryptedString();
		String str = "ab4c12ed3";
		System.out.println(obj.findChar(str, 21));

	}

}
