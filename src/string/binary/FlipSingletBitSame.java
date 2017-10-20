package string.binary;


public class FlipSingletBitSame {

	public boolean checkFlippedBits(String str){
		
		int count_0s = 0;
		int count_1s = 0;
		
		for(int ch: str.toCharArray()){
			int num = Character.getNumericValue(ch);
			if(num == 0)
				count_0s++;
			else
				count_1s++;
		}
		if(count_0s >= 1 && count_1s <= 1 || count_1s >= 1 && count_0s <= 1)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		String str = new String("011101");
		FlipSingletBitSame fsbs = new FlipSingletBitSame();
		System.out.println(fsbs.checkFlippedBits(str));

	}

}
