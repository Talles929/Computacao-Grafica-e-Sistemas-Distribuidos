package Negocio;

public class Cesta {
	int n = 0;
	synchronized public int get()  {// retorna a quantidade na cesta
		
		return n;
	}
	 synchronized public int put(int n)  {// adiciona produtos à cesta
		this.n= n;
		return this.n;
	}


}
