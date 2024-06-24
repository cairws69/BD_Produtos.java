package testes;

import model.Produto;
import model.ProdutoDAO;

public class ProdutoExcluir {

	public static void main(String[] args) {

		ProdutoDAO dao = new ProdutoDAO();
		System.out.println(dao.excluir(6));

	}

}
