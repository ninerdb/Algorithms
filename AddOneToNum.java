import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNum {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		int n = a.size();
		ArrayList<Integer> b = new ArrayList<Integer>();
		System.out.println("Size is " + n);
		String num = "";
		String sum;
		
		for (int i = 0; i < n; ++i) {
			num += a.get(i);
			System.out.println("Num is " + num);
		}
		if (a.get(0) == 0) {
			sum = "0" + String.valueOf((Integer.parseInt(num) + 1));
		} else {
			sum = String.valueOf((Integer.parseInt(num) + 1));
		}

		System.out.println("Sum is " + sum);
		
		for (int i = 0; i < a.size(); i++) {
				int[] intArray = new int[a.size()];
				intArray[i] = Integer.parseInt(String.valueOf(sum.charAt(i)));
				System.out.println("int array " + intArray[i]);
				b.add(intArray[i]);		
		}

		System.out.println(b);
		return b;
	}
	
/*public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
	    
	    int size;
	    int carry = 1;
	    int num;
	    size = A.size();
	    
	    for (int i = size - 1; i >= 0; i--) {
	        
	        num = A.get(i);
	        num += carry;
	        carry = 0;
	        
	        if (num == 10) {
	            num = 0;
	            carry = 1;
	        }
	        
	        A.set(i, num);
	        
	    }
	    
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    
	    if (carry == 1)
	        res.add(1);
	    
	    for (int x : A) {
	        if (x == 0 && res.size() == 0)
	            continue;
	        res.add(x);
	    }
	    System.out.println(res);
	    return res;
	    
	}*/

	public static void main(String args[]) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.addAll(Arrays.asList(1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 5 ));
		AddOneToNum add = new AddOneToNum();
		add.plusOne(a);
	}
}
