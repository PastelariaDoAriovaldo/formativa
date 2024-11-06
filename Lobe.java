package avformativa.desafios;

public class Lobe extends Anime{
	public Lobe(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O lobe está uivande");
	}

}


