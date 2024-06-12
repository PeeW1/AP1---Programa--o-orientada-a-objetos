import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String login = "java8";
         String  senha = "java8";

        int tentativas = 3;
        boolean acessoPermitido = false;

        while (tentativas > 0 && !acessoPermitido) {
            
            System.out.print("Login: ");
            String username = scanner.nextLine();

            
            System.out.print("Senha: ");
            String password = scanner.nextLine();

            if (username.equals(login) & password.equals(senha)) {
                acessoPermitido = true;
                System.out.println("Acesso permitido");
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Nome de usuário ou senha incorretos. Você tem " + tentativas + " tentativas restantes.");
                } else {
                    System.out.println("Nome de usuário ou senha incorretos. Você atingiu o número máximo de tentativas. Acesso bloqueado.");
                }
            }
        }

        scanner.close();
    }
}
