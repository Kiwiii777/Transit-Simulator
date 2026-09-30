public class dwell_time {

    static double headway = 0;
    static double dt = 0;
    static int num_per_hour;
    
    public static double calculate(int num_per_hour) {
        headway = 60/num_per_hour;
        dt = headway/2;
        return dt;
    }

    public static double getHeadway() {
        return headway;
    }

    public static double getDT() {
        return dt;
    }

    @Override
    public String toString() {
        return ("The dwell time @ " + num_per_hour + " buses is " + dt + " with a headway of " + headway);
    }
}