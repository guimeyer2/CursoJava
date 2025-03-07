import java.util.Scanner;



public class AppErros {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as informações da conta:");

        System.out.print("Número da conta: ");
        int num = sc.nextInt();
       
        System.out.print("Nome do titular: ");
        sc.nextLine();
        String nome = sc.nextLine();
        
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.print("Limite de saque: ");
        double limite = sc.nextDouble();

        AccountErros acc = new AccountErros(num, nome, saldo, limite);

        
        int opcao;
        do {
        
        System.out.println("\nO que deseja realizar?");
        System.out.println("  1) Depositar\n  2) Sacar\n  3) Sair");
        opcao = sc.nextInt();


        switch (opcao){

            case 1:
            System.out.print("Valor para depósito: ");
                    double deposito = sc.nextDouble();
                    acc.depositar(deposito);
                    System.out.println(acc);
                    break;

            case 2:
            System.out.print("Valor para sacar: ");
                    double saque = sc.nextDouble();
                    acc.sacar(saque);
                    System.out.println(acc);
                    break;

            case 3: 
            System.out.println("Encerrando o programa.");
        }
    }
        while (opcao != 3);
        sc.close();
    }
}
