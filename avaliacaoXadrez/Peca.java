package avaliacaoXadrez;

public abstract class Peca {
	
	private String cor;
	
	public String getCor() {
		return cor;
	}
	
	public Peca(String cor) {
        this.cor = cor;
    }

    public abstract String getTipoPeca();
}
