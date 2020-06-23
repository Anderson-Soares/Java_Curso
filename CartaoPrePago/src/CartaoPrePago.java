
public class CartaoPrePago {
	public String numeroCartao;
	public String nomeTitular;
	public int anoValidade;
	public int mesValidade;
	public double saldo;
	
	public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}

	protected String getNumeroCartao() {
		return numeroCartao;
	}

	protected void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	protected String getNomeTitular() {
		return nomeTitular;
	}

	protected void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	protected int getAnoValidade() {
		return anoValidade;
	}

	protected void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	protected int getMesValidade() {
		return mesValidade;
	}

	protected void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	protected void adicionarCredito(double valor) {
		if (valor < 0) {
			throw new CardException("Nao e possivel adicionar valor negativo");
		}
		this.saldo = this.saldo + valor;
		}

	
	protected boolean comprar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println("Compra realizada com sucesso! Valor da compra: " + valor + " reais");
			return true;
		} else {
		throw new CardException("Não dá pra comprar pq nao tem saldo.");
		//System.out.println("Saldo insuficiente");
		//return false;
		}
	}
	
	@Override
	public String toString() {
		return " O Cartao: " + numeroCartao + " do titular " + nomeTitular + " possui o saldo de: " + saldo; 
	}
}
