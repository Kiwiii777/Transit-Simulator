public class DwellTimeAdvanced {

    static double headway = 0;
    static double coeff_variation = 0.0;
    static double standard_deviation = 0.0;
    static double coeff_variation_headway = 0.0;
    static double dt = 0;

    static double wait_time = 0.0;
        
    public static double calculate(int num_per_hour, double[] timetable) {
        headway = 60.0/num_per_hour;
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum+=timetable[i];
        }
        double mean = sum/5;
        double[] deviation = new double[5];
        sum = 0;
        for (int j = 0; j < 5; j++) {
            deviation[j] = timetable[j]-mean;
            deviation[j] = Math.pow(deviation[j], 2);
            sum += deviation[j];
        }
        double variance = sum/5;
        standard_deviation = Math.sqrt(variance);
        wait_time = (headway/2)*(1+Math.pow(2,coeff_variation_headway));
        
        return 0.0;
    }

    public static double getHeadway() {
        return headway;
    }

    public static double getDT() {
        return dt;
    }
}