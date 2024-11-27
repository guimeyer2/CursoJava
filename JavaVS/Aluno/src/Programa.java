import java.util.*;

public class Programa {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);


       Aluno alu = new Aluno();

        System.out.println("Insira o nome e notas das 3 provas:");

        alu.nome = sc.nextLine();
        alu.nota1 = sc.nextInt();
        alu.nota2 = sc.nextInt();
        alu.nota3 = sc.nextInt();


        System.out.println("Nota total:" + alu.Total());


        if (alu.Total() > 60) {System.out.println("Passou paizao.");}


        else {System.out.println("Não passou paizao");
             System.out.printf("Faltaram %.2f pontos", alu.Faltou());}
       
        sc.close();
    }
}
