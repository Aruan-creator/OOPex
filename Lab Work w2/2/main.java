import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter convert = new Converter();

        while(true) {
            System.out.println("Choose one option: ");
            System.out.println("1. Convert Farenheit to Celsius.");
            System.out.println("2. Convert Inch to Meter.");
            System.out.println("3. Exit.");
            
            int option = scanner.nextInt();

            switch(option){
                case(1):
                System.out.println("Enter a degree in Farenheit");
                double farenheit = scanner.nextFloat();
                System.out.println(convert.FarenheitToCelsius(farenheit));
                break;
                
                case(2): 
                System.out.println("Enter a degree in Inch");
                double inch = scanner.nextFloat();
                System.out.println(convert.InchToMeter(inch));
                break;

                case(3):
                break;
            }

            break;
        }      
    }
}


class Converter {

    public Converter() {

    }

    public double FarenheitToCelsius(double farenheit){
        double celsius = (farenheit - 32) * (double)5/9;
        return celsius;
    }

    public double InchToMeter(double inch) {
        double meters = inch * 2.54 / 100;
        return meters;
    }



}
