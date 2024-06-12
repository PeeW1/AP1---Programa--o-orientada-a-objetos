import javax.swing.JOptionPane;

public class CalculadoraITBI {

    public static void main(String[] args)  {
        String transacao= JOptionPane.showInputDialog("Qual o valor do imóvel:");
        double valorTransacao = Double.parseDouble(transacao);
        
        String venal = JOptionPane.showInputDialog("Qual o valor venal do imóvel");
        double valorVenal = Double.parseDouble(venal);
        
        String itbi = JOptionPane.showInputDialog("Qual a porcentagem do ITBI:");
        double porcentagemItbi= Double.parseDouble(itbi);
        
        double maiorValor = Math.max(valorTransacao, valorVenal);
        double valorImposto = maiorValor * (porcentagemItbi / 100);
        
        String mensagem = String.format("O valor do ITBI é: R$ %.2f", valorImposto);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}