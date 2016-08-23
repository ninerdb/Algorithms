
/*
 * You are in an infinite 2D grid where you can move in any of the 8 directions :

 (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

Example :

Input : [(0, 0), (1, 1), (1, 2)]
Output : 2
It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).

This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.
 */

import java.util.ArrayList;

public class InfiniteGrid {
	// X and Y co-ordinates of the points in order.
	// Each point is represented by (X.get(i), Y.get(i))
	public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
		int s1 = X.size();
		int s2 = Y.size();
		int sol = 0;
		int numOfSteps = 0;
		for (int i = 1; i < s1; i++) {
			sol = sol + (Math.abs(X.get(i) - X.get(i - 1)) < Math.abs(Y.get(i) - Y.get(i - 1))? Math.abs(Y.get(i) - Y.get(i - 1)) : Math.abs(X.get(i) - X.get(i - 1)));
			//sqrtsol = (int) Math.sqrt((Math.abs(X.get(i) - X.get(i - 1)) < Math.abs(Y.get(i) - Y.get(i - 1))? Math.abs(Y.get(i) - Y.get(i - 1)) : Math.abs(X.get(i) - X.get(i - 1))));
			numOfSteps += Math.max(Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)));
		}
		System.out.println(sol);
		System.out.println(numOfSteps);
		return sol;
	}

	public int coverPoints1(ArrayList<Integer> X, ArrayList<Integer> Y) {
		int s1 = X.get(0);
		int s2 = Y.get(0);
		int ans = 0;
		for (int i = 1; i < X.size(); i++) {
			// ans = ans +
			// (Math.abs(X.get(i)-X.get(i-1))<Math.abs(Y.get(i)-Y.get(i-1))?Math.abs(Y.get(i)-Y.get(i-1)):Math.abs(X.get(i)-X.get(i-1)));
			ans = ans + Math.max(Math.abs(s1 - X.get(i)), Math.abs(s2 - Y.get(i)));
		}	
		System.out.println(ans);
		return ans;
	}

	public static void main(String args[]) {
		ArrayList<Integer> Y = new ArrayList<Integer>();
		ArrayList<Integer> X = new ArrayList<Integer>();

		/*
		 * X.add(0); X.add(1); X.add(2); X.add(3); X.add(4); X.add(5);
		 * X.add(-7); X.add(6); Y.add(0); Y.add(1); Y.add(2); Y.add(3);
		 * Y.add(4); Y.add(5); Y.add(-10); Y.add(-5);
		 */
		//4, 8, -7, -5, -13, 9, -7, 8
		//4, -15, -10, -3, -13, 12, 8, -8
		X.add(4);
		X.add(8);
		X.add(-7);
		X.add(-5);
		X.add(-13);
		X.add(9);
		X.add(-7);
		X.add(8);
		Y.add(4);
		Y.add(-15);
		Y.add(-10);
		Y.add(-3);
		Y.add(-13);
		Y.add(12);
		Y.add(8);
		Y.add(-8);
		InfiniteGrid infinite = new InfiniteGrid();
		infinite.coverPoints(X, Y);
		infinite.coverPoints1(X, Y);

	}
}
