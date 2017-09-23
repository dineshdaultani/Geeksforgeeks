package array_searching_sorting;

public class FindMissingElement {

	public int findMissingElement(int arr[]){
		int max = -1;
		int sum = 0;
		for(int element: arr){
			if(element > max)
				max = element;
			sum = sum + element;
		}
		int val = (max * (max + 1) / 2) - sum;
		if(val != 0)
			return val;
		else
			return ++max;
	}
	
	public static void main(String[] args) {
		FindMissingElement fme = new FindMissingElement();
		int arr[] = {1, 3, 6, 5, 4, 9, 7, 8, 2, 11 };
		System.out.println(fme.findMissingElement(arr));
	}
}
