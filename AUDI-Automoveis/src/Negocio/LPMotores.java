package Negocio;



public class LPMotores implements Runnable{
	Cesta cesta;
	int	tamanhoCesta;
	public LPMotores(Cesta cesta) {
		this.cesta= cesta;
		this.tamanhoCesta= 10;
		
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
								Thread.sleep(12000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							cesta.put(cesta.get() + 1);// adiciona produtos na cesta
		
							System.out.println("Produzindo Motor:  " +(cesta.get()));
							
						}
					} 
			}
		}		
	
	public void init(int num) {
		new Thread(this, "Motores "+num).start();
	}

}
