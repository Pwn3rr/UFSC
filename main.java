
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Codigo cod = new Codigo("a", "sim", 100);
		
		ProdutoG2<Integer, String> produto = new ProdutoG2<>(10,"a", "10");
		System.out.println(produto.toString());
	}

}
