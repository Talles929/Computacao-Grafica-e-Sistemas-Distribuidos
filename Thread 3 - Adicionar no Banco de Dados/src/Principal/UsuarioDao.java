package Principal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao extends GenericDao {

    public void salvar(Usuarios contato) throws SQLException {
        String insert = "INSERT INTO USUARIO(nome, senha) VALUES(?,?)";
        save(insert, contato.getNome(), contato.getSenha());
    }

    public void alterar(Usuarios contato) throws SQLException {
        String update = "UPDATE USUARIO " +
                "SET nome = ?, senha = ?, " +
                "WHERE id = ?";
        update(update, contato.getId(), contato.getNome(), contato.getSenha());
    }

    public void excluir(long id) throws SQLException {
        String delete = "DELETE FROM USUARIO WHERE id = ?";
        delete(delete, id);
    }

    public List<Usuarios> findContatos() throws SQLException {
        ArrayList<Usuarios> contatos = new ArrayList<Usuarios>();

        String select = "SELECT * FROM USUARIO";

        PreparedStatement stmt = 
			getConnection().prepareStatement(select);
			
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Usuarios contato = new Usuarios();
            contato.setId(rs.getLong("id"));
            contato.setNome(rs.getString("nome"));
            contato.setSenha(rs.getString("usuario"));
            
            contatos.add(contato);
        }

        rs.close();
        stmt.close();
        getConnection().close();

        return contatos;
    }

    public Usuarios findByName(String nome) throws SQLException {
        String select = "SELECT * FROM usuario WHERE nome = ?";
        Usuarios contato = null;
        PreparedStatement stmt = 
			getConnection().prepareStatement(select);
			
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            contato = new Usuarios();
            contato.setId(rs.getLong("id"));
            contato.setNome(rs.getString("nome"));
            contato.setSenha(rs.getString("Senha"));
            
        }

        rs.close();
        stmt.close();
        getConnection().close();

        return contato;
    }
}
