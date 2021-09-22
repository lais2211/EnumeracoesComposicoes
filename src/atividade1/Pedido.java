package atividade1;

import atividade1.Entrega;

import java.util.Date;

public class Pedido {
    private Integer id;
    private Date momento;
    private Entrega status;

    public  Pedido (){}

    public Pedido(Integer id, Date momento, Entrega status) {
        this.id =id;
        this.momento=momento;
        this.status= status;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Entrega getStatus() {
        return status;
    }

    public void setStatus(Entrega status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido: " +
                "id=" + id +
                ", data: " + momento +
                ", status= " + status +
                '.';
    }
}
