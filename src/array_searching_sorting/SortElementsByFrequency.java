package array_searching_sorting;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
public class SortElementsByFrequency {

	public void getSortedList(int arr[]){
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++){
			hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
		}
		Stream<Map.Entry<Integer,Integer>> sorted =
			    hmap.entrySet().stream()
			       .sorted(Map.Entry.comparingByValue());
		hmap.entrySet().stream()
		   .sorted(Map.Entry.comparingByValue())
		   .forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		SortElementsByFrequency sebf = new SortElementsByFrequency();
		int arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
		sebf.getSortedList(arr);
	}
}