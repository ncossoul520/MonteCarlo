public class Run {
    final static int NUM_RUNS  = 10000;
    final static int NUM_STEPS = 100;
    final static int MAX_STEPS = 100;

    public static void main(String[] args) {
//        distance2D.Run(NUM_RUNS, NUM_STEPS);
//        distance3D.Average(NUM_RUNS, MAX_STEPS);
        distance3D.Max(NUM_RUNS, MAX_STEPS);
    }
}
