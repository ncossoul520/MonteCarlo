public class distance2D {
    private static int num_runs;
    private static int num_steps;
    private static int x, y;

    public static void Run(int runs, int steps) {
        num_runs = runs;
        num_steps = steps;

        double dist_total = 0;
        for (int run = 0; run < num_runs; run++) {
            x = 0;
            y = 0;
            double dist = 0;
            for (int step=1; step <= num_steps ; step++) {
                Move();
            }
            dist_total += distanceCalc();
        }
        displayAvg( dist_total );
    }

    private static void Move() {
        int direction = (int)(Math.random()*4);
        if      (direction < 1) { x++; }
        else if (direction < 2) { x--; }
        else if (direction < 3) { y++; }
        else                    { y--; }
    }

    private static double distanceCalc() {
        return Math.sqrt( x*x + y*y );
    }

    private static void displayAvg(double dist_total) {
        System.out.print("Average distance of " + num_steps + " steps over " + num_runs + " runs: ");
        System.out.println( dist_total / num_runs );
    }
}
