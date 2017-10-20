package string.character_counting;

public class CharAtSamePosInEng {

	public int getCount(String str){
		str = str.toLowerCase();
		int i = 0, count = 0;
		char ch = 'a';
		while(i < str.length()){
			if(str.charAt(i) == ch)
				count++;	
			i++;
			ch++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = "ABcED";
		CharAtSamePosInEng obj = new CharAtSamePosInEng();
		System.out.println(obj.getCount(str));
		
	}

}
