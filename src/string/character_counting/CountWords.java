package string.character_counting;

public class CountWords {

	public int getCount(String str){
		int count = 0;
		boolean flag = false;
		System.out.println(str.length());
		for(char ch: str.toCharArray()){
			if(ch == ' ' || ch == '\t' || ch == '\n'){
				flag = true;
			}
			else if(flag == true){
				flag = false;
				count++;
			}
		}
		return count+1;
	}
	
	public static void main(String[] args) {
		CountWords cw = new CountWords();
		System.out.println(cw.getCount(""));

	}

}
