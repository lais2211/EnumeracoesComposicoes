package atividade3;

public class PedidoItens {

    private Integer quantidade;
    private Double preço;
    private Produto produto;

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
