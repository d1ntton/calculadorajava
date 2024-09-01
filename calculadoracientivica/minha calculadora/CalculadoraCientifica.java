import java.util.Scanner;

public class CalculadoraCientifica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Científica");
        System.out.println("Escolha uma operação:");
        System.out.println("1) Adição");
        System.out.println("2) Subtração");
        System.out.println("3) Multiplicação");
        System.out.println("4) Divisão");
        System.out.println("5) Potência");
        System.out.println("6) Raiz Quadrada");
        System.out.println("7) Seno");
        System.out.println("8) Cosseno");
        System.out.println("9) Tangente");
        System.out.println("10) Logaritmo Natural");

        int operacao = scanner.nextInt();
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = realizarSoma(scanner);
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = realizarSubtracao(scanner);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = realizarMultiplicacao(scanner);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = realizarDivisao(scanner);
                System.out.println("Resultado da divisão: " + resultado);
                break;
            case 5:
                resultado = realizarPotencia(scanner);
                System.out.println("Resultado da potência: " + resultado);
                break;
            case 6:
                resultado = realizarRaizQuadrada(scanner);
                System.out.println("Resultado da raiz quadrada: " + resultado);
                break;
            case 7:
                resultado = realizarSeno(scanner);
                System.out.println("Resultado do seno: " + resultado);
                break;
            case 8:
                resultado = realizarCosseno(scanner);
                System.out.println("Resultado do cosseno: " + resultado);
                break;
            case 9:
                resultado = realizarTangente(scanner);
                System.out.println("Resultado da tangente: " + resultado);
                break;
            case 10:
                resultado = realizarLogaritmo(scanner);
                System.out.println("Resultado do logaritmo natural: " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }

    private static double realizarSoma(Scanner scanner) {
        System.out.print("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Insira o segundo número: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    private static double realizarSubtracao(Scanner scanner) {
        System.out.print("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Insira o segundo número: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    private static double realizarMultiplicacao(Scanner scanner) {
        System.out.print("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Insira o segundo número: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    private static double realizarDivisao(Scanner scanner) {
        System.out.print("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Insira o segundo número: ");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN; 
        }
    }

    private static double realizarPotencia(Scanner scanner) {
        System.out.print("Insira a base: ");
        double base = scanner.nextDouble();
        System.out.print("Insira o expoente: ");
        double expoente = scanner.nextDouble();
        return Math.pow(base, expoente);
    }

    private static double realizarRaizQuadrada(Scanner scanner) {
        System.out.print("Insira um número: ");
        double num = scanner.nextDouble();
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Erro: Raiz quadrada de número negativo não é permitida.");
            return Double.NaN; 
        }
    }

    private static double realizarSeno(Scanner scanner) {
        System.out.print("Insira um ângulo em graus: ");
        double angulo = scanner.nextDouble();
        return Math.sin(Math.toRadians(angulo));
    }

    private static double realizarCosseno(Scanner scanner) {
        System.out.print("Insira um ângulo em graus: ");
        double angulo = scanner.nextDouble();
        return Math.cos(Math.toRadians(angulo));
    }

    private static double realizarTangente(Scanner scanner) {
        System.out.print("Insira um ângulo em graus: ");
        double angulo = scanner.nextDouble();
        return Math.tan(Math.toRadians(angulo));
    }

    private static double realizarLogaritmo(Scanner scanner) {
        System.out.print("Insira um número: ");
        double num = scanner.nextDouble();
        if (num > 0) {
            return Math.log(num);
        } else {
            System.out.println("Erro: Logaritmo de número não positivo não é permitido.");
            return Double.NaN; 
        }
    }
}
