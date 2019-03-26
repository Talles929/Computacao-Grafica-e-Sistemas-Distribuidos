package Apresentacao;


import java.awt.Color;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



import Negocio.Cesta;
import java.awt.Font;

public class Inicial extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private Cesta cesta;
	//JLabel blackground = new JLabel(new ImageIcon(getClass().getResource("brackground.jpg")));
	JLabel caneca = new JLabel(new ImageIcon(getClass().getResource("caneca.png")));
	JLabel cafeteira = new JLabel(new ImageIcon(getClass().getResource("cafeteira.gif")));
	JLabel pessoa = new JLabel(new ImageIcon(getClass().getResource("cafe.gif")));
	JLabel pessoa2 = new JLabel(new ImageIcon(getClass().getResource("cafe2.gif")));
	
	JLabel quant = new JLabel();
	public Inicial(Cesta cesta) {
		this.cesta=cesta;
		getContentPane().setBackground(Color.DARK_GRAY);
		setSize(1200, 720);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		caneca.setBounds(250,270,70,100);
		getContentPane().add(caneca);
		cafeteira.setBounds(50,240,165,225);
		getContentPane().add(cafeteira);
		pessoa.setBounds(800,250,320,240);
		getContentPane().add(pessoa);
		JLabel lblQuantidadeDeCafe = new JLabel("QUANTIDADE DE CAFE PRODUZIDO");
		lblQuantidadeDeCafe.setForeground(new Color(0, 0, 255));
		lblQuantidadeDeCafe.setFont(new Font("Century", Font.PLAIN, 19));
		lblQuantidadeDeCafe.setBounds(292, 74, 376, 14);
		lblQuantidadeDeCafe.setBackground(Color.BLACK);
		getContentPane().add(lblQuantidadeDeCafe);
		
		this.quant.setText(Integer.toString(cesta.get()));
		quant.setFont(new Font("Century", Font.PLAIN, 19));
		quant.setBounds(735, 77, 46, 14);
		getContentPane().add(quant);
		new Movimento().start();
		new mudaQuantidade().start();
	}
	public class mudaQuantidade extends Thread{
			
			public void run() {
				while(true){
					quant.setText(Integer.toString(cesta.get()));
				}
				
			}	
			
	}
	public class Movimento extends Thread{
		public void run(){
			while(true){
				try{
					sleep(40);
				}
				catch(Exception erro){
					
				}
				if(caneca.getX()==700)
					caneca.setBounds(250, 270, 70, 100);
				
				caneca.setBounds(caneca.getX()+5, 270, 70, 100);
				
				
			}
		}
	}
}
