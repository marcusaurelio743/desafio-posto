package desafio_posto;

import java.util.Objects;

public class Veiculo {
	private String modelo;
	private String placa;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", placa=" + placa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(modelo, placa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(modelo, other.modelo) && Objects.equals(placa, other.placa);
	}
	

}
