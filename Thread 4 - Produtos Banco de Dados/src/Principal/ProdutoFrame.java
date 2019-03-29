package Principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class ProdutoFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbNome, lbQuantProduto, lbValorProduto;
	private JTextField txtNome, txtQuantProduto, txtValorProduto;
	private JButton btnSalvar;
	

	private List<?> produtoList = new ProdutoController().listaProdutos();
	private int registroAtual = 0;
	private Long key;

	public ProdutoFrame() {
		super("Estoque");
		Container tela = getContentPane();
		setLayout(null);
		lbNome = new JLabel("Nome do Produto");
		lbQuantProduto = new JLabel("Quantidade do Produto");
		lbValorProduto = new JLabel("Valor do Produtos");

		lbNome.setBounds(10, 10, 240, 15);
		lbQuantProduto.setBounds(10, 50, 240, 15);
		lbValorProduto.setBounds(10, 90, 240, 15);

		lbNome.setForeground(Color.BLACK);
		lbQuantProduto.setForeground(Color.BLACK);
		lbValorProduto.setForeground(Color.BLACK);

		lbNome.setFont(new Font("Courier New", Font.BOLD, 14));
		lbQuantProduto.setFont(new Font("Courier New", Font.BOLD, 14));
		lbValorProduto.setFont(new Font("Courier New", Font.BOLD, 14));

		tela.add(lbNome);
		tela.add(lbQuantProduto);
		tela.add(lbValorProduto);

		txtNome = new JTextField();
		txtQuantProduto = new JTextField();
		txtValorProduto = new JTextField();

		txtNome.setBounds(10, 25, 265, 20);
		txtQuantProduto.setBounds(10, 65, 265, 20);
		txtValorProduto.setBounds(10, 105, 265, 20);

		tela.add(txtNome);
		tela.add(txtQuantProduto);
		tela.add(txtValorProduto);

		btnSalvar = new JButton("Salvar");

		btnSalvar.setBounds(280, 25, 80, 20);

		tela.add(btnSalvar);

		txtValorProduto = new JTextField();
		;

		setSize(400, 250);
		setVisible(true);
		setLocationRelativeTo(null);

		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					onClickSalvar();
				} catch (ParseException e1) {
					
					e1.printStackTrace();
				}
			}
		});

	}

	private void onClickSalvar() throws ParseException {
		ProdutoController cc = new ProdutoController();
		try {
			cc.salvar(txtNome.getText(), txtQuantProduto.getText(),
					txtValorProduto.getText());
			JOptionPane.showMessageDialog(this, "Produto salvo com sucesso!");
			clearFields();
			produtoList = new ProdutoController().listaProdutos();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(
					this,
					"Nao foi possivel salvar Produto!n"
							+ e.getLocalizedMessage());
		} 
	}

	private void clearFields() {
		txtNome.setText("");
		txtQuantProduto.setText("");
		txtValorProduto.setText("");

	}

	public static void main(String[] args) {
		ProdutoFrame frame = new ProdutoFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public List<?> getProdutoList() {
		return produtoList;
	}

	public void setProdutoList(List<?> produtoList) {
		this.produtoList = produtoList;
	}

	public int getRegistroAtual() {
		return registroAtual;
	}

	public void setRegistroAtual(int registroAtual) {
		this.registroAtual = registroAtual;
	}
}
