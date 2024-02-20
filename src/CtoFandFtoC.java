import java.util.Scanner;

public class CtoFandFtoC
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double fahrenheit = 0.0;
        double celsius = 0.0;
        String type;

        do
        {
            System.out.print("Enter the type of temperature you want to convert from (C or F): ");
            type = in.nextLine().toUpperCase();

            if (type.equals("F"))
            {
                do
                {
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.println("Invalid input. Please enter a valid number.");
                        in.nextLine();
                    }
                    fahrenheit = in.nextDouble();

                } while (fahrenheit < -459.67);

                celsius = (fahrenheit - 32) * 5/9;
                System.out.printf(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
            } else if (type.equals("C"))
            {
                do
                {
                    System.out.print("Enter the temperature in Celsius: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.println("Invalid input. Please enter a valid number.");
                        in.nextLine();
                    }
                    celsius = in.nextDouble();
                } while (celsius < -273.15);

                fahrenheit = celsius * 9/5 + 32;
                System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
            } else
            {
                System.out.println("Invalid input. Please enter 'F' for Fahrenheit or 'C' for Celsius.");
            }

            in.nextLine();

        } while (!type.equals("F") && !type.equals("C"));
    }
}
