package Principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;

import java.util.List;

public class UsuarioFrame extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbNome, lbSenha;
    private JTextField txtNome, txtSenha;
    private JButton btnSalvar;
    

    private List<?> UsuarioList = new UsuarioController().listaUsuarios();
    
    public UsuarioFrame() {
        super("Cadastra Usuario");
        Container tela = getContentPane();
        setLayout(null);
        lbNome = new JLabel("Nome");
        lbSenha = new JLabel("Senha");
        

        lbNome.setBounds(10, 10, 240, 15);
        lbSenha.setBounds(10, 50, 240, 15);
        

        lbNome.setForeground(Color.BLACK);
        lbSenha.setForeground(Color.BLACK);
        

        lbNome.setFont(new Font("Courier New", Font.BOLD, 14));
        lbSenha.setFont(new Font("Courier New", Font.BOLD, 14));
       

        tela.add(lbNome);
        tela.add(lbSenha);
        

        txtNome = new JTextField();
        txtSenha = new JTextField();
        

        txtNome.setBounds(10, 25, 265, 20);
        txtSenha.setBounds(10, 65, 265, 20);
        

        tela.add(txtNome);
        tela.add(txtSenha);
        

        btnSalvar = new JButton("Salvar");
        
       

        btnSalvar.setBounds(280, 25, 80, 20);
       

        tela.add(btnSalvar);
       

       

        

        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);

        btnSalvar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        onClickSalvar();
                    }
                }
        );

        

        
        

        

        
        

        

        
    }

    
    private void onClickSalvar() {
        UsuarioController cc = new UsuarioController();
        try {
            cc.salvar(txtNome.getText(), txtSenha.getText());
            JOptionPane.showMessageDialog(this, "Usuario salvo com sucesso!");
            clearFields();
            setUsuarioList(new UsuarioController().listaUsuarios());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
				"Nao foi possivel salvar usuario!n" + 
				e.getLocalizedMessage()
			);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, 
				"Insira mais usuarios" + 
				e.getLocalizedMessage()
		);
        }
    }

    

   

    private void clearFields() {
        txtNome.setText("");
        txtSenha.setText("");
        
    }

    public static void main(String[] args) {
        UsuarioFrame frame = new UsuarioFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


	public List<?> getUsuarioList() {
		return UsuarioList;
	}


	public void setUsuarioList(List<?> usuarioList) {
		UsuarioList = usuarioList;
	}
}
