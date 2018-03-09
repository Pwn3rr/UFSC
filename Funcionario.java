
public class Funcionario {
	
private String nome;
private String cpf;
private double salario;

public Funcionario(String nome, String cpf, double salario)
{
		setNome(nome);
		setCPF(cpf);
		setSalario(salario);
	 
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCPF(String cpf) {
	this.cpf = cpf;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public void exibeDados()
{
	System.out.println(nome);
	System.out.println(cpf);
	System.out.println(salario);
}
}
