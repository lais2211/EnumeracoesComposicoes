import contrato.ContratoHora;
import contrato.Funcionario;
import departamento.Departamento;
import jdk.swing.interop.SwingInterOpUtils;
import nivel.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        SimpleDateFormat dataFormato = new SimpleDateFormat ("DD/MM/YYYY");


        System.out.println("Digite o nome do departamento:");
        String departamento= sc.nextLine();

        System.out.println("Digite as informações do (a) funcionario (a):");
        System.out.println("NOME: ");
        String name =sc.nextLine();
        System.out.println("NIVEL: ");
        String nivel = sc.nextLine();
        System.out.println("SALARIO BASE: ");
        Double salarioBase = sc.nextDouble();
        Funcionario func = new Funcionario(name, WorkLevel.valueOf(nivel),salarioBase,new Departamento(departamento));

        System.out.println("Quantos contratos "+ name + " tem:");
                int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.println("Digite a data do contrato "+ i+ ":");
            System.out.println("Exemplo: (DD/MM/YYYY)");
            Date contratoData = dataFormato.parse(sc.next());
            System.out.println("Valor por hora:");
            Double valor = sc.nextDouble();
            System.out.println("Duração do contrato em horas: ");
            Integer horas = sc.nextInt();

            ContratoHora contratos = new ContratoHora(contratoData,valor,horas);
            func.addContrato(contratos);

        }

        System.out.println();
        System.out.println("Digite o ano e mês que gostaria de calcular salario: (DD/YYYY)");
        String anoeMes = sc.next();
        int mes = Integer.parseInt(anoeMes.substring(0,2));
                int ano= Integer.parseInt(anoeMes.substring(3));


        System.out.println("Nome: " + func.getNome());
        System.out.println("Departamento: "+ func.getDepartamento().getNome());
        System.out.println("Salario de: "+ anoeMes+ ", no valor de: "+func.receber(ano,mes));

        sc.close();
        }

    }
