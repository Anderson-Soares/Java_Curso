
public class CartaoCashback extends CartaoPrePago {
	String tipoDeCartao;
	
	protected CartaoCashback(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			String tipoDeCartao) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipoDeCartao = tipoDeCartao;
	}

	protected void comprar(double valor) {
		if (this.saldo >= valor) {
			if (tipoDeCartao.equals("gold")) {
				this.saldo = super.saldo + (valor*0.08) - valor;
				System.out.println("Compra realizada com sucesso! Valor da compra: " + valor + " reais");
			}
				//return true; }
			else if ( tipoDeCartao.equals("silver")) {
				this.saldo = super.saldo + (valor*0.05) - valor;
				System.out.println("Compra realizada com sucesso! Valor da compra: " + valor + " reais");
				return true;
			}
			else if (tipoDeCartao.equals("bronze")) {
				this.saldo = super.saldo + (valor*0.02) - valor;
				System.out.println("Compra realizada com sucesso! Valor da compra: " + valor + " reais");
				return true;
			}
			
		} else {
			throw new CardException("Saldo inferior ao valor da compra.");
		}
		//System.out.println("Saldo insuficiente");
		//return false;
	}
	
	@Override
	public String toString() {
		return " O Cartao: " + numeroCartao + " do titular " + nomeTitular + " possui o saldo de: " + saldo; 
	}
}
