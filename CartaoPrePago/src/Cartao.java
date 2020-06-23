import java.util.Scanner;
public class Cartao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		CartaoPrePago c1 = new CartaoPrePago("123345677","Anderson",2027, 03, 1000);
		System.out.println("Informação do cartão: " + c1);
		
		c1.comprar(200.0);
		System.out.println("Informação do cartão: " + c1);
		
		try {
		c1.adicionarCredito(entrada.nextFloat());
		System.out.println("Informação do cartão: " + c1);
		} catch (CardException ex) {
			System.out.println("Opa campeão, digita um número maior que zero ai faz favor.");
		}
		
		try {
			c1.comprar(entrada.nextFloat());
			System.out.println("Informação do cartão: " + c1);
			} catch (CardException ex) {
				System.out.println("Ta de brincation wit me né campeão, insire um saldo antes.");
			}
		*/
		CartaoPrePago c2 = new CartaoCashback("123345677","Anderson",2027, 03, 1000, "gold");
		System.out.println("Informação do cartão: " + c2);
		
		c2.comprar(200.0);
		System.out.println("Informação do cartão: " + c2);
		
		try {
			c2.adicionarCredito(entrada.nextFloat());
			System.out.println("Informação do cartão: " + c2);
			} catch (CardException ex) {
				System.out.println("Opa campeão, digita um número maior que zero ai faz favor.");
				System.out.println("Motivo: " +ex.getMessage());
			} catch (Exception ex) {
				System.out.println("Erro desconhecido");
			}
			
			try {
				c2.comprar(entrada.nextFloat());
				System.out.println("Informação do cartão: " + c2);
				} catch (CardException ex) {
					System.out.println("Ta de brincation wit me né campeão, insire um saldo antes.");
				}
		} 

}
