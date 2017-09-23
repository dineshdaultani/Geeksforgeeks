package array_searching_sorting;

public class MergeTwoSortedArrays {

	public int[] mergeArrays(int mPlusN[], int n[]){
		int index_n = 0;
		for(int i = 0; i < mPlusN.length; i++){
			if(mPlusN[i] == -1){
				mPlusN[i] = n[index_n++];
			}
		}
		return mPlusN;
	}
	
	public static void main(String[] args) {
		int mPlusN[] = {2, 4, 5, -1, 9, 15,  -1, 20, -1, -1, 25, -1};
		int n[] = {7, 17, 21, 23, 28};
		
		MergeTwoSortedArrays mtsa = new MergeTwoSortedArrays();
		int out[] = mtsa.mergeArrays(mPlusN, n);
		for(int val: out)
			System.out.println(val);
	}
}