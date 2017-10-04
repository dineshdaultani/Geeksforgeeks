package strings.basics;

public class ReverseArrayWithoutAffectingSpecial {

	public String reverse(String str){
		char arr[] = str.toCharArray();
		int j = arr.length - 1;
		int i = 0;
		while(i <= j){
			if(Character.isAlphabetic(arr[i]) && Character.isAlphabetic(arr[j])){
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++; j--;
			}else if(!Character.isAlphabetic(arr[i])){
				i++;
			}else if(!Character.isAlphabetic(arr[j])){
				j--;
			}
		}
		return String.valueOf(arr);
	}
	
	public static void main(String[] args) {
		String str = "a,bc.def";
		ReverseArrayWithoutAffectingSpecial obj = new ReverseArrayWithoutAffectingSpecial();
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + obj.reverse(str));
	}
}
