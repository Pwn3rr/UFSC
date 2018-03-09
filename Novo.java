
public class Novo extends Imovel{
	private double adicional;
	public Novo(String endereco, double preco, double adicional)
	{
		super(endereco, preco);
	}
	public double getAdicional() {
		return adicional;
	}
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	public void imprimeAdicional()
	{
		System.out.println(adicional);
	}
}
	