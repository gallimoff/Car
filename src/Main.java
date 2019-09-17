import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Fuel consumption per 100 km: ");
        double consumption = in.nextDouble();
        System.out.print("The remaining fuel in the tank liters : ");
        double remaining = in.nextDouble();
        int result = (int) (remaining / consumption * 100);
        System.out.print("Fuel left for  " + result + " km");
        in.close();
    }
}
