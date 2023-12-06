package avaliacaoXadrez;

public class Tabuleiro {
	int l;
	int c;
	public static boolean checkmate = false;
	
	 protected Peca[][] tabuleiro;
	
	public Tabuleiro() {
        tabuleiro = new Peca[8][8];
        começaJogo();
    }

	protected void começaJogo() {
		
		tabuleiro[0][0] = new Torre("branco");
	    tabuleiro[0][1] = new Cavalo("branco");
	    tabuleiro[0][2] = new Bispo("branco");
	    tabuleiro[0][3] = new Rainha("branco");
	    tabuleiro[0][4] = new Rei("branco");
	    tabuleiro[0][5] = new Bispo("branco");
	    tabuleiro[0][6] = new Cavalo("branco");
	    tabuleiro[0][7] = new Torre("branco");
	    tabuleiro[1][0] = new Peao("branco");
	    tabuleiro[1][1] = new Peao("branco");
	    tabuleiro[1][2] = new Peao("branco");
	    tabuleiro[1][3] = new Peao("branco");
	    tabuleiro[1][4] = new Peao("branco");
	    tabuleiro[1][5] = new Peao("branco");
	    tabuleiro[1][6] = new Peao("branco");
	    tabuleiro[1][7] = new Peao("branco");
	     
	    tabuleiro[6][0] = new Peao("preto");
	    tabuleiro[6][1] = new Peao("preto");
	    tabuleiro[6][2] = new Peao("preto");
	    tabuleiro[6][3] = new Peao("preto");
	    tabuleiro[6][4] = new Peao("preto");
	    tabuleiro[6][5] = new Peao("preto");
	    tabuleiro[6][6] = new Peao("preto");
	    tabuleiro[6][7] = new Peao("preto");
	    tabuleiro[7][0] = new Torre("preto");
	    tabuleiro[7][1] = new Cavalo("preto");
	    tabuleiro[7][2] = new Bispo("preto");
	    tabuleiro[7][3] = new Rainha("preto");
	    tabuleiro[7][4] = new Rei("preto");
	    tabuleiro[7][5] = new Bispo("preto");
	    tabuleiro[7][6] = new Cavalo("preto");
	    tabuleiro[7][7] = new Torre("preto");
	       
	    }
	
    public void verPartida() {
    	 System.out.println("     BRANCO");
        for ( l = 0; l < 8; l++) {
            for ( c = 0; c < 8; c++) {
                if (tabuleiro[l][c] != null) {
                    System.out.print(tabuleiro[l][c].getTipoPeca() + " ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("     PRETO");
        System.out.println("\n");
    }
}
