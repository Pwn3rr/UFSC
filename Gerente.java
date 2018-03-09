
public class Gerente extends Funcionario
{	
	private int senha;
	private int numeroDeFuncionarios;

	public Gerente(String nome, String cpf, double salario, int senha, int numero) {
		super(nome, cpf, salario);
		setSenha(senha);
		setNumero(numero);
	}
	public int getSenha()
	{
		return senha;
	}
	public void setSenha(int senha)
	{
		this.senha = senha;
	}
	public int getNumero()
	{
		return numeroDeFuncionarios;
	}
	public void setNumero(int numero)
	{
		this.numeroDeFuncionarios = numero;
	}
	public boolean autentica(int senha)
	{
		boolean aut = false;
		if (senha == this.senha)
			aut = true;
		return aut;
	}
}
