package string.misc;

public class CheckRotation {

	public boolean checkRotations(String str1, String str2){
		if((str1+str1).contains(str2) && str1.length() == str2.length())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		String str1 = "ABACD";
		String str2 = "ABACD";
		CheckRotation cr = new CheckRotation();
		System.out.println(cr.checkRotations(str1, str2));
		
	}

}
