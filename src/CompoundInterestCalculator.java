import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter Annual Interest Rate: ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter Compounding Frequency per year: ");
        int compoundFrequency = scanner.nextInt();

        System.out.println("Enter Time in years: ");
        double time = scanner.nextDouble();

        double decimalRate = annualRate/100;
        double base = 1+(decimalRate/compoundFrequency);
        double exponent = compoundFrequency*time;
        double finalAmount = principal*Math.pow(base,exponent);

        System.out.printf("\nFinal Amount: %.2f", finalAmount);
    }
}
