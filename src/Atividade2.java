import departamento.Departamento;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o nome do departamento:");
        String nome= sc.nextLine();
        Departamento derp = new Departamento(nome);

        System.out.println("Digite as informações do (a) funcionario (a):");
        System.out.println("NOME: ");
        String name =sc.nextLine();
        System.out.println("NIVEL: ");

        System.out.println();

    }
}
