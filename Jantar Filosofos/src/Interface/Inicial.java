package Interface;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Negocio.Jantar;

public class Inicial extends JFrame implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel macarrao1 = new JLabel(new ImageIcon(getClass().getResource("macarrao.jpg")));
	JLabel macarrao2 = new JLabel(new ImageIcon(getClass().getResource("macarrao.jpg")));
	JLabel macarrao3 = new JLabel(new ImageIcon(getClass().getResource("macarrao.jpg")));
	JLabel macarrao4 = new JLabel(new ImageIcon(getClass().getResource("macarrao.jpg")));
	JLabel macarrao5 = new JLabel(new ImageIcon(getClass().getResource("macarrao.jpg")));
	ImageIcon comendo1 = new ImageIcon(getClass().getResource("comendo.jpg"));
	ImageIcon comendo2 = new ImageIcon(getClass().getResource("comendo.jpg"));
	ImageIcon comendo3 = new ImageIcon(getClass().getResource("comendo.jpg"));
	ImageIcon comendo4 = new ImageIcon(getClass().getResource("comendo.jpg"));
	ImageIcon comendo5 = new ImageIcon(getClass().getResource("comendo.jpg"));
	ImageIcon faminto1 = new ImageIcon(getClass().getResource("faminto.jpg"));
	ImageIcon faminto2 = new ImageIcon(getClass().getResource("faminto.jpg"));
	ImageIcon faminto3 = new ImageIcon(getClass().getResource("faminto.jpg"));
	ImageIcon faminto4 = new ImageIcon(getClass().getResource("faminto.jpg"));
	ImageIcon faminto5 = new ImageIcon(getClass().getResource("faminto.jpg"));
	ImageIcon pensando1 =new ImageIcon(getClass().getResource("Pensando.png"));
	ImageIcon pensando2 = new ImageIcon(getClass().getResource("Pensando.png"));
	ImageIcon pensando3 = new ImageIcon(getClass().getResource("Pensando.png"));
	ImageIcon pensando4 = new ImageIcon(getClass().getResource("Pensando.png"));
	ImageIcon pensando5 = new ImageIcon(getClass().getResource("Pensando.png"));
	JLabel mesa = new JLabel(new ImageIcon(getClass().getResource("mesa.png")));
	JLabel estado1 = new JLabel(pensando1);
	JLabel estado2 = new JLabel(pensando2);
	JLabel estado3 = new JLabel(pensando3);
	JLabel estado4 = new JLabel(pensando4);
	JLabel estado5 = new JLabel(pensando5);
	
	public Inicial(Jantar jantar) {
		getContentPane().setBackground(Color.WHITE);
		setSize(800, 700);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		mesa.setBounds(0, 0, 800, 700);
		getContentPane().add(mesa);
		macarrao1.setBounds(320,90,150,150);
		getContentPane().add(macarrao1);
		macarrao2.setBounds(120,240,150,150);
		getContentPane().add(macarrao2);
		macarrao3.setBounds(210,470,150,150);
		getContentPane().add(macarrao3);
		macarrao4.setBounds(450,470,150,150);
		getContentPane().add(macarrao4);
		macarrao5.setBounds(550,240,150,150);
		getContentPane().add(macarrao5);
		estado1.setBounds(335,10, 120, 90);
		getContentPane().add(estado1);
		
		estado2.setBounds(125,150, 120,90);
		getContentPane().add(estado2);
		estado3.setBounds(230,380, 120, 90);
		getContentPane().add(estado3);
		estado4.setBounds(460,380, 120, 90);
		getContentPane().add(estado4);
		
		estado5.setBounds(540,150, 120, 90);
		getContentPane().add(estado5);
		
		JLabel lblNewLabel = new JLabel("Ilo");
		lblNewLabel.setBounds(379, 247, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblSocrates = new JLabel("Fred");
		lblSocrates.setBounds(179, 401, 91, 14);
		getContentPane().add(lblSocrates);
		
		JLabel lblAristoteles = new JLabel("Luan");
		lblAristoteles.setBounds(254, 631, 91, 14);
		getContentPane().add(lblAristoteles);
		
		JLabel lblTales = new JLabel("Talles");
		lblTales.setBounds(514, 631, 46, 14);
		getContentPane().add(lblTales);
		
		JLabel lblSofocles = new JLabel("Krupp");
		lblSofocles.setBounds(612, 401, 88, 14);
		getContentPane().add(lblSofocles);

	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		for (int i = 0; i < 5; i++) {
		      if(Jantar.estado[i] == 0)
	            {
	             if(i==0){
	            	 estado1.setIcon(pensando1);
	             }
	             else if(i==1){
	            	 estado2.setIcon(pensando2);
	             }
	             else if(i==2){
	            	 estado3.setIcon(pensando3);
	             }
	             else if(i==3){
	            	 estado4.setIcon(pensando4);;
	             }
	             else if(i==4){
	            	 estado5.setIcon(pensando5);
	             }
	            }
	            if(Jantar.estado[i] == 1)
	            {
	            	  if(i==0){
	 	            	 estado1.setIcon(faminto1);
	 	             }
	 	             else if(i==1){
	 	            	estado2.setIcon(faminto2);
	 	             }
	 	             else if(i==2){
	 	            	estado3.setIcon(faminto3);
	 	             }
	 	             else if(i==3){
	 	            	estado4.setIcon(faminto4);
	 	             }
	 	             else if(i==4){
	 	            	estado5.setIcon(faminto5);
	 	             }
	            }
	            if(Jantar.estado[i] == 2)
	            {
	            	  if(i==0){
	            		  estado1.setIcon(comendo1);
		 	             }
		 	             else if(i==1){
		 	            	estado2.setIcon(comendo2);
		 	             }
		 	             else if(i==2){
		 	            	estado3.setIcon(comendo3);
		 	             }
		 	             else if(i==3){
		 	            	estado4.setIcon(comendo4);
		 	             }
		 	             else if(i==4){
		 	            	estado5.setIcon(comendo5);
		 	             }
	            }
			
		}
		
	}
    public void run ()
    {        
        // Uma execução infinita
        do
        {
            // Redesenha a tela
            repaint();

            // Dorme durante um tempo para redesenhar novamente
            try
            {
                Thread.sleep(100L);
            }
            catch (InterruptedException ex)
            {
                // Exibe uma mensagem de controle de erro
                System.out.println("ERROR>" + ex.getMessage());
            }
        }
        while (true);
    }
}
