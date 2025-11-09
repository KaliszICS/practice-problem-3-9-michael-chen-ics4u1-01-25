import java.util.ArrayList;
import java.util.HashMap;

class PracticeProblem {
	public static void main(String[] args) {
		for (String i : towerOfHanoi(4)) {
			System.out.print(i + " ");
		}
	}

	public static String[] towerOfHanoi(int n) {
		if (n == 0) {
			return new String[]{};
		}

		ArrayList<String> moves = new ArrayList<String>();

		towerHelper(n, "L", "M", "R", moves);

		return moves.toArray(new String[0]);
	}

	public static void towerHelper(int n, String source, String auxiliary, String dest, ArrayList<String> moves) {
		if (n == 0) {
			return;
		}
		towerHelper(n - 1, source, dest, auxiliary, moves);
		System.out.println("Move " + (moves.size()) + ": " + source + " " + dest);
        moves.add(source + dest);
        towerHelper(n - 1, auxiliary, source, dest, moves);
	}
}
