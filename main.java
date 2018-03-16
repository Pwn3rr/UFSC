import java.util.*;
public class main {
	public static void main(String[] args) {
		int auxFormas,aux;
		double aux1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas formas você deseja criar?");
		auxFormas = sc.nextInt();
		int repetição = 0;
		do
		{
			repetição++;
			System.out.println("Você deseja criar um quadrado, retângulo ou círculo?");
			String entrada = sc.next();
			switch (entrada) {
			case "quadrado":
				System.out.println("Digite o comprimento do lado do quadrado");
				aux1 = sc.nextDouble();
				Quadrado q = new Quadrado(aux);
				break;
				
			case "retângulo"

			default:
				break;
			}
		}while ()
		
	}

}
