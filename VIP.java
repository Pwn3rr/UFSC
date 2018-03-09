
public class VIP extends Ingresso{
	private double adicional;
	
	public VIP(double valor, double adicional)
	{
		super(valor);
		
	}
	public double adicionalVip()
	{
		double val = super.getValor() + adicional;
		return val;
	}
}
