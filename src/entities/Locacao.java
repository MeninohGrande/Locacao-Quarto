package entities;

public class Locacao {

	private int idAluguel;
	private Usuario user;
	private int numQuarto;
	public Locacao() {}
	
	public Locacao(int idAluguel, int numQuarto, String nome, String mail) {
		this.idAluguel = idAluguel;
		this.numQuarto = numQuarto;
		user = new Usuario(nome, mail);
	}
	
	public int getIdAluguel() {
		return this.idAluguel;
	}
	
	public void setIdALuguel(int id) {
		this.idAluguel = id;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public int getNumQuarto() {
		return numQuarto;
	}
	
}
