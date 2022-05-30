package exercices.br.com.dio;

public class Loan {
    public static double rateTwoInstallments() {
        return 0.25;
    }

    public static double rateThreeInstallments() {
        return 0.45;
    }

    public static void calculate(double value, int installments) {
        if (installments == 2) {
            double finalValue = value + (value * rateTwoInstallments());
            System.out.println(finalValue);
        } else if (installments == 3) {
            double finalValue = value + (value * rateThreeInstallments());
            System.out.println(finalValue);
        } else {
            System.out.println("Number of installments not accepted!");
        }
    }
}
