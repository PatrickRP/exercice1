package exercices.br.com.dio;

public class Main {
    public static void main(String[] args) {

        int soma = Calculate.some(2,5);
        System.out.println(soma);

        int subtracao = Calculate.subtraction(2,5);
        System.out.println(subtracao);

        int multiplicacao = Calculate.multiplication(2,5);
        System.out.println(multiplicacao);

        double divisao = Calculate.division(2,5);
        System.out.println(divisao);

    }
}
