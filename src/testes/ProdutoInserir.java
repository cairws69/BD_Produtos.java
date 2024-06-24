package testes;

import model.Produto;
import model.ProdutoDAO;

public class ProdutoInserir {

	public static void main(String[] args) {

		Produto p = new Produto(6, "Ervilha", 3.12, 10);
		ProdutoDAO dao = new ProdutoDAO();
		System.out.println(dao.salvar(p));

	}
}
