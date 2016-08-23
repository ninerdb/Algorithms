import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegSubArray {
	public int MaxNonNegSubArray(ArrayList<Integer> s){
		int n = s.size();
		ArrayList<Integer> sol = new ArrayList<Integer>();
		int sum = 0, ans = 0, count = 0;
		for (int i = 0; i < n ; i++){
			if(sum + s.get(i) >= 0 ){
				sol.add(s.get(i));
				count++;
			}else{
				
			}
		}
		return 0;
		
	}
	
	public static void main(String args[]){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(Arrays.asList(4,6,3,8,5,-9,2,6));
		MaxNonNegSubArray find = new MaxNonNegSubArray();
		find.MaxNonNegSubArray(al);
		
		
	}

}
