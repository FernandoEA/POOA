package fauna;

public class Osos {
	
	public String crias, comida;
	public int cantidadCrias;
	
	public Osos(String crias, String comida, int cantidadCrias) {
		super();
		this.crias = crias;
		this.comida = comida;
		this.cantidadCrias = cantidadCrias;
	}

	public String getCrias() {
		return crias;
	}

	public void setCrias(String crias) {
		this.crias = crias;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public int getCantidadCrias() {
		return cantidadCrias;
	}

	public void setCantidadCrias(int cantidadCrias) {
		this.cantidadCrias = cantidadCrias;
	}
	
	

}
