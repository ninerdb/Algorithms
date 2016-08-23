
public class CoinChange {
	
	private static int recursiveWay(int[] a, int arraySize, int number){
		if(number == 0){
			return 0;
		}
		int result = Integer.MAX_VALUE;
		
		for(int i = 0; i < arraySize; i++){
			if(a[i] <= number){
				int subResult = recursiveWay(a, arraySize, number - a[i]);
				
				if((subResult != Integer.MAX_VALUE) && (subResult + 1 < result)){
					result = subResult  + 1;
				}
			}
		}
		
		return result;
	}
	
	private static int dynamicWay(int a[], int arraySize, int number){
		int table[] = new int[number + 1];
		table[0] = 0;
		
		for(int i = 1; i <= number ; i++){
			table[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 1; i <= number; i++){
			for(int j = 0; j <= arraySize; j++){
				if(a[j] <= i){
					int subResult = table[i - a[j]];
					if((subResult != Integer.MAX_VALUE) && (subResult + 1 < table[i])){
						table[i] = subResult + 1;
					}
				}
			}
		}
		return table[number];		
	}
	
	public static void main(String args[]){
		//Scanner s = new Scanner(System.in);
		//int a = s.nextInt();
		//List<Integer> array = new ArrayList<Integer>();
		int[] array = {9,6,5,1};
		//System.out.println("Enter an array");
		int size = array.length ;
		CoinChange c = new CoinChange();
		int result = c.recursiveWay(array, size, 4);
		int dpResult = c.dynamicWay(array, size, 11);
		System.out.println("Coin change problem " + result);
		System.out.println("Coin change problem " + dpResult);
	}

}
