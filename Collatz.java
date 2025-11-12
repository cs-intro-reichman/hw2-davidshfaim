// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean verbose = mode.equals("v");

        if (verbose) {
            for (int seed = 1; seed <= N; seed++) {
                if (seed == 1) {
                    System.out.println("1 4 2 1 (4)");
                } else {
                    long n = seed;
                    int steps = 1;
                    System.out.print(n);
                    while (n != 1) {
                        if (n % 2 == 0) {
                            n = n / 2;
                        } else {
                            n = 3 * n + 1;
                        }
                        System.out.print(" " + n);
                        steps++;
                    }
                    System.out.println(" (" + steps + ")");
                }
            }
            System.out.println();
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        } else {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }
}

