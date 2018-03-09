
public class Administrativo extends Assistente{
	private String turno;
	private double adicionalNoturno;
	public Administrativo(String nome, String cpf, double salario, int numMatricula, String turno, double adicionalNoturno)
	{
		super(nome, cpf, salario, numMatricula);
		adicionalNoturno();
	}
	public String getTurno() 
	{
		return turno;
	}
	public void setTurno(String turno) 
	{
		this.turno = turno;
	}
	private void adicionalNoturno()
	{
		if(turno == "noite")
		{
			setSalario(getSalario() + adicionalNoturno);
		}
	}

}
