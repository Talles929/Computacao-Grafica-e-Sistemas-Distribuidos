package Funcionalidade;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadDesliga extends Thread{
	public void run(){
		try {
			Runtime.getRuntime().exec("shutdown -s -t 00");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+" executada.");
	
	}


	
	public ThreadDesliga geraTimer(Tempo timer){
		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		//calcula o tempo em segun'dos
		long tempo = (long)((timer.getHora()*3600)+(timer.getMinutos()*60)+timer.getSegundos());
		System.out.println("Thread sera executada em "+tempo+" s.");
		ThreadDesliga ativa = new ThreadDesliga();
		exec.schedule(ativa, tempo, TimeUnit.SECONDS);
		exec.shutdown();
		return ativa;
	}
	
	
}
