import java.util.Scanner;

public class PascalTriangle {
	
	public static void printPascal(int r){
		for (int i=0; i< r ; i++){
			for(int j = 0; j<= i; j++){
				System.out.println(" " +pascal(i,j) + " ");
			}
		}
	}
	
	public static int pascal(int i, int j){
		if(j == 0){
			return 1;
		}else if (j == i){
			return 1;	
		}else{
			return pascal(i-1,j-1) + pascal(i-1,j);
		}
	}

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = scanner.nextInt();
		printPascal(row);	
		
	}
}
