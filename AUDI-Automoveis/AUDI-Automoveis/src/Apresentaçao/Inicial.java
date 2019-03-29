package Apresentaçao;


import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


import Negocio.Cesta;



public class Inicial extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private double tempoInicial;
	private double media;
	private Cesta cestaPneus;
	private Cesta cestaMotor;
	private Cesta cestaEletronica;
	private Cesta cestaCarroceria;
	private Cesta cestaBancos;
	private Cesta Carros;
	private JLabel esteira1 = new JLabel(new ImageIcon(getClass().getResource("esteira.png")));
	private JLabel esteira2 = new JLabel(new ImageIcon(getClass().getResource("esteira.png")));
	private	JLabel esteira3 = new JLabel(new ImageIcon(getClass().getResource("esteira.png")));
	private	JLabel esteira4 = new JLabel(new ImageIcon(getClass().getResource("esteira.png")));
	private	JLabel esteira5 = new JLabel(new ImageIcon(getClass().getResource("esteira.png")));
	private	JLabel background = new JLabel(new ImageIcon(getClass().getResource("background.png")));
	private	JLabel banco = new JLabel(new ImageIcon(getClass().getResource("banco.png")));
	private	JLabel carroceria = new JLabel(new ImageIcon(getClass().getResource("carroceria.png")));
	private JLabel motor = new JLabel(new ImageIcon(getClass().getResource("motor.png")));
	private JLabel placa = new JLabel(new ImageIcon(getClass().getResource("placa.jpg")));
	private JLabel pneu = new JLabel(new ImageIcon(getClass().getResource("pneu.png")));
	private	JLabel carro = new JLabel(new ImageIcon(getClass().getResource("carro.png")));
	private JLabel montagem = new JLabel(new ImageIcon(getClass().getResource("montagem.gif")));
	private JLabel cegonha = new JLabel(new ImageIcon(getClass().getResource("cegonha.png")));
	private JLabel placaEstoque= new JLabel(new ImageIcon(getClass().getResource("placaEstoque.png")));
	//quantidade de peças no estoque
	private JLabel estBanco = new JLabel("0");
	private final JLabel estCarroceria = new JLabel("0");
	private final JLabel estMotor = new JLabel("0");
	private final JLabel estEletronica = new JLabel("0");
	private final JLabel estPneu = new JLabel("0");
	//estoque de produção dos carros
	private JLabel estoque = new JLabel("0");
	private final JLabel lblProduoDeCarros = new JLabel("PRODU\u00C7\u00C3O DE CARROS");
	private JLabel lblCarroshora = new JLabel("CARROS/HORA");
	private JLabel label = new JLabel("0");
	private final JLabel lblMontagem = new JLabel("MONTAGEM");
	public Inicial(Cesta cestaPneus,Cesta cestaMotor,Cesta cestaEletronica,Cesta cestaCarroceria,Cesta cestaBancos, Cesta carros) {
		this.cestaPneus = cestaPneus;
		this.cestaMotor = cestaMotor;
		this.cestaEletronica = cestaEletronica;
		this.cestaCarroceria = cestaCarroceria;
		this.cestaBancos = cestaBancos;
		this.Carros = carros;
		getContentPane().setBackground(Color.WHITE);
		setSize(1409,700);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		getContentPane().add(esteira1);
		esteira1.setBounds(63,78,400,149);
		getContentPane().add(esteira2);
		esteira2.setBounds(85,288,400,149);
		getContentPane().add(esteira3);
		esteira3.setBounds(974,38,400,149);
		getContentPane().add(esteira4);
		esteira4.setBounds(525,65,400,149);
		getContentPane().add(esteira5);
		esteira5.setBounds(570,288,400,149);
		
		banco.setBounds(63, 38, 65, 65);
		getContentPane().add(banco);
		carroceria.setBounds(85,260,100,65);
		getContentPane().add(carroceria);
		motor.setBounds(973,11,65,56);
		getContentPane().add(motor);
		placa.setBounds(525,40,65,42);
		getContentPane().add(placa);
		pneu.setBounds(575,260,65,49);
		getContentPane().add(pneu);
		
		montagem.setBounds(0,481,320,180);
		getContentPane().add(montagem);
		carro.setBounds(181,536,120,83);
		getContentPane().add(carro);
		cegonha.setBounds(826,536,120,86);
		getContentPane().add(cegonha);
		
		estBanco.setForeground(Color.BLACK);
		getContentPane().add(estBanco);
		estBanco.setBounds(22, 93, 83, 80);
		estBanco.setFont(new Font("Purisa", Font.BOLD, 45));
		estCarroceria.setForeground(Color.BLACK);
		getContentPane().add(estCarroceria);
		estCarroceria.setBounds(22, 315, 89, 80);
		estCarroceria.setFont(new Font("Purisa", Font.BOLD, 45));
		estMotor.setForeground(Color.BLACK);
		getContentPane().add(estMotor);
		estMotor.setBounds(935, 38, 83, 80);
		estMotor.setFont(new Font("Purisa", Font.BOLD, 45));
		estEletronica.setForeground(Color.BLACK);
		getContentPane().add(estEletronica);
		estEletronica.setBounds(485, 93, 89, 80);
		estEletronica.setFont(new Font("Purisa", Font.BOLD, 45));
		estPneu.setForeground(Color.BLACK);
		getContentPane().add(estPneu);
		estPneu.setBounds(525, 315, 83, 80);
		estPneu.setFont(new Font("Purisa", Font.BOLD, 45));
		estoque.setForeground(Color.BLACK);
		estoque.setBounds(1175, 288, 71, 49);
		getContentPane().add(estoque);
		estoque.setFont(new Font("Purisa", Font.BOLD, 45));
		lblProduoDeCarros.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		lblProduoDeCarros.setForeground(Color.BLACK);
		
		lblProduoDeCarros.setBounds(1115, 267, 209, 14);		
		getContentPane().add(lblProduoDeCarros);
		
		placaEstoque.setBounds(1052,249,300,103);
		getContentPane().add(placaEstoque);
		lblCarroshora.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		lblCarroshora.setBounds(1120, 428, 148, 14);
		getContentPane().add(lblCarroshora);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
		label.setBounds(1076, 426, 35, 19);
		getContentPane().add(label);
		lblMontagem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMontagem.setBounds(85, 448, 120, 14);
		getContentPane().add(lblMontagem);
		background.setBounds(0, -20, 1500, 750);
		getContentPane().add(background);
		new Movimento(banco,63,38,65,65,403, cestaBancos,25).start();
		new Movimento(carroceria,85,260,100,65,405, cestaCarroceria, 20).start();
		new Movimento(motor,973,11,65,56,1213,cestaMotor, 10).start();
		new Movimento(placa,525,40,65,56,875, cestaEletronica, 8).start();
		new Movimento(pneu,575,260,65,56,905, cestaPneus, 100).start();
		
		
		
		
	
		new mudaQuantidade().start();
		new MovimentoCegonha().start();
		
		tempoInicial = System.currentTimeMillis();
		new produçãoHora().start();
		
	}
	public void geraMovimento(){
		new MovimentoCarro().start();;
	}
	
	
	//classe thread muda a quantidade do estoque das peças e quantidade dos carros produzidos
	public class mudaQuantidade extends Thread{
			public void run() {
				while(true){
					estBanco.setText(Integer.toString(cestaBancos.get()));
					estCarroceria.setText(Integer.toString(cestaCarroceria.get()));
					estMotor.setText(Integer.toString(cestaMotor.get()));
					estEletronica.setText(Integer.toString(cestaEletronica.get()));
					estPneu.setText(Integer.toString(cestaPneus.get()));
					estoque.setText(Integer.toString(Carros.get()));
				}
				
			}	
			
	}
	//classe thread que faz os movimentos das peças na esteira durante a produção 
	public class Movimento extends Thread{
		JLabel objeto;
		Cesta cesta;
		int tamanhoCesta;
		int x; 
		int y;
		int larg; 
		int alt; 
		int max;
		Movimento(JLabel objeto, int x, int y, int larg, int alt, int max,Cesta cesta, int tamanhoCesta){
			this.x = x;
			this.y = y;
			this.larg = larg;
			this.alt = alt;
			this.max = max;
			this.objeto = objeto;
			this.cesta = cesta;
			this.tamanhoCesta =tamanhoCesta;
		}
		public void run(){
			while(true){
				try{
					sleep(85);
				}
				catch(Exception erro){
					
				}
				if(objeto.getX()==max){
					objeto.setBounds(x,y,larg,alt);
					//fica parado quando o estoque está cheio
					while(cesta.get() == tamanhoCesta){}
					
				}			
				objeto.setBounds(objeto.getX()+10, objeto.getY()-1, larg, alt);
				
			}
		}
	}
	
	//classe thread que faz o movimento do carro até a carreta quando é produzido
	public class MovimentoCarro extends Thread{
		
		public void run(){
			while(true){
				try{
					sleep(85);
				}
				catch(Exception erro){
					
				}
				if(carro.getX()==761){
					carro.setBounds(181,536,110,83);
					extracted();
				}			
				carro.setBounds(carro.getX()+10, carro.getY(), 110, 83);
				
			}
		}

		@SuppressWarnings("deprecation")
		private void extracted() {
			stop();
		}
	}
	//classe thread que faz o movimento da carreta depois de carregada de 10 carros
	public class MovimentoCegonha extends Thread{
		
		public void run(){
			while(true){
				//verifica se já foram produzidos os 10 carros pra carregar a carreta
				while(Carros.get()%10 == 0 && Carros.get() !=0){
					try{
						sleep(500);
					}
					catch(Exception erro){
						
					}
					
					if(cegonha.getX()==1706){
						cegonha.setBounds(826,536,120,86);
					}			
					cegonha.setBounds(cegonha.getX()+10, cegonha.getY(), 120, 86);
				}
			}
		}
	}
	public class produçãoHora extends Thread{
		String mediaDeCarros;
		public void run() {
			while(true){
				media = Carros.get()/((System.currentTimeMillis()-tempoInicial)/3600000);
				mediaDeCarros=String.valueOf(media);
				label.setText(mediaDeCarros);
			}
			
		}	
		
}
}


