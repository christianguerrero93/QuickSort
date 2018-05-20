
public class QuickSort {
	
	public static <T extends Comparable<? super T>> void quickSort(T[] arr, int start, int end){
		int i = start;
		int j = end;
		T pivotItem = arr[start];//can choose at random... ideal pivot median
		while(i<=j){
			while(arr[i].compareTo(pivotItem) < 0){
				i++; //keep incrementing i until the value on the left is NOT less than the pivot
			}
			while(arr[j].compareTo(pivotItem) > 0){
				j--;//keep decrementing j until the value on the right is NOT greater than the pivot
			}
			if(i<=j){
				swap(arr, i, j);//swap the vas
				i++;
				j--;
			}
			if(start < j){
				quickSort(arr, start, j);
			}
			if(i < end)
				quickSort(arr, i, end);
		}
		
	}
	
	private  static <T extends Comparable<? super T>> void swap(T[] arr, int i, int j){
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
