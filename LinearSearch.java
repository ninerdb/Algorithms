
public class LinearSearch {
	// This function returns index of element x in arr[]
	static int search(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			// Return the index of the element if the element
			// is found
			if (arr[i] == x)
				return i;
		}

		// return -1 if the element is not found
		return -1;
	}
	public static void main(String args[])
	{
	    LinearSearch ob = new LinearSearch();
	    int arr[] = {2,3,4,10,40};
	    int n = arr.length;
	    int x = 10;
	    long startTime = System.nanoTime();
	    int result = ob.search(arr,n-1,x);
	    long endTime   = System.nanoTime();
	    long totalTime = endTime - startTime;
	    System.out.println("running time in nanoTime " +totalTime);
	    if (result == -1)
	        System.out.println("Element not present");
	    else
	        System.out.println("Element found at index "+result);
	}
}

