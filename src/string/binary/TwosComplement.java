package string.binary;

public class TwosComplement {

	public String getTwoscomplement(String str){
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i < sb.length(); i++){
			if(sb.charAt(i) == '0')
				sb.setCharAt(i, '1');
			else
				sb.setCharAt(i, '0');
		}
		System.out.println("1s complement: " + sb.toString());
		int index = sb.length() - 1;
		while(index >= 0 && sb.charAt(index) == '1'){
			sb.setCharAt(index, '0');
			index--;
		}
		if(index < 0){
			return "1" + sb.toString();
		}else{
			sb.setCharAt(index, '1');
			return sb.toString();
		}
		
	}
	
	public String getTwoscomplementOptimized(String str){
		StringBuilder sb = new StringBuilder(str);
		int index = sb.length() - 1;
		boolean flag = false;
		while(index >= 0){
			if(!flag && sb.charAt(index) == '1')
				flag = true;
			else if(flag && sb.charAt(index) == '0')
				sb.setCharAt(index, '1');
			else if(flag && sb.charAt(index) == '1')
				sb.setCharAt(index, '0');
			index--;
		}
		if(index < 0 && !flag)
			return "1" + sb.toString();
		else
			return sb.toString();
	}
	
	public static void main(String[] args) {
		TwosComplement tc = new TwosComplement();
		String str = "0100";
		System.out.println("2s complement: " + tc.getTwoscomplement(str));
		System.out.println("2s complement: " + tc.getTwoscomplementOptimized(str));

	}

}
