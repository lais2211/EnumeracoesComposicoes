package contrato;

import java.util.Date;

public class ContratoHora {
    private Date data;
    private Double valor;
    private Integer horas;

    public ContratoHora(Date data,Double valor,Integer horas) {
        this.data = data;
        this.valor = valor;
        this.horas = horas;
        }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    Double horasTrabalhadas;

    {
        horasTrabalhadas = valor * horas;
    }

}
