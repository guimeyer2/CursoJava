import java.util.*;


public class ProgramaL {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);

        List <FuncionarioL> list= new ArrayList<>();

       System.out.println("Insira o número de funcionários:");
       int n = sc.nextInt();


       for (int i = 1; i <= n; i++){
        System.out.println();
        System.out.println("Funcionario #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (idLivre(list, id)) {
				System.out.print("Id está em uso, tente outra: ");
				id = sc.nextInt();
			}
            System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Salario: ");
			double salario = sc.nextDouble();

			list.add(new FuncionarioL(id, nome, salario));
       }

	System.out.println();

	System.out.println("Insira o Id do funcionário a ter seu salário aumentado:");
	int id = sc.nextInt();

	FuncionarioL func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

	   if (func == null) {
	   System.out.println("Está id não existe!");
	}

	else {
		System.out.println("Insira a porcentagem do aumento:");
		double porcentagem = sc.nextDouble();
		func.Aumento(porcentagem);
	}

	System.out.println();
		System.out.println("Lista de funcionários:");
		for (FuncionarioL obj : list) {
			System.out.println(obj);
		}


        sc.close();
    }
    
    public static boolean idLivre(List<FuncionarioL> list, int id) {
		FuncionarioL func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}
