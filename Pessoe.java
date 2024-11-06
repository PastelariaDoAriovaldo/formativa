package avformativa.desafios;

public class Pessoe extends Coracao {
	private String nome;
	private Coracao coracao;

	public Pessoe(String nome, int coracao) {
		this.nome = nome;
		this.coracao = new Coracao(coracao);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public int getCoracao() {
		return coracao.getBatimentos();
	}

}
