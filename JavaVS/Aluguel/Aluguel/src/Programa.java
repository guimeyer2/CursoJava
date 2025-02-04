
import java.util.Scanner;

public class Programa {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    Aluga[] vect = new Aluga[10];


System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        
        
        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int room = sc.nextInt();
            vect[room] = new Aluga(name, email);
}


System.out.println();

System.out.println("Quartos ocupados:");
            for (int i=0; i<10; i++) {
                if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
}
}
sc.close();
}
}