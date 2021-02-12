package entities;

public class funcionarioTerceirizado extends funcionario {
	
	private Double valorAdicional;
	
	public funcionarioTerceirizado() {
		super();
	}

	public funcionarioTerceirizado(String nome, Integer horas, Double valorPorHoras, Double valorAdicional) {
		super(nome, horas, valorPorHoras);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + valorAdicional * 1.1;
	}
	

}
