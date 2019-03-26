package Interface;

import javax.swing.JFrame;

import Negocio.Jantar;

public class Main extends JFrame {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
			
		 
		Jantar jantar = new Jantar();
		Inicial primeiraTela= new Inicial(jantar);
		primeiraTela.setVisible(true);
		primeiraTela.run();

			
		 
	 }

}
