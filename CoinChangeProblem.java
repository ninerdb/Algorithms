
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinChangeProblem {
	
	private int count = 0;

	private int recursiveWay(int[] a, int arraySize, int number){
		if(arraySize == 0){
			return 1;
		}
		if (arraySize < 0){
			return 0;
		}
		if((number <= 0) && (arraySize >= 1)){
			return 0;
		}
		System.out.println(count);
		return count  = recursiveWay(a,arraySize - 1, number) + recursiveWay(a, arraySize, number - a[arraySize - 1]);
		
	}
	
	private int dynamicWay(int[] a, int arraySize, int number){
		//int table[number + 1][arraySize];
		int table[][] = new int[number + 1][arraySize];
		for(int i = 0; i < arraySize; i++){
			table[0][i] = 1;
		}
		for(int i = 1; i < number + 1; i++){
			for(int j = 0; j < arraySize; j++){
				int x = (i - a[j] >= 0) ? table[i - a[j]][j] : 0;
				int y = (j >= 1) ? table[i][j-1] : 0;
				table[i][j] = x + y;
			}
		}
		return table[number][arraySize - 1];
	}
	
	public static void main(String args[]){
		//Scanner s = new Scanner(System.in);
		//int a = s.nextInt();
		//List<Integer> array = new ArrayList<Integer>();
		int[] array = {1,2,3};
		//System.out.println("Enter an array");
		int size = array.length ;
		CoinChangeProblem c = new CoinChangeProblem();
		int result = c.recursiveWay(array, size, 4);
		int dpResult = c.dynamicWay(array, size, 4);
		System.out.println("Coin change problem " + result);
		System.out.println("Coin change problem " + dpResult);
	}

}
