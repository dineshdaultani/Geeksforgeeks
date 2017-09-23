package array_searching_sorting;
import java.util.HashMap;
public class NumberOccuringOddTimes {

	public int findElement(int arr[]){
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int element: arr){
			if(hmap.containsKey(element)){
				hmap.put(element, hmap.get(element) + 1);
			}else{
				hmap.put(element, 1);
			}
		}
		for(int key: hmap.keySet()){
			if(hmap.get(key) % 2 == 1)
				return key;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		NumberOccuringOddTimes not = new NumberOccuringOddTimes();
		int arr[] = {2, 4, 5, 7, 9, 2, 4, 4, 5, 7, 9, 4, 5};
		System.out.println(not.findElement(arr));
	}
}
