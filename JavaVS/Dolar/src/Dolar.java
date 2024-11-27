import java.util.*;



;public class Dolar {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);





        System.out.println("Insira a cotação do dólar e quantos dólares serão comprados:");
        double cot = sc.nextDouble();
        double dol = sc.nextDouble();

        Contas contas = new Contas();

        
        double total = contas.Total(cot, dol);

        
        System.out.printf("O valor total em reais é: %.2f%n", total);

 
    sc.close();
    }
}
