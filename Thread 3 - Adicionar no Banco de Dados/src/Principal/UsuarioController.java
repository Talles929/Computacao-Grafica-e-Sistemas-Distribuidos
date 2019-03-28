package Principal;

import javax.swing.*;

import java.sql.SQLException;

import java.text.ParseException;

import java.util.List;

public class UsuarioController {

    public void salvar(String nome, String apelido) 
		throws SQLException, ParseException 
	{
        Usuarios contato = new Usuarios();
        contato.setNome(nome);
        contato.setSenha(apelido);
        

        new UsuarioDao().salvar(contato);
    }

   

    public List<?> listaUsuarios() {
        UsuarioDao dao = new UsuarioDao();
        try {
            return dao.findContatos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
				"Problemas ao localizar contaton" + 
				e.getLocalizedMessage()
			);
        }
        return null;
    }

    
}