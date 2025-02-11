
public class Cliente {
    private String nome;
    private String email;
    private int niver;
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getNiver() {
        return niver;
    }
    public void setNiver(int niver) {
        this.niver = niver;
    }
   
    public Cliente(String nome, String email, int niver) {
        this.nome = nome;
        this.email = email;
        this.niver = niver;
        
    }

    public String toString() {
		return nome + " (" + niver + ") - " + email;
 	}


    




    
}
