import java.util.Scanner;

public class TemperatureConverter
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter App");
        System.out.println("-------------------------");
        System.out.println("Options:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1/2): ");

        int choice = scanner.nextInt();

        if (choice == 1) 
        {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        } 
        else if (choice == 2) 
        {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        } 
        else 
        {
            System.out.println("Invalid choice. Please select either 1 or 2.");
        }

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) 
    {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) 
    {
        return (fahrenheit - 32) * 5 / 9;
    }
}
