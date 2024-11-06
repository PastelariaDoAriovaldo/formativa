package avformativa.desafios;

public class Objpessoa extends Pessoa {
	public static void main(String[] args) {
	
	Pessoa pessoa = new Pessoa ();
	Pessoa pessoa2 = new Pessoa();
	
	pessoa.setEndereco("Califórnia, USA");
	pessoa.setNome("Tom Cruise");
	pessoa.setIdade(60);
	pessoa.setProfissao("Ator");
	
	pessoa2.setEndereco("Miami, USA");
	pessoa2.setNome("Messi");
	pessoa2.setIdade(35);
	pessoa2.setProfissao("Soccer Player");
	
	System.out.println(pessoa.getEndereco());
	System.out.println(pessoa.getNome());
	System.out.println(pessoa.getIdade());
	System.out.println(pessoa.getProfissao());
	
	System.out.println(pessoa2.getEndereco());
	System.out.println(pessoa2.getNome());
	System.out.println(pessoa2.getIdade());
	System.out.println(pessoa2.getProfissao());
	}	
}
