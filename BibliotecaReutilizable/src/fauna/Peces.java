package fauna;

public class Peces {
	
	public String banco,especie;
	public int cantidadBanco;
	public Peces(String banco, String especie, int cantidadBanco) {
		super();
		this.banco = banco;
		this.especie = especie;
		this.cantidadBanco = cantidadBanco;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getCantidadBanco() {
		return cantidadBanco;
	}
	public void setCantidadBanco(int cantidadBanco) {
		this.cantidadBanco = cantidadBanco;
	}
	
	

}
