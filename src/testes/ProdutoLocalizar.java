package testes;

import model.Produto;
import model.ProdutoDAO;

public class ProdutoLocalizar {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		Produto p = dao.localizar(1);
		if(p!=null) {
			System.out.println(p.toString());
		}else {
			System.out.println("Produto não encontrado!");
		}
	}

}
