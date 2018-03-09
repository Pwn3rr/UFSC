
public class CamaroteInferior extends VIP {
private String localizacao;
	public CamaroteInferior(double valor, double adicional, String localizacao)
	{
		super(valor, adicional);
		setLocalizacao(localizacao);

	}
	public String getLocalizacao()
	{
		return localizacao;
	}
	public void imprimirLocalizacao()
	{
		System.out.println(localizacao);
	}
	public void setLocalizacao(String localizacao)
	{
		this.localizacao = localizacao;
	}
}
