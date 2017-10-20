package string.binary;

public class StringAlternateBinary {

	public int getNumberOfFlips(String str){
		int count_start_0 = 0;
		int count_start_1 = 0;
		for(int i = 0; i < str.length(); i++){
			int num = Character.getNumericValue(str.charAt(i));
			if(i % 2 == 0 && num == 0)
				count_start_0++;
			else if(i % 2 == 1 && num == 1)
				count_start_0++;
			
			if(i % 2 == 0 && num == 1)
				count_start_1++;
			else if(i % 2 == 1 && num == 0)
				count_start_1++;
		}
		
		if(count_start_0 < count_start_1)
			return count_start_0;
		else
			return count_start_1;
				
	}
	
	public static void main(String[] args) {
		String str = "0101010111";
		StringAlternateBinary sab = new StringAlternateBinary();
		System.out.println(sab.getNumberOfFlips(str));

	}

}
