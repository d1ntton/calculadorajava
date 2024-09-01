import java.util.Scanner;

public class NotacaoCientifica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Insira o primeiro número em notação científica (ex: 1.23e4): ");
        double num1 = scanner.nextDouble();
        System.out.print("Insira o segundo número em notação científica (ex: 5.67e3): ");
        double num2 = scanner.nextDouble();


        System.out.println("Escolha a operação:");
        System.out.println("1) Adição");
        System.out.println("2) Subtração");
        System.out.println("3) Multiplicação");
        System.out.println("4) Divisão");
        int operacao = scanner.nextInt();

        double resultado = 0;

      
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}
