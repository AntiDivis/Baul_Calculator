import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //The Inputs
        System.out.println("Input First Number:");
        double X = scan.nextDouble();
        System.out.println("Input Second Number:");
        double Y = scan.nextDouble();

        //The Outputs
        System.out.println("Addition: " + (X + Y));
        System.out.println("Subtraction" + (X - Y));
        System.out.println("Multiplication: " + (X * Y));
        System.out.println("Division: " + (X / Y));
    }

}
