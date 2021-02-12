package entities;

public class funcionario {
	 
	private String nome;
	private Integer horas;
	private Double valorPorHoras;
	
	public funcionario(){
		
	}

	public funcionario(String nome, Integer hours, Double valuePerHour) {
		this.nome = nome;
		this.horas = hours;
		this.valorPorHoras = valuePerHour;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHours() {
		return horas;
	}

	public void setHours(Integer hours) {
		this.horas = hours;
	}

	public Double getValuePerHour() {
		return valorPorHoras;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valorPorHoras = valuePerHour;
	}
	
	public double pagamento() {
		return horas * valorPorHoras;
	}

}
