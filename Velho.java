
public class Velho extends Imovel{
	private double desconto;
	public Velho(String endereco, double preco) 
	{
		super(endereco, preco);
		desconto = preco - (preco *0.15);
	}
	public double getDesconto() {
		return desconto;
	}
	public void imprimeDesconto()
	{
		System.out.println(desconto);
	}
	
	
	

}
