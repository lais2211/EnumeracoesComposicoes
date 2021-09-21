package atividade2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
    private String nome;
    private WorkLevel nivel;
    private Double salarioBase;
    private Departamento departamento;

    List <ContratoHora> contratos = new ArrayList <>();

    public Funcionario(String nome, WorkLevel nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public WorkLevel getNivel() {
        return nivel;
    }

    public void setNivel(WorkLevel nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public void addContrato (ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removeContrato (ContratoHora contrato) {
        contratos.remove(contrato);
    }

    public Double receber (int ano, int mes) {
        Double soma = salarioBase;
        Calendar calendario =  Calendar.getInstance();
        for (ContratoHora c : contratos) {
            calendario.setTime(c.getData());
            int c_ano = calendario.get(Calendar.YEAR);
                    int c_mes= 1+ calendario.get(Calendar.MONTH);
                    if (mes == c_mes && ano == c_ano ){
                        soma += c.totalHorasValor();
                    }
        }
        return soma;

        }

     }




