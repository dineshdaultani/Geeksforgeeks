package string.palindrome;

public class RangePrintPalindromes {

	public void printPalindromes(int first, int last){
		
		for(int num = first; num <= last; num++){
			int temp = num;
			int rev = 0;
			while(temp != 0){
				rev = (rev * 10) + temp % 10;
				temp = temp / 10;
			}
			if(rev == num)
				System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		RangePrintPalindromes rpp = new RangePrintPalindromes();
		rpp.printPalindromes(10, 115);
	}

}
