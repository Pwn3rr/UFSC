
public class Retangulo implements InterfaceGeometrica 
{
	private double comprimento, altura;
	public Retangulo(double comprimento, double altura)
	{
		this.comprimento = comprimento;
		this.altura = altura;
	}	
	
	public void CalculoPerimetro()
	{
		double resultado = (comprimento * 2) + (altura * 2);		
	}

	
	public void CalculoArea() {
		// TODO Auto-generated method stub
		
	}
}
