package Principal;

import javax.swing.*;

import java.sql.SQLException;

import java.text.ParseException;

import java.util.List;

public class ProdutoController {

   

    public void salvar(String nome, String QuantProduto, String ValorProduto) 
		throws SQLException, ParseException 
	{
        Produto p = new Produto();
        p.setNome(nome);
        p.setQuantProduto(QuantProduto);
        p.setValorProduto(ValorProduto);

        new ProdutoDao().salvar(p);
    }

   

    public List<?> listaProdutos() {
        ProdutoDao dao = new ProdutoDao();
        try {
            return dao.findProdutos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
				"Problemas ao localizar contaton" + 
				e.getLocalizedMessage()
			);
        }
        return null;
    }

    

    
}