import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

private static final SimpleDateFormat sdf = new SimpleDateFormat
("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private Status status;
    private List<ItensProduto> itens = new ArrayList<>();
    private Cliente cliente;

    
public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    

public Pedido(Date momento, Status status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }



public void addItem(ItensProduto item) {
    itens.add(item);
}

public void removeItem(ItensProduto item) {
    itens.remove(item);
}


   
  

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensProduto> getItems() {
		return itens;
	}
    public double total() {
		double soma = 0.0;
		for (ItensProduto item : itens) {
			soma += item.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido:\n");
		for (ItensProduto item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
