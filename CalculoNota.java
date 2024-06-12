import javax.swing.JOptionPane;

public class CalculoNota {
    public static void main(String[] args){
        String prova1 = JOptionPane.showInputDialog("Qual a nota da primeira prova?");
        double valorProva1 = Double.parseDouble(prova1);

        String prova2 = JOptionPane.showInputDialog("Qual a nota da segunda prova?");
        double valorProva2 = Double.parseDouble(prova2);

        String trabalho = JOptionPane.showInputDialog("Qual a nota do trabalho?");
        double valorTrabalho = Double.parseDouble(trabalho);

        double media = (valorProva1 + valorProva2 + valorTrabalho) / 3;

        String mensagem = String.format("A sua média é: %.2f", media);
        JOptionPane.showMessageDialog(null, mensagem);

        if (media >= 6) {
            JOptionPane.showMessageDialog(null,"Você passou :)");
        } else {
            JOptionPane.showMessageDialog(null,"Você reprovou :(");
        }
    }
}
