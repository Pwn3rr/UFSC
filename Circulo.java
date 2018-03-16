
public abstract class Circulo implements InterfaceGeometrica 
{
	private double raio;
	final double pi = 3.14;
	public Circulo(double raio)
	{
		this.raio = raio;
	}
	public void CalculoPerimetro() {
		double resultado = (2* pi) * raio;
		
	}
}
