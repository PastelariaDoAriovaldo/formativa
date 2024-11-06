package avformativa.desafios;

public class Anime {
	private String nome;
	private String sexo;
	private String raca;
	
	public Anime(String nome, String sexo, String raca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}

	public void getdormir() {
		System.out.println("Dormindo");
	}

	public void caminhar() {
		System.out.println("Caminhando");;
	}

	public void correr() {
		System.out.println("Correndo");
	}

	public void emitirSom() {
		System.out.println("Emitindo Som");;
	}

}
