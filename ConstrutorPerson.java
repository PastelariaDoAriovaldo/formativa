package avformativa.desafios;

public class ConstrutorPerson {

	public static void main(String[] args) {
		
		Pessoa jogador1 = new Pessoa();
		Pessoa jogador2 = new Pessoa();
		
		jogador1.setNome("HulkBr");
		jogador1.setIdade(666);
		
		jogador2.setNome("Carlinhos");
		jogador2.setIdade(60);
		
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		
	}
}
