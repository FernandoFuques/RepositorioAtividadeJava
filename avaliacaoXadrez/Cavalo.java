package avaliacaoXadrez;

public class Cavalo extends Peca {

	public Cavalo(String cor) {
		super(cor);
	}
	
	@Override
	public String getTipoPeca() {
		return "C";
	}

}
