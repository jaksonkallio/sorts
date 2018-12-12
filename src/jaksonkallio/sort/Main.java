package jaksonkallio.sort;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.lang.System;
import java.lang.StringBuilder;

class Main {
	public static void main(String[] args){
		(new Main()).runTests();
	}

	public Main(){
		sample_input_gen = new Random(SAMPLE_INPUT_SEED);
	}

	public void runTests(){
		int[] sample_input = genSampleInput(SAMPLE_ELEMENT_COUNT);
		List<SortingAlgorithm> algos = getAlgorithms();

		System.out.println("Algorithm count: " + algos.size());
		System.out.println("Sample array size: " + sample_input.length);
		System.out.println("Sample element range: 0-" + SAMPLE_ELEMENT_MAX_VAL);
		System.out.println("Sample generation seed: " + SAMPLE_INPUT_SEED);

		for(int i = 0; i < algos.size(); i++){
			SortingAlgorithm algo = algos.get(i);

			long bench_start = System.currentTimeMillis();
			algo.sort(sample_input);
			long bench_end = System.currentTimeMillis();

			System.out.println(algo.getName() + " performed sort in " + (bench_end - bench_start) + "ms");
		}

		System.out.println("Tests complete");
	}

	private void displayArray(int[] arr){
		StringBuilder str = new StringBuilder();
		str.append("[");
		for(int i = 0; i < arr.length; i++){
			if(i != 0){
				str.append(",");
			}

			str.append(arr[i]);
		}
		str.append("]");

		System.out.println(str);
	}

	private List<SortingAlgorithm> getAlgorithms(){
		List<SortingAlgorithm> algos = new ArrayList<>();

		algos.add(new MergeSort());

		return algos;
	}

	private int[] genSampleInput(int elements){
		int[] sample_input = new int[elements];
		for(int i = 0; i < sample_input.length; i++){
			sample_input[i] = Math.abs((int)(sample_input_gen.nextDouble() * (SAMPLE_ELEMENT_MAX_VAL + 1)));
		}

		return sample_input;
	}

	public static final long SAMPLE_INPUT_SEED = 100;
	public static final int SAMPLE_ELEMENT_COUNT = 10;
	public static final int SAMPLE_ELEMENT_MAX_VAL = 1000;

	private final Random sample_input_gen;
}
