package src.main.java;
import java.util.Scanner;

public class Media_Notas {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        inserir_alunos();
        scanner.close();
    }

    public static void inserir_alunos() {
        System.out.print("Informe a quantidade de alunos: ");
        int quantidade_de_alunos = scanner.nextInt();

        if (quantidade_de_alunos <= 5) {
            inserir_notas(quantidade_de_alunos);
        }
        else {
            System.out.println("O limite de alunos é 5! Por favor insira novamente a quantidade de alunos.");
            inserir_alunos();
        }
    }

    public static void inserir_notas(int quantidade_de_alunos) {
        for (int i = 1; i <= quantidade_de_alunos; i++) {
            float soma = 0, nota = 0, media, menor = 10;

            System.out.printf("\nInsira as notas do aluno %d%n", i);

            for (int j = 1; j < 4; j++) {
                System.out.printf("Nota %d: ", j);
                nota = scanner.nextFloat();

                soma += nota;
                if (nota < menor) {
                    menor = nota;
                }
            }
            media = calcular_media(soma);
            System.out.printf("A média do %dº aluno é %.1f%n", i, media);
            nota_4(media, soma, menor);
        }
    }

    public static float calcular_media(float soma) {
        return soma / 3;
    }

    public static void nota_4(float media, float soma, float menor) {
        if (media >= 7) {
            System.out.println("APROVADO");
        } 
        else {
            System.out.print("Insira a nota da prova 4: ");
            float nota_4 = scanner.nextFloat();

            if (nota_4 > menor) {
                soma = soma - menor + nota_4;
                media = calcular_media(soma);

                System.out.printf("Nova média: %.1f%n", media);
                if (media >= 7) {
                    System.out.println("APROVADO");
                } else {
                    System.out.println("REPROVADO");
                }
            } 
            else {
                System.out.println("REPROVADO");
            }
        }
    }
}
