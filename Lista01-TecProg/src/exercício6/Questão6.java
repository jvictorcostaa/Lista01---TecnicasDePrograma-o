package exerc�cio6;
//6) Verifique se A � maior que 10, se verdade imprima: "A > 10" caso n�o
//seja, imprima: "A <= 10". Verifique se A mais B � igual a 20, se
//verdadeiro, imprima: "A + B == 20�, caso n�o seja imprima: �A + B !=
//20�.

public class Quest�o6 {
	

	public static void main(String[] args) {

		int A=9;
		int B=9;
		
		if(A>10) {
			System.out.println("A>10");
		}else {
			System.out.println("A<=10");
		}
		
		if((A+B)==20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("A + B != 20");
		}
	}

}
