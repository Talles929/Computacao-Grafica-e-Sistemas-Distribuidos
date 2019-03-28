package Apresentaçao;


import Negocio.Cesta;
import Negocio.LPBancos;
import Negocio.LPCarroceria;
import Negocio.LPEletronica;
import Negocio.LPMotores;
import Negocio.LPPneus;
import Negocio.CarroConsumidor;

public class Main {

	public static void main(String[] args) {
		new Runnable() {
			public void run() {
				Cesta cestaPneus= new Cesta();
				Cesta cestaMotor= new Cesta();
				Cesta cestaEletronica= new Cesta();
				Cesta cestaCarroceria= new Cesta();
				Cesta cestaBancos= new Cesta();
				Cesta cestaCarros= new Cesta();
				LPPneus producaoPneu = new LPPneus(cestaPneus);
				producaoPneu.init(1);//executa linha produção de Pneus
				LPMotores producaoMotor = new LPMotores(cestaMotor);
				producaoMotor.init(2);//executa linha produção de Motores
				LPEletronica producaoEletronica = new LPEletronica(cestaEletronica);
				producaoEletronica.init(3);//executa linha produção de Eletronica
				LPCarroceria producaoCarroceria = new LPCarroceria(cestaCarroceria);
				producaoCarroceria.init(4);//executa linha produção de Carroceria
				LPBancos producaoBanco = new LPBancos(cestaBancos);
				producaoBanco.init(5);//executa linha produção de Bancos
				Inicial frame = new Inicial(cestaPneus, cestaMotor, cestaEletronica,cestaCarroceria, cestaBancos, cestaCarros);
				
				CarroConsumidor carroNovo = new CarroConsumidor(frame, cestaPneus, cestaMotor, cestaEletronica,cestaCarroceria, cestaBancos,cestaCarros);
				carroNovo.init();//executa consumidor
				frame.setVisible(true);
				
				synchronized(producaoPneu) {
					System.out.println("Producao Pneu Iniciado");
					producaoPneu.notify();  
				}
				
				synchronized(producaoMotor) {
					System.out.println("Producao Motor Iniciado");
					producaoMotor.notify();  
				}
				
				synchronized(producaoEletronica) {
					System.out.println("Producao Eletronica Iniciado");
					producaoEletronica.notify();  
				}
				
				synchronized(producaoCarroceria) {
					System.out.println("Producao Carroceria Iniciado");
					producaoCarroceria.notify();  
				}
				
				synchronized(producaoBanco) {
					System.out.println("Producao Banco Iniciado");
					producaoBanco.notify();  
				}
				synchronized(carroNovo) {
					System.out.println("Carro Iniciado");
					carroNovo.notify();
				}		
						
			
			} 
			
		}.run();
	}
	
}
