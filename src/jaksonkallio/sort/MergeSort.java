package jaksonkallio.sort;

public class MergeSort extends SortingAlgorithm {
	public int[] sort(int[] input){
		return sort(input, 0, input.length);
	}

	public int[] sort(int[] input, int sort_start, int sort_end){
		if(sort_start < sort_end){
			int sort_mid = (sort_start + sort_end) / 2;
			input = sort(input, sort_start, sort_mid);
			input = sort(input, sort_mid + 1, sort_end);
			input = merge(input, sort_start, sort_mid, sort_end);
		}

		return input;
	}

	public int[] merge(int[] arr, int merge_start, int merge_mid, int merge_end){
		int[] left = new int[merge_mid - merge_start + 1];
		int[] right = new int[merge_end - merge_mid];

		for (int i = 0; i < left.length; i++){
			left[i] = arr[merge_start + i];
		}

		for (int i = 0; i < right.length; i++){
			right[j] = arr[merge_mid + i + 1];
		}
	}

	public String getName(){
		return "Merge Sort";
	}
}
