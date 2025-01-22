import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Info info;

        System.out.println("Insira o número da conta:");
        int numConta = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Deseja depositar um valor inicial? (s/n)");
        char SN = sc.next().charAt(0);

        if (SN == 's') {
            System.out.println("Insira quanto quer depositar inicialmente:");
            double balanco = sc.nextDouble();
            info = new Info(numConta, nome, balanco);
        } else {
            info = new Info(numConta, nome);
        }

        int decisao = 0;

        while (decisao != 3) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1) Depósito");
            System.out.println("2) Saque (Taxa de R$ 5,00)");
            System.out.println("3) Sair");

            System.out.print("Digite sua escolha: ");
            if (sc.hasNextInt()) {
                decisao = sc.nextInt();
            } else {
                System.out.println("Entrada inválida, insira um número entre 1 e 3.");
                sc.next(); 
                continue;
            }

            switch (decisao) {
                case 1:
                    System.out.println("Insira quanto deseja depositar:");
                    double aDepositar = sc.nextDouble();
                    info.Deposito(aDepositar);
                    exibirInformacoes(info);
                    break;

                case 2:
                    System.out.println("Insira quanto deseja sacar:");
                    double aSacar = sc.nextDouble();
                    info.Saque(aSacar);  
                    exibirInformacoes(info);
                    break;

                case 3:
                    System.out.println("\nObrigado por usar o nosso sistema!");
                    exibirInformacoes(info);
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }

    
    private static void exibirInformacoes(Info info) {
        System.out.println("\nInformações da conta:");
        System.out.println("Número da conta: " + info.getNumConta());
        System.out.println("Nome do cliente: " + info.getNome());
        System.out.println("Saldo atual: R$" + info.getBalanco());
    }
}
