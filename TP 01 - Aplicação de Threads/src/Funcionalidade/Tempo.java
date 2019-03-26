package Funcionalidade;



public class Tempo {

	private int hora;
	private int minutos;
	private int segundos;
		
	public int getHora() {
		return hora;
	}


	public int getMinutos() {
		return minutos;
	}


	public int getSegundos() {
		return segundos;
	}

	public boolean cadastraHorario(int horaCadastrado, int minutosCadastrado, int segundosCadastrados){
		this.hora = horaCadastrado;
		this.minutos = minutosCadastrado;
		this.segundos = segundosCadastrados;
		System.out.println(this.hora+" "+this.minutos+" "+this.segundos);
		return true;
	}
}