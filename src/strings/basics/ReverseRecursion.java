package strings.basics;

public class ReverseRecursion {
	public void printRecur(String str){
		if(str.length() == 0)
			return;
		else{
			//System.out.println(str.substring(1));
			printRecur(str.substring(1));
			System.out.print(str.substring(0, 1));
		}
	}
	
	public static void main(String[] args) {
		String str = "Geeks for Geeks";
		ReverseRecursion rr = new ReverseRecursion();
		rr.printRecur(str);
	}
}