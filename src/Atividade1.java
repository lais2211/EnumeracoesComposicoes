import entrega.Entrega;
import pedido.Pedido;

import java.util.Date;

public class Atividade1 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(2211,new Date(), Entrega.PROCESSANDO);
        System.out.println(pedido);

    }
}
