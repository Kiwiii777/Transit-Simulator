public class dwell_time {

    static double headway = 0;
    static double dt = 0;
        
    public static double calculate(int num_per_hour) {
        headway = 60.0/num_per_hour;
        dt = headway/2;
        return dt;
    }

    public static double getHeadway() {
        return headway;
    }

    public static double getDT() {
        return dt;
    }
}