
public class CtoFTableDisplay {

    public static void main(String[] args) {
        // Print the table header
        System.out.println("Celsius\tFahrenheit");
        System.out.println("----------------------");

        // Loop through Celsius values from -100 to 100
        for (int celsius = -100; celsius <= 100; celsius++) {
            // Print the Celsius value and the corresponding Fahrenheit value
            System.out.printf("%d\t%.2f\n", celsius, CtoF(celsius));
        }
    }

    // Method to convert Celsius to Fahrenheit
    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}
