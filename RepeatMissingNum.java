import java.util.ArrayList;
import java.util.Arrays;

public class RepeatMissingNum {
	public int repeatMissing(ArrayList<Integer> a){
		int n = a.size();
		for (int i = 1; i < n; i++) {
			int key = a.get(i);
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one
			 * position ahead of their current position
			 */
			while (j >= 0 && a.get(j) > key) {
				// = a.get(j);
				j = j - 1;
			}
			//arr[j + 1] = key;
		}
		return 0;
		
	}

	public static void main(String args[]) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.addAll(Arrays.asList(1,5,3,4,1));
		RepeatMissingNum num = new RepeatMissingNum();
		num.repeatMissing(a);
	}
}
