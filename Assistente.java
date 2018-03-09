
public class Assistente extends Funcionario{
	private int numMatricula;
	public Assistente(String nome, String cpf, double salario, int numMatricula)
	{
		super(nome, cpf, salario);
	}
	public int getMatricula()
	{
		return numMatricula;
	}
	public void setMatricula(int matricula)
	{
		this.numMatricula = matricula;
	}
	@Override
	public void exibeDados()
	{
		super.exibeDados();
		System.out.println(numMatricula);
		
	}

}
