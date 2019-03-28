package Funcionalidade;

import javax.swing.JLabel;

public class ThreadSuspender extends Thread {
	private long tempo=0;
	Tempo timer;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	
	public ThreadSuspender(long tempo,JLabel l1, JLabel l2, JLabel l3, Tempo timer){
		
		this.tempo=tempo;
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
		this.timer=timer;
		
	}
	public void run(){
		try {
			int i = timer.getHora();
			int j = timer.getMinutos();
			int k = timer.getSegundos();
			System.out.println(i);
			for( ;i >= 0 || k> 0 || j> 0 ; i--){
				if(j==0){
					j = 59;
			
				}
				l1.setText(Integer.toString(i));
				for(; j>0 || k>0; j--){
					if(k==0){
						k = 59;
					}
					l2.setText(Integer.toString(j));
					
					for(; k>0; k--){
						System.out.println(i+"horas:"+j+"minutos:"+k+"seg");
						l3.setText(Integer.toString(k));
						sleep(tempo);
					}
				}
				
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}