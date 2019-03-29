package Negocio;

public class LPBancos implements Runnable {
	Cesta cesta;
	int	tamanhoCesta;
	public LPBancos(Cesta cesta) {
		this.cesta= cesta;
		this.tamanhoCesta= 25;
		
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
								Thread.sleep(6000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							cesta.put(cesta.get() + 1);// adiciona produtos na cesta
							System.out.println("Produzindo Banco:  " +(cesta.get()));
							
						}
					}
					
			}
		}		
	
	public void init(int num) {
		new Thread(this, "Bancos "+num).start();
	}

}
