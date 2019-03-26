package Apresentacao;

import java.util.ArrayList;

import Negocio.*;

public class Main {

	public static void main(String[] args) {
		new Runnable() {
			public void run() {
				final int tamanhoCesta= 20;// define tamanho da cesta
				int numProd = 5;
				int numCons = 5;
				Cesta cesta= new Cesta();
				ArrayList<Produtor> produtores= new ArrayList<Produtor>();
				ArrayList<Consumidor> consumidores = new ArrayList<Consumidor>();
				for (int i = 0; i < numProd; i++) {
					produtores.add(new Produtor(cesta,tamanhoCesta));
					produtores.get(i).init(i);//executa produtor
					
				}
				for (int i = 0; i < numCons; i++) {
					consumidores.add(new Consumidor(cesta,i));
					consumidores.get(i).init(i);//executa consumidor
					
				}
				Inicial frame = new Inicial(cesta);
				frame.setVisible(true);
				while(true) {
					if(cesta.get() == 0) {
						for (int j = 0; j < produtores.size(); j++) {
							synchronized(produtores.get(j)) {
								System.out.println("Produtor "+j+" Iniciado");
								produtores.get(j).notify();
							}
						}
						          
					}if(cesta.get() == tamanhoCesta) {
						for (int j = 0; j < consumidores.size(); j++) {
							synchronized(consumidores.get(j)) {
								System.out.println("Consumidor "+j+" Iniciado");
								consumidores.get(j).notify();
							}
						} 
					}
				}  
			}
		}.run();
	}

}
