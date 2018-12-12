package jaksonkallio.sort;

import java.util.Random;

class Main {
	public static void main(String[] args){
		(new Main()).runTests();
	}

	public Main(){
		sample_input_gen = new Random(SAMPLE_INPUT_SEED);
	}

	public void runTests(){
		int[] sample_input = genSampleInput(10);

		System.out.println("Running tests...");

		MergeSort ms = new MergeSort();
		ms.sort(sample_input);

		System.out.println("Tests complete");
	}

	private int[] genSampleInput(int elements){
		int[] sample_input = new int[elements];
		for(int i = 0; i < sample_input.length; i++){
			sample_input[i] = sample_input_gen.nextInt();
		}

		return sample_input;
	}

	public static final long SAMPLE_INPUT_SEED = 101;

	private final Random sample_input_gen;
}
