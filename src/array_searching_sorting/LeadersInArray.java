package array_searching_sorting;

public class LeadersInArray {

	public int[] findLeaders(int arr[]){
		int output[] = new int[arr.length];
		int max = -1;
		for(int i = arr.length - 1; i >= 0; i--){
			if(arr[i] > max){
				max = arr[i];
				output[i] = 1;
			}else
				output[i] = 0;		
		}
		return output;
	}
	
	public static void main(String[] args) {
		LeadersInArray lea = new LeadersInArray();
		int arr[] = {16, 17, 4, 3, 5, 2};
		int out[] = lea.findLeaders(arr);
		for(int i = 0; i < arr.length; i++){
			if(out[i] != 0)
				System.out.println(arr[i]);
		}
	}
}
