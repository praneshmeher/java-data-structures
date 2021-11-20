package array;

public class Rotation {
	void rotate(int arr[], int n) {
		for(int i=0;i<n;i++) {
			int start = arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=start;
		}
	}
	
	void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	void print1(int arr[]) {
		for(int num:arr) {
			System.out.println(num);
		}
	}
	
	public static void main(String args[]) {
		Rotation r = new Rotation();
		int arr[] = {1,2,3,4,5};
		r.rotate(arr, 2);
		r.print1(arr);
	}

}
