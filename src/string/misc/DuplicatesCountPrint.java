package string.misc;

public class DuplicatesCountPrint {

	public void printDuplicates(String str){
		int char_arr[] = new int[256];
		for(int i = 0; i < str.length(); i++)
			char_arr[str.charAt(i)]++;
		
		for(int i = 0; i < char_arr.length; i++){
			if(char_arr[i] > 1)
				System.out.println((char)i + ": " + char_arr[i]);
		}
	}
	
	public static void main(String args[]){
		DuplicatesCountPrint dcp = new DuplicatesCountPrint();
		String str = "test string";
		dcp.printDuplicates(str);
	}
	
}
