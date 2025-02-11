import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws ParseException  {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

       
		System.out.print("Insira o nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Insira as informações do funcionário:");
		System.out.print("Nome: ");
		String nomeFunc = sc.nextLine();
		System.out.print("Nível: ");
		String nivelFunc = sc.nextLine();
		System.out.print("Salário: ");
		double baseSalary = sc.nextDouble();
		Funcionario func = new Funcionario(nomeFunc, Nivel.valueOf(nivelFunc), baseSalary, new Departamento(departmentName));

        System.out.print("Quantos contratos deseja associar ao funcionário? ");
		int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
			System.out.println("Contrato #" + i);
			System.out.println();
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração em horas: ");
			int horas = sc.nextInt();
			ContratoHr contract = new ContratoHr(dataContrato, valorPorHora, horas);
			func.addContrato(contract);
		}

        System.out.println();
        System.out.print("Insira o mês e ano para calcular a quantia recebida (MM/YYYY):");
        String mêsEAno = sc.next();
        int mês = Integer.parseInt(mêsEAno.substring(0,2));
        int ano = Integer.parseInt(mêsEAno.substring(3));
    

      System.out.println("Nome: " + func.getNome());
      System.out.println("Departamento: " + func.getDepartamento().getNome());
      System.out.println("Recebimento de " + mêsEAno + ": " + String.format("%.2f" ,func.recebimento(ano, mês)));



        sc.close();
    }
}
