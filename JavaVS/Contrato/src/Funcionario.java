import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
	private String nome;
	private Nivel nivel;
	private Double salario;
	
	private Departamento Departamento;
	private List<ContratoHr> contratos = new ArrayList<>();
	
	public Funcionario() {
	}

	public Funcionario(String nome, Nivel nivel, Double salario, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
		this.Departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public Nivel getnivel() {
		return nivel;
	}

	public void setnivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Double getSalario() {
		return salario;
	}

	public void setsalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(Departamento Departamento) {
		this.Departamento = Departamento;
	}

	public List<ContratoHr> getcontratos() {
		return contratos;
	}

	public void addContrato(ContratoHr contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ContratoHr contrato) {
		contratos.remove(contrato);
	}

    public double recebimento(int ano, int mês){
        double soma = salario;
        Calendar cal = Calendar.getInstance();
        for (ContratoHr c : contratos){
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = cal.get(Calendar.MONTH) + 1;
            if (ano == c_ano && mês == c_mes){
                soma += c.valorTotal();
            }
        }

        return soma;
    }



}
