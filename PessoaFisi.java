package avformativa.desafios;

public class PessoaFisi extends Pessoa6 {

	private String cpf;
	private String rg;
	
	public PessoaFisi (String nome, String telefone,String cpf, String rg) {
		super(nome,telefone);
		this.cpf=cpf;
		this.rg=rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
