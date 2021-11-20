package array;

public class Sum3 {
	
	static void reverseArray(int arr[]) {
		int temp;
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		reverseArray(arr);
		printArray(arr);
	}

}
