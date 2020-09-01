public class distance3D {
    private static int num_runs;
    private static int max_steps;
    private static int x, y, z;

    public static void Average(int runs, int steps) {
        num_runs = runs;
        max_steps = steps;

        for (int num_steps=1; num_steps <= max_steps ; num_steps++) {
            double dist_total = 0;
            for (int run = 0; run < num_runs; run++) {
                x = 0;
                y = 0;
                z = 0;
                for (int step = 1; step <= num_steps; step++) {
                    Move();
                }
                dist_total += distanceCalc();
            }
            System.out.println(num_steps + "," + dist_total / num_runs );
        }
    }


    public static void Max(int runs, int steps) {
        num_runs = runs;
        max_steps = steps;

        for (int num_steps=1; num_steps <= max_steps ; num_steps++) {
            double max_total = 0;
            for (int run = 0; run < num_runs; run++) {
                x = 0;
                y = 0;
                z = 0;
                double max = 0;
                for (int step = 1; step <= num_steps; step++) {
                    Move();
                    double dist = distanceCalc();
                    if (dist > max) {
                        max = dist;
                    }
                }
                max_total += max;
            }
            System.out.println(num_steps + "," + max_total / num_runs);
        }
    }


    private static void Move() {
        int direction = (int)(Math.random()*6);
        if      (direction < 1) { x++; }
        else if (direction < 2) { x--; }
        else if (direction < 3) { y++; }
        else if (direction < 4) { y--; }
        else if (direction < 5) { z++; }
        else                    { z--; }
    }

    private static double distanceCalc() {
        return Math.sqrt( x*x + y*y + z*z );
    }
}
