package string.pattern;

public class NaivePatternSeach {

	public int searchPattern(String txt, String pattern){
		int i = 0;
		int count = 0;
		while(i < txt.length()){
			if(txt.substring(i).contains(pattern)){;
				count++;
				i = txt.indexOf(pattern, i) + 1;
			}else{
				break;
			}
		}
		return count;
	}
	
	public int searchPattern2(String txt, String pattern){
		
		int i = 0, count = 0;
		while(i < txt.length()){
			if(txt.charAt(i) == pattern.charAt(0)){
				int j = 0, k = i;
				while(j < pattern.length() && k < txt.length() && txt.charAt(k) == pattern.charAt(j)){
						j++; k++;
					}
				if(j == pattern.length()){
					System.out.println("Found at: " + i);
					count++;
				}
			}
			i++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		NaivePatternSeach nps = new NaivePatternSeach();
		String txt = "AABAACAADAABAABA";
		String pattern = "AABA";
		System.out.println("Trying through substr function");
		System.out.println("Total pattern found: " + nps.searchPattern(txt, pattern));
		System.out.println("Trying through Naive Pattern Search");
		System.out.println("Total pattern found: " + nps.searchPattern2(txt, pattern));

	}

}
