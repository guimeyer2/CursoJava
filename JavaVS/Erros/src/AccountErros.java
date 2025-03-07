public class AccountErros {

    private Integer numero;
    private String nome;
    private double saldo, limiteDeSaque;


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimiteDeSaque() {
        return limiteDeSaque;
    }
    public void setLimiteDeSaque(double limiteDeSaque) {
        this.limiteDeSaque = limiteDeSaque;
    }
    public AccountErros(int numero, String nome, double saldo, double limiteDeSaque) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque;
    }

  public AccountErros() {
    }



    public void depositar(double n){
        saldo += n;
    }

    public void sacar(double n){
        try {
            if (n > saldo){
            throw new Exception("Erro: Saldo insuficiente.");
        }
        if (n > limiteDeSaque) {
            throw new Exception("Erro: Valor do saque excede o limite permitido.");
        }
        saldo -= n;
        System.out.println("Saque realizado com sucesso. Saldo atual: R$" + String.format("%.2f", saldo));
    } 
    
     catch (Exception e) {
        System.out.println(e.getMessage());
    
    }  
    }
    @Override
public String toString() {
    return "\n Conta #" + numero + ": \n Nome:" + nome + "\n Saldo: R$ " + String.format("%.2f", saldo) +
           "\n Limite de Saque: R$ " + String.format("%.2f", limiteDeSaque);
}
}
