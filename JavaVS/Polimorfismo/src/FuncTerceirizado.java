
public class FuncTerceirizado extends FuncPoli {

    private double adicional;

    public FuncTerceirizado(String nome, int horas, double valorPorHora, double adicional) {
        super(nome, horas, valorPorHora);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + adicional * 1.1;
    }
}