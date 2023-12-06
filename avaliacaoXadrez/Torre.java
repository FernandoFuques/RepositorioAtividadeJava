package avaliacaoXadrez;

public class Torre extends Peca{

	 public Torre(String cor) {
		 super(cor);
	 }
	 
	@Override
	public String getTipoPeca() {
		return "T";
	}
}
