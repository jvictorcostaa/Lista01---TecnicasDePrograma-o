package exerc�cio1;

//1) Verifique se A � maior que 10, se verdade imprima: "A > 10" e verifique
//se o A mais B � igual a 20, se verdade imprima: "A + B == 20". Caso a
//segunda afirma��o n�o seja verdadeira, imprima: "n�mero n�o v�lido".

public class Quest�o1{

	public static void main(String[] args) {
		int A = 11;
		int B = 8;
		
		if(A>10) {
			System.out.println("A > 10");
			}
		if((A + B)==20){
			System.out.println("A + B == 20");
		}else {
			System.out.println("n�mero n�o v�lido");
			}
	}
}