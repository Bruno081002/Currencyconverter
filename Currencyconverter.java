import java.util.Scanner;

public class Currencyconverter {
    public static void main(String[] args) {
        System.out.println("1.USD");
        System.out.println("2.EUR");
        System.out.println("3.MZN");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose the currency you want to convert from: ");
            int currency1 = scanner.nextInt();
            System.out.println("Choose the currency you want to convert to: ");
            double currency2 = scanner.nextDouble();
            switch (currency1) {
                case 1:
                    USD_to_Cur(currency2);
                    break;
                case 2:
                    EUR_to_Cur(currency2);
                    break;
                case 3:
                    MZN_to_Cur(currency2);
                    break;
                default:
                    System.out.println("Invalid currency");
                    break;
            }
        }
    }

    public static void USD_to_Cur(double currency2) {
        System.out.println("1. USD= " + 63.91 + " MZN");
        System.out.println();

        System.out.println(currency2 + "USD= " + (currency2 * 63.91) + " MZN");
        System.out.println();

        System.out.println("1. USD= " + 0.95 + " EUR");
        System.out.println();

        System.out.println(currency2 + "USD= " + (currency2 * 0.95) + " EUR");
        System.out.println();
    }

    public static void EUR_to_Cur(double currency2) {
        System.out.println("2. EUR= " + 67.52 + " MZN");
        System.out.println();

        System.out.println(currency2 + "EUR= " + (currency2 * 67.52) + " MZN");
        System.out.println();

        System.out.println("2. EUR= " + 1.06 + " USD");
        System.out.println();

        System.out.println(currency2 + " EUR= " + (currency2 * 0.95) + " USD");
        System.out.println();
    }
    
    public static void MZN_to_Cur(double currency2) {
        System.out.println("3. MZN= " + 0.016 + " USD");
        System.out.println();

        System.out.println(currency2 + " MZN= " + (currency2 * 0.016) + " USD");
        System.out.println();

        System.out.println("3. MZN= " + 0.015 + " EUR");
        System.out.println();

        System.out.println(currency2 + " MZN= " + (currency2 * 0.015) + " EUR");
        System.out.println();
    }
        
}