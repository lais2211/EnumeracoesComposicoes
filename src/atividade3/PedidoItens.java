package atividade3;

import java.util.ArrayList;
import java.util.List;

public class PedidoItens {

    private Integer quantidade;
    private Double preço2;
    private StatusPedido status;

    List <Produto> produtos = new ArrayList<>();

    public PedidoItens (Integer quantidade) {

        this.quantidade = quantidade;

    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreço2() {
        return preço2;
    }

    public void setPreço2(Double preço2) {
        this.preço2 = preço2;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public PedidoItens (StatusPedido status) {

        this.status = status;

    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void addProdutos (Produto produto) {produtos.add(produto);}
    public void removeProdutos (Produto produto) {produtos.remove(produto);}


}
