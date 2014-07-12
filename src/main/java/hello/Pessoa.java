package hello;

public class Pessoa {

	private final int codigo;

	private final String nome;

	private final String telefone;

	private Pessoa(int codigo, String nome, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}

	public static Pessoa of(int codigo, String nome, String telefone) {
		return new Pessoa(codigo, nome, telefone);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}
}
