import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppPolimorfismo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<FuncPoli> list = new ArrayList<>();
        
        System.out.print("Insira o número de funcionários: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionário #" + i + " :");
            System.out.print("Terceirizado (s/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            if (ch == 's') {
                System.out.print("Taxa adicional: ");
                double additionalCharge = sc.nextDouble();
                list.add(new FuncTerceirizado(nome, horas, valorPorHora, additionalCharge));
            } else {
                list.add(new FuncPoli(nome, horas, valorPorHora));
            }
        }
        
        System.out.println();
        System.out.println("Pagamento:");
        for (FuncPoli emp : list) {
            System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
        }
        
        sc.close();
    }
}
