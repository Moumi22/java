import java.util.Scanner;
public class DivideByZeroNoExceptionHandling 
{
    public static int quotient(int numerotor, int denominator)
    {
        return numerotor / denominator;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Please enter an intrger numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please enter an intrger denominator: ");
        int denominator = scanner.nextInt();

        int result = quotient(numerator, denominator);
        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

    }

}
