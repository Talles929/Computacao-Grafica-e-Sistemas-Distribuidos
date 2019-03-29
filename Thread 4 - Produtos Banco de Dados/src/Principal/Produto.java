package Principal;



public class Produto {

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
	public String getquantProduto() {
		return quantProduto;
	}
	public void setQuantProduto(String quantProduto) {
		this.quantProduto = quantProduto;
	}
	public String getvalorProduto() {
		return valorProduto;
	}
	public void setValorProduto(String valorProduto) {
		this.valorProduto = valorProduto;
	}
	private String nome;
	private String quantProduto;
	private String valorProduto;
	
}