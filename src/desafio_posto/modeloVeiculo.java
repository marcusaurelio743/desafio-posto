package desafio_posto;

public class modeloVeiculo {
	private String Modelo;
	private String combustivel;
	
	private Double capacidadeTanque;

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(Double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	@Override
	public String toString() {
		return "modeloVeiculo [Modelo=" + Modelo + ", combustivel=" + combustivel + ", capacidadeTanque="
				+ capacidadeTanque + "]";
	}
	
	
	
	
	

}
	
