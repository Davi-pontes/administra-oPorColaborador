package entities;

public class terceirizado extends Colaborador{
	
	private Double cobrançaAdicional;
	
	public terceirizado() {
		super();
	}

	public terceirizado(String nome, Integer horas, Double valorPorHora, Double cobrançaAdicional) {
		super(nome, horas, valorPorHora);
		this.cobrançaAdicional = cobrançaAdicional;
	}

	public Double getCobrançaAdicional() {
		return cobrançaAdicional;
	}

	public void setCobrançaAdicional(Double cobrançaAdicional) {
		this.cobrançaAdicional = cobrançaAdicional;
	}
	
	@Override
	
	public double pagamento() {
		return super.pagamento() + cobrançaAdicional * 1.1;
	}

}
