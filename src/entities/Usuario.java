package entities;

public class Usuario {

	private String nome;
	private String mail;
	
	public Usuario() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Usuario(String nome, String mail) {
		super();
		this.nome = nome;
		this.mail = mail;
	}
	
	
}
