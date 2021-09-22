import atividade3.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Atividade3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        SimpleDateFormat dataFormato = new SimpleDateFormat ("dd/MM/yyy");


        System.out.println("Coloque os dados do cliente:");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Data de nascimento: (dd/mm/yyyy)");
        Date dataNascimento = dataFormato.parse(sc.nextLine());

        Cliente cliente = new Cliente(name,email,dataNascimento);

        System.out.println("Coloque o status do produto:");
        System.out.println("STATUS: ");
        String status = sc.nextLine();
        Pedido sta = new Pedido (StatusPedido.valueOf(status));

        Pedido pedido = new Pedido(new Date());

        System.out.println("Quantos produtos nesse pedido:");
        Integer n = sc.nextInt();

        for (int i = 0; i<n; i++) {

            System.out.println("Digite o nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o valor do produto: ");
            Double preço = sc.nextDouble();
            System.out.println("Digite a quantidade do produto: ");
            Integer quantidade = sc.nextInt();
            Produto produto = new Produto (nome,preço);
            PedidoItens pedidos = new PedidoItens(quantidade,preço,produto);
            pedido.addProdutos(pedidos);
            }

        System.out.println("Cliente: " + cliente.getNome()+ ", data de nascimento: "+ cliente.getDataNascimento()+ ", email: "+ cliente.getEmail());
        System.out.println( "Status do pedido: "+ sta.getStatus());
        System.out.println(pedido);








    }
}
