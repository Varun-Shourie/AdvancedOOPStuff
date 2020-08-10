import java.util.Arrays;

public class Main {
	
	private static int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
	
	public static void main(String[] args) {
		
		System.out.println("Array contents before reversal: " + Arrays.toString(array));
		
		reverse(array);
		
		System.out.println("Array contents after reversal: " + Arrays.toString(array));
	}
	
	private static void reverse(int[] array) {
		
		int tmpNumber = 0;
		
		for(int i = 0; i < array.length / 2; i++) {
			tmpNumber = array[i];
			
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tmpNumber;
		}

	}

}
