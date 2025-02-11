
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        

        Scanner sc = new Scanner(System.in);
       

        

        //CLIENTE
        System.out.println("Insira o nome do cliente:");
        String nomeCliente = sc.nextLine();
        System.out.println("Insira o email do cliente:");
        String emailCliente = sc.nextLine();
        System.out.println("Insira a data de aniversário do cliente:");
        int niverCliente = sc.nextInt(); //converter para date
        
        Cliente cliente = new Cliente(nomeCliente, emailCliente, niverCliente);
       
        
        //PEDIDO
        System.out.println("Insira o status do pedido:");
        Status status = Status.valueOf(sc.next());
        
        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.println("Quantos itens estão no pedido?:");
        int n = sc.nextInt();

        for (int i=1; i <= n; i++){
            System.out.println("Insira os dados do pedido de número " + i + ":");  

            System.out.print("Produto: ");
            String nomeProduto = sc.next();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();

            Produto produto = new Produto(nomeProduto, precoProduto);
            
            System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			ItensProduto orderItem = new ItensProduto(quantidade, precoProduto,
             produto); 

			pedido.addItem(orderItem);
        }



		System.out.println();
		System.out.println("Conclusão dos pedidos:");
		System.out.println(pedido);
		
        
        sc.close();

    }
}
