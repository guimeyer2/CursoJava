import java.util.Scanner; 

 
public class Programa { 
 
 public static void main(String[] args) { 
 
  
  Scanner sc = new Scanner(System.in); 
 
  Funcionario func = new Funcionario(); 
   
  System.out.print("Nome: "); 
  func.name = sc.nextLine(); 
  System.out.print("Salário bruto: "); 
  func.grossSalary = sc.nextDouble(); 
  System.out.print("Taxa: "); 
  func.tax = sc.nextDouble(); 
   
  System.out.println(); 
  System.out.println("Funcionario:" + func); 
  System.out.println(); 
  System.out.print("Qual a porcentagem de aumento "); 
  double percentage = sc.nextDouble(); 
  func.increaseSalary(percentage); 
   
  System.out.println(); 
  System.out.println("Dados atualizados " + func); 
  sc.close(); 
 }  
} 