
public class Quadrado implements InterfaceGeometrica
{
	private double lado, perimetro, area;
	public Quadrado(double lado)
	{
		this.lado = lado;
	}
	
	public void CalculoPerimetro() 
	{
		perimetro = lado*4;		
	}
	public void CalculoArea()
	{
		area = lado*2;
	}
}
