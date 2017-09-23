package array_searching_sorting;

import java.util.HashMap;

public class MajorityElement {

	public int getElement(int arr[]){
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int element: arr){
			if(!hmap.containsKey(element)){
				hmap.put(element, 1);
			}
			else{
				hmap.put(element, hmap.get(element) + 1);
			}
			if(hmap.get(element) >= arr.length / 2){
				return element;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		MajorityElement me = new MajorityElement();
		int arr[] = {2, 3, 4, 3, 3, 6, 3, 10, 3, 3};
		System.out.println(me.getElement(arr));
	}
}
