import java.util.Scanner;

public class DescontoProduto {

    public static void main(String[] args) {
        // Cria uma instância do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor do produto ao usuário
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        // Solicita a porcentagem de desconto ao usuário
        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();

        // Calcula o valor do desconto
        double valorDesconto = valorProduto * (porcentagemDesconto / 100);

        // Calcula o preço final do produto após aplicar o desconto
        double precoFinal = valorProduto - valorDesconto;

        // Exibe o valor do desconto e o preço final do produto
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final do produto: R$ %.2f%n", precoFinal);

        // Fecha o scanner
        scanner.close();
    }
}