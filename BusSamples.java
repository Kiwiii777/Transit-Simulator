import java.util.Arrays;
public class BusSamples {
    static int hour = 10;
    static double[] timetable = new double[5];
    public static void generateTimetable() {
        for (int i = 0; i < 5; i++) {
            timetable[i] = (double)((int)(Math.random()*101));
            timetable[i] = timetable[i]/100+hour;
        }
        System.out.println(Arrays.toString(timetable));
    }

    public static double getBusTime(int i) {
        return timetable[i];
    }
}