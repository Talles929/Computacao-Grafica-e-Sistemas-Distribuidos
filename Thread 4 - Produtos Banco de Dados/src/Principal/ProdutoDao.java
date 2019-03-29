package Principal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao extends GenericDao {

    public void salvar(Produto p) throws SQLException {
        String insert = "INSERT INTO produto(nome, QuantProduto, ValorProduto) VALUES(?,?,?)";
        save(insert, p.getNome(), p.getquantProduto(), p.getvalorProduto());
    }

    public void alterar(Produto p) throws SQLException {
        String update = "UPDATE produto " +
                "SET nome = ?, QuantProduto = ?, ValorProduto = ? " +
                "WHERE id = ?";
        update(update, p.getId(), p.getNome(), p.getquantProduto(), p.getvalorProduto());
    }

    public void excluir(long id) throws SQLException {
        String delete = "DELETE FROM produto WHERE id = ?";
        delete(delete, id);
    }

    public List<Produto> findProdutos() throws SQLException {
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        String select = "SELECT * FROM produto";

        PreparedStatement stmt = 
			getConnection().prepareStatement(select);
			
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Produto p = new Produto();
            p.setId(rs.getLong("id"));
            p.setNome(rs.getString("nome"));
            p.setQuantProduto(rs.getString("QuantProduto"));
            p.setValorProduto("ValorProduto");
            produtos.add(p);
        }

        rs.close();
        stmt.close();
        getConnection().close();

        return produtos;
    }

    public Produto findByName(String nome) throws SQLException {
        String select = "SELECT * FROM produto WHERE nome = ?";
        Produto p = null;
        PreparedStatement stmt = 
			getConnection().prepareStatement(select);
			
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            p = new Produto();
            p.setId(rs.getLong("id"));
            p.setNome(rs.getString("nome"));
            p.setQuantProduto(rs.getString("QuantProduto"));
            p.setValorProduto("ValorProduto");
        }

        rs.close();
        stmt.close();
        getConnection().close();

        return p;
    }
}
