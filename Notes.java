import java.util.ArrayList;
import java.util.HashMap;

class Notes {
	public static void main(String[] args) {
		towerOfHanoi(2);
	}

	public static String[] towerOfHanoi(int n) {
		if (n == 0) {
			return new String[]{};
		}

		HashMap<Integer, String> pegs = new HashMap<Integer, String>();
		pegs.put(1, "L");
		pegs.put(2, "M");
		pegs.put(3, "R");

		int auxiliary, dest;

		if (n % 2 != 0) {
			 auxiliary = 2;
			 dest = 3;
		} else {
			auxiliary = 3;
			dest = 2;
		}

		ArrayList<String> moves = new ArrayList<String>();

		towerHelper(n, 1, auxiliary, dest, moves, pegs);

		return moves;
	}

	public static void towerHelper(int n, int source, int auxiliary, int dest, ArrayList<String> moves, HashMap<Integer, String> pegs) {
		if (n == 1) {
			moves.add(pegs.get(source) + pegs.get(dest));
			return;
		}
		towerHelper(n - 1, source, auxiliary, dest, moves, pegs);
        moves.add(pegs.get(source) + pegs.get(dest));
        towerHelper(n - 1, auxiliary, dest, source, moves, pegs);
	}
}
