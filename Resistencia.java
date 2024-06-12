import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor da primeira resistência: ");
        int res1 = scanner.nextInt();

        System.out.print("Qual o valor da segunda resistência: ");
        int res2 = scanner.nextInt();

        System.out.print("Qual o valor da terceira resistência: ");
        int res3 = scanner.nextInt();

        System.out.print("Qual o valor da quarta resistência: ");
        int res4 = scanner.nextInt();

        
        int resEquivalente = res1 + res2 + res3 + res4;

        
        int maxRes = Math.max(Math.max(res1, res2), Math.max(res3, res4));
        int minRes = Math.min(Math.min(res1, res2), Math.min(res3, res4));

        
        System.out.printf("Resistência Equivalente: %d ohms%n", resEquivalente);
        System.out.printf("Maior Resistência: %d ohms%n", maxRes);
        System.out.printf("Menor Resistência: %d ohms%n", minRes);

        scanner.close();
    }
}
