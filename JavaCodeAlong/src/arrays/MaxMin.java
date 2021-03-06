package arrays;

public class MaxMin {

	public static void main(String[] args) {
		int arr[] = {3,1,4,2,4};
		if(arr.length==1) {
			System.out.println("Max is: "+arr[0]+"Min is: "+arr[0]);
		}
		System.out.println("Max is: "+findMax(arr)+" Min is: "+findMin(arr));
	}

	private static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	private static int findMin(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

}
