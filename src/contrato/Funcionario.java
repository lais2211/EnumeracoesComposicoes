package contrato;

import departamento.Departamento;
import nivel.WorkLevel;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private WorkLevel nivel;
    private Double salarioBase;
    private Departamento departamento;

    List <ContratoHora> contratos = new ArrayList <>();

    public Funcionario(String nome,WorkLevel nivel, Double salarioBase,Departamento departamento) {
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



}
