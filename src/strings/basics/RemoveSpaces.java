package strings.basics;

public class RemoveSpaces {

	public String removeSpaces(String str){
		String out = new String();
		for(int i = 0; i < str.length(); i++){
			if(!(str.charAt(i) == ' '))
				out = out + str.charAt(i);
		}
		return out;
	}
	
	public static void main(String[] args) {
		RemoveSpaces rs = new RemoveSpaces();
		String str = "g  eeks   for ge  eeks  ";
		System.out.println(rs.removeSpaces(str));
		System.out.println(str.replace(" ", ""));
	}

}
