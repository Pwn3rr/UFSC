
public class Tecnico extends Assistente{
	
	public Tecnico(String nome, String cpf, double salario, int numMatricula, double bonus) {
		super(nome, cpf, salario, numMatricula);
		salario += bonus;
	}
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	
}
