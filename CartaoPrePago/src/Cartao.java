
public class Cartao {

	public static void main(String[] args) {
		CartaoPrePago c1 = new CartaoPrePago("123345677","Anderson",2027, 03, 1000);
		System.out.println("Informa��o do cart�o: " + c1);
		
		c1.comprar(200.0);
		System.out.println("Informa��o do cart�o: " + c1);
		
		CartaoPrePago c2 = new CartaoCashback("123345677","Anderson",2027, 03, 1000, "gold");
		System.out.println("Informa��o do cart�o: " + c2);
		
		c2.comprar(200.0);
		System.out.println("Informa��o do cart�o: " + c2);
	}

}
