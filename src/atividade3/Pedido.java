package atividade3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date momentoDoPedido;
    private StatusPedido status;
    private Cliente cliente;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    List<PedidoItens> produtos = new ArrayList<PedidoItens>();

    public Pedido (Date momentoDoPedido){
        this.momentoDoPedido = momentoDoPedido;

    }

    public Pedido (StatusPedido status) {
        this.status = status;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void addProdutos(PedidoItens produto) {
        produtos.add(produto);
    }

    public void removeProdutos(PedidoItens produto) {
        produtos.remove(produto);
    }

    public Double total (){
        double soma = 0;
        for (PedidoItens pt : produtos) {
            soma = soma+pt.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("O pedido foi feito dia: ");
        sb.append(sdf.format(momentoDoPedido));
                sb.append(", os produtos são: ");
                for (PedidoItens produto: produtos) {
                    sb.append(produto);}
                    sb.append("O preço total é de: R$");
                sb.append(total());
                return sb.toString();
    }
}
