
    
    
    public class Aluno{


        public String nome;
        public int nota1,nota2,nota3;

        public int Total(){
            return nota1 + nota2 + nota3;
        }

        public double Faltou(){
            return 60 - Total(); 
        }

        



}