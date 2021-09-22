package atividade3;

import java.util.ArrayList;
import java.util.List;

public class PedidoItens {

    private Integer quantidade;
    private Double preço;
    private Produto produto;

    private StatusPedido status;

    List<Produto> produtos = new ArrayList<>();

    public PedidoItens (){}

    public PedidoItens(Integer quantidade, Double preço, Produto produto) {

        this.quantidade = quantidade;
        this.preço = preço;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public PedidoItens(StatusPedido status) {

        this.status = status;

    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void addProdutos(Produto produto) {
        produtos.add(produto);
    }

    public void removeProdutos(Produto produto) {
        produtos.remove(produto);
    }

    public Double subTotal() {
        return preço * quantidade;
    }

    @Override
    public String toString() {
        return "O pedido equivale a: "
                + getProduto().getNome()
                +", no valor de: R$"
                + getProduto().getPreço()
                + ", sua quantidade é de: "
                + getQuantidade()
                + ", totalizando: R$"
                + subTotal();

    }
}
