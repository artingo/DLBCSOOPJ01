package session4;

public class Session4 {
    static int instanceCounter;

    public Session4() {
        instanceCounter++;
    }

    // private = diary
    // protected = family album
    // package private = working colleagues
    // public = telephone book
    public static void main(String[] args) {
        Session4 session4 = new Session4();

        int nrOfArguments = args.length;
        double[] doubles = new double[nrOfArguments];
        for (int i = 0; i < nrOfArguments; i++) {
            doubles[i] = Double.parseDouble(args[i]);
            double squareRoot = session4.sqrt(doubles[i]);
            System.out.println("sqrt(" + doubles[i] + ")  = " + squareRoot);
        }
    }

    public double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t)
            t = (c / t + t) / 2.0;
        return t;
    }


}
