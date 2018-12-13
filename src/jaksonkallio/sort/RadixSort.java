package jaksonkallio.sort;

public class RadixSort extends SortingAlgorithm {
	public int[] sort(int[] input){
		int[] sorted = new int[input.length];

	}

	public int findMax(int[] arr){
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}

		return max;
	}

	public int getDigit(int number, int digit){
		return number / 10^digit;
	}

	public String getName(){
		return "Radix Sort";
	}
}
