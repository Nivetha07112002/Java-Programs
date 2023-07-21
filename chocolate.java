
/*
    Time complexity: O(C!)
    Space complexity: O(C)
    
    Where 'C' is the number of cuts.
*/
import java.util.Arrays;

public class chocolate {

	private static int helper(int n, int[] cuts, int startIdx, int endIdx) {
		// Base case.
		if (endIdx - startIdx <= 1) {
			return 0;
		}

		// To store total cost.
		int totalCost = Integer.MAX_VALUE;

		for (int i = startIdx + 1; i < endIdx; ++i) {

			// Calculate cost at each cut.
			int cost1 = helper(n, cuts, startIdx, i);
			int cost2 = helper(n, cuts, i, endIdx);

			// Find minimum.
			totalCost = Math.min(cost1 + cost2, totalCost);
		}

		// Add length of the cut.
		totalCost += cuts[endIdx] - cuts[startIdx];

		// Memoize and return.
		return totalCost;
	}

	public static int cost(int n, int c, int cut[]) {
		// Add endpoints.
		int cuts[] = new int[c + 2];
		for (int i = 0; i < cut.length; i++) {
			cuts[i + 1] = cut[i];
		}
		cuts[0] = 0;
		cuts[c + 1] = n;

		// Sort the array.
		Arrays.sort(cuts);

		// Call the helper function.
		return helper(n, cuts, 0, cuts.length - 1);
	}
}