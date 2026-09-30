import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {

            // choice input
            System.out.println("Choose an option:\n1. Passenger Capacity @ Maximum Load Point\n2. Quit\n3. Dwell Time\n4. Test");
            int choice = scanner.nextInt();
            if (choice == 1) {

                // p_mlp input
                System.out.println("Enter the number of buses: ");
                int buses = scanner.nextInt();
                System.out.println("Enter the number of buses per hour: ");
                int number = scanner.nextInt();

                // results
                System.out.println("The passenger capacity at the maximum-load point is " + p_mlp_calc.calculate(buses, number));
                System.out.println("Simulation End.");
                System.out.println();

            //quit
            } else if (choice == 2) {
                running = false;
            
            // dwell time choice
            } else if (choice == 3) {

                // dwell time input
                System.out.println("Enter the number of buses per hour: ");
                int num_per_hour = scanner.nextInt();

                // results
                dwell_time.calculate(num_per_hour);
                System.out.println("The wait time @ " + num_per_hour + " buses per hour is " + dwell_time.getDT() + " minutes with a headway of " + dwell_time.getHeadway());
                System.out.println("Simulation End.");
                System.out.println();
            } else if (choice == 4) {
                BusSamples.generateTimetable();
                System.out.println("Bus:");
                int bus = scanner.nextInt();
                System.out.println(BusSamples.getBusTime(bus));
            }
        }
    }
}