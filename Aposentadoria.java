import java.util.Scanner;


public class Aposentadoria {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();

        System.out.print("Qual o seu sexo(Somenteo M/F)? ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Quantos anos de contribuição? ");
        int anosContrubuicao = scanner.nextInt();

        if (idade >= 65 & anosContrubuicao >= 35 & sexo == 'M'){
            System.out.print("Você pode se aposentar");
        } 
        
        if (idade < 65 & sexo == 'M'){
            int idadeFaltante = 65 - idade;
            System.out.printf("Voce nao pode se aposentar ainda faltam %d anos", idadeFaltante);
        }

        if (idade >= 65 & anosContrubuicao < 35){
            int contribuicaoFaltante = 35 - anosContrubuicao;
            System.out.printf("Voce nao pode se aposentar ainda faltam %d anos de contribuição", contribuicaoFaltante);
        }
        
        if (idade >= 60 & anosContrubuicao >= 30 & sexo =='F'){
            System.out.print("Você pode se aposentar");
        }

        if (idade < 60 & sexo == 'F'){
            int idadeFaltante = 65 - idade;
            System.out.printf("Voce nao pode se aposentar ainda faltam %d anos", idadeFaltante);
        }

        if (idade >= 60 & anosContrubuicao < 30){
            int contribuicaoFaltante = 35 - anosContrubuicao;
            System.out.printf("Voce nao pode se aposentar ainda faltam %d anos de contribuição", contribuicaoFaltante);
        }
        scanner.close();
    }

}
