package Negocio;

import Apresentaçao.Inicial;

public class CarroConsumidor implements Runnable{

	Cesta cestaPneus;
	Cesta cestaMotor;
	Cesta cestaEletronica;
	Cesta cestaCarroceria;
	Cesta cestaBancos;
	Cesta Carros;
	Inicial frame;

	public CarroConsumidor(Inicial frame, Cesta cestaPneus,Cesta cestaMotor,Cesta cestaEletronica,Cesta cestaCarroceria,Cesta cestaBancos,Cesta CestaCarros) {
		this.cestaPneus = cestaPneus;
		this.cestaMotor = cestaMotor;
		this.cestaEletronica = cestaEletronica;
		this.cestaCarroceria = cestaCarroceria;
		this.cestaBancos = cestaBancos;
		this.Carros = CestaCarros;
		this.frame = frame;
	}
	public void run() {
		while(true) {
			synchronized(this) {
				try{
					wait();  // tenta aguardar se ocupado
					}
				catch (InterruptedException e) {
					e.printStackTrace();
					//quantidade necessaria para produzir um carro
					}while(true) {
						if(cestaPneus.get() >= 4 && cestaMotor.get() >= 1 && cestaEletronica.get() >= 1
							&& cestaCarroceria.get() >= 1 && cestaBancos.get() >= 5){
							cestaPneus.put(cestaPneus.get() -4);// tira 4 pneus da cesta
							cestaMotor.put(cestaMotor.get() -1);// tira 1 motor da cesta
							cestaEletronica.put(cestaEletronica.get() -1);// tira 1 eletronica da cesta
							cestaCarroceria.put(cestaCarroceria.get() -1);// tira 1 carroceria da cesta
							cestaBancos.put(cestaBancos.get() -5);// tira 5 bancos da cesta
							System.out.println("Consumindo Pneus:  "+ (cestaPneus.get()));
							System.out.println("Consumindo Motor:  "+ (cestaMotor.get()));
							System.out.println("Consumindo Eletronica:  "+ (cestaEletronica.get()));
							System.out.println("Consumindo Carroceria:  "+ (cestaCarroceria.get()));
							System.out.println("Consumindo Bancos:  "+ (cestaBancos.get()));
							frame.geraMovimento();
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
							Carros.put(Carros.get() + 1);
							System.out.println(Carros.get());
						}
						
				}
			}
		}
	}
	public void init() {
		new Thread(this, "Carro Consumidor ").start();
	}

}
