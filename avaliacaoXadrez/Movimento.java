package avaliacaoXadrez;

import javax.swing.JOptionPane;

public class Movimento extends Tabuleiro{
	int quant;

	public void moverPeao1() {
		começaJogo();
		quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas casas ele deve andar?", "Xadrez", 1));
		if(quant == 1) {
			tabuleiro[2][0] = new Peao("branco");
		}else {
			tabuleiro[3][0] = new Peao("branco");
		}
		verPartida();
	}

	public void moverPeao2() {
		começaJogo();
		quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas casas ele deve andar?", "Xadrez", 1));
		if(quant == 1) {
			tabuleiro[2][1] = new Peao("branco");
		}else {
			tabuleiro[3][1] = new Peao("branco");
		}
		verPartida();
	}
	
	public void moverPeao3() {
		começaJogo();
		quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas casas ele deve andar?", "Xadrez", 1));
		if(quant == 1) {
			tabuleiro[2][2] = new Peao("branco");
		}else {
			tabuleiro[3][2] = new Peao("branco");
		}
		verPartida();
	}
	
	public void moverPeao4() {
		começaJogo();
		quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas casas ele deve andar?", "Xadrez", 1));
		if(quant == 1) {
			tabuleiro[2][3] = new Peao("branco");
		}else {
			tabuleiro[3][3] = new Peao("branco");
		}
		verPartida();
	}
	
	public void moverPeao5() {
		começaJogo();
		quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas casas ele deve andar?", "Xadrez", 1));
		if(quant == 1) {
			tabuleiro[2][4] = new Peao("branco");
		}else {
			tabuleiro[3][4] = new Peao("branco");
		}
		verPartida();
	}
	
	public void moverPeao6() {
		começaJogo();
		quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas casas ele deve andar?", "Xadrez", 1));
		if(quant == 1) {
			tabuleiro[2][5] = new Peao("branco");
		}else {
			tabuleiro[3][5] = new Peao("branco");
		}
		verPartida();
	}
	
	public void moverPeao7() {
		começaJogo();
		quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas casas ele deve andar?", "Xadrez", 1));
		if(quant == 1) {
			tabuleiro[2][6] = new Peao("branco");
		}else {
			tabuleiro[3][6] = new Peao("branco");
		}
		verPartida();
	}

	public void moverPeao8() {
		começaJogo();
		quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas casas ele deve andar?", "Xadrez", 1));
		if(quant == 1) {
			tabuleiro[2][7] = new Peao("branco");
		}else {
			tabuleiro[3][7] = new Peao("branco");
		}
		verPartida();
	}
	
	public void moverRei() {
		
	}
	
	public void moverRainha() {
		
	}
	
	public void moverBispo1() {
		
	}
	
	public void moverBispo2() {
		
	}
	
	public void moverTorre1() {
		
	}
	
	public void moverTorre2() {
		
	}
}
