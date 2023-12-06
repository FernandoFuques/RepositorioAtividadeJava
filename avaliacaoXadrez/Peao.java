package avaliacaoXadrez;

public class Peao extends Peca {

	public Peao(String cor) {
		super(cor);
	}

	@Override
	public String getTipoPeca() {
		return "P";
	}

}
