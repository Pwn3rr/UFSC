
public class CamaroteSuperior extends VIP{
	private double adicionalCamarote;
	
	public CamaroteSuperior(double valor, double adicional, double adicionalCamarote)
	{
		super(valor, adicional);
	}	
	
	public double getAdicionalCamarote() {
		return adicionalCamarote;
	}

	public void setAdicionalCamarote(double adicionalCamarote) {
		this.adicionalCamarote = adicionalCamarote;
	}
	
	public double retornaValorIngresso()
	{
		double valorFinal = getValor() + adicionalVip() + adicionalCamarote;
		return valorFinal;
	}
}
