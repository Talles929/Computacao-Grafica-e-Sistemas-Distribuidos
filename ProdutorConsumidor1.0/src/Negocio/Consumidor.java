package Negocio;

public class Consumidor implements Runnable{
	Cesta cesta;
	int numCons;
	public Consumidor(Cesta cesta, int x) {
		this.cesta= cesta;
		this.numCons = x;
	}
	public void run() {
		while(true) {
			synchronized(this) {
				try{
					wait();  // tenta aguardar se ocupado
					}
				catch (InterruptedException e) {
					e.printStackTrace();
					}while(cesta.get() != 0) {
						cesta.put(cesta.get() -1);// tira produto da cesta
						System.out.println("Consumindo: "+this.numCons+"  "+ (cesta.get()+1));
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			}
		}
	}
	public void init(int num) {
		new Thread(this, "Consumidor "+num).start();
	}

}
