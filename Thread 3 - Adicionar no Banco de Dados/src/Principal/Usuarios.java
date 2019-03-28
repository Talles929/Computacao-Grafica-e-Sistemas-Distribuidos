package Principal;



public class Usuarios {

	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String apelido) {
		this.senha = apelido;
	}
	
	private String nome;
	private String senha;
	
	
	//gere os métodos getters and setters
}