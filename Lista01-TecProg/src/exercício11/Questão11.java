package exercício11;
//11)Verifique se A é maior que 10 se não for verifique se A mais B é igual a
//20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
//for diferente de 20, imprima: "número não válido".


public class Questão11 {

	public static void main(String[] args) {
	
		int A=10;
		int B=9;
		
		if(A>10) {
		}else if((A+B)==20) {
			System.out.println("A + B == 20");
		}else {
				System.out.println("número não válido");
		}
		
//		if(A<10 && (A+B)!=20) {
//			System.out.println("número não válido");
		}

	}


