package Negocio;



public class Produtor implements Runnable {
	Cesta cesta;
	int	tamanhoCesta;
	int numeroProd;
	public Produtor(Cesta cesta, int tamanhoCesta) {
		this.cesta= cesta;
		this.tamanhoCesta= tamanhoCesta;
	}
	public void run() {
		while(true) {
			synchronized(this) {
				try{ 
					wait();  // tenta aguardar se ocupado
					} catch (InterruptedException e) {
						e.printStackTrace(); 
					}while(cesta.get() >= 0 && cesta.get() <= (tamanhoCesta-1)) {
						cesta.put(cesta.get() + 1);// adiciona produtos na cesta
						System.out.println("Produzindo: " + (cesta.get()));
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
		new Thread(this, "Produtor "+num).start();
	}

}
