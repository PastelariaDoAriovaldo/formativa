package avformativa.desafios;

public class Leao extends Anime {
	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O leão esta rugindo");
	}

}
