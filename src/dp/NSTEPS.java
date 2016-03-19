package dp;

public class NSTEPS {
	public static int countWaysDP(int n, int[] map) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else if (map[n] > -1) {
			return map[n];
		} else {
			map[n] = countWaysDP(n - 1, map) + countWaysDP(n - 2, map) + countWaysDP(n - 3, map);
			return map[n];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[] map = new int[n+1];
		for(int i = 0; i < map.length;i++) {
			map[i] = -1;
		}
		System.out.println("No of ways:"+countWaysDP(n,map));

	}

}
