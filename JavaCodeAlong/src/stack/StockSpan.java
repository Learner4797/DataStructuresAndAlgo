package stack;

public class StockSpan {

	public static void stockCalculate(int[] arr,int n) {
		int res[] = new int[n];
		res[0] = 1;
		for(int i=1;i<n;i++) {
			res[i]=1;
			for(int j=i-1;j>=0 && (arr[i]>=arr[j]);j--) {
				res[i]++;
			}
		}
		for(int k=0;k<n;k++) {
			System.out.print(res[k]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {10,4,5,90,120,80};
		int n = arr.length;
		stockCalculate(arr,n);

	}

}
