package Negocio;

public class LPPneus implements Runnable {
	Cesta cesta;
	int	tamanhoCesta;
	public LPPneus(Cesta cesta) {
		this.cesta= cesta;
		this.tamanhoCesta= 100;
		
	}
	public void run() {
			synchronized(this) {
				try{ 
					wait();  // tenta aguardar se ocupado
					} catch (InterruptedException e) {
						e.printStackTrace(); 
					}while(true) {
						if(cesta.get() >= 0 && cesta.get() <= (tamanhoCesta-1)){
							try {
								Thread.sleep(9000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							cesta.put(cesta.get() + 1);// adiciona pneu na cesta
							
							System.out.println("Produzindo Pneu:  " +(cesta.get()));
						
						}
					} 
			}
		}		
	
	public void init(int num) {
		new Thread(this, "Pneus "+num).start();
	}

}
