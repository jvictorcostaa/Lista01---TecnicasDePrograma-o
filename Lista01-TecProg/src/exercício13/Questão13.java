package exerc�cio13;

//13) Verifique se A � maior que 10, se verdade imprima: "A > 10". Ainda,
// se o A mais B � igual a 20, se verdade imprima: "A + B == 20�.
//Caso as afirma��es n�o sejam verdadeiras, imprima: "n�meros n�o
//v�lidos".

public class Quest�o13 {

	public static void main(String[] args) {
		
		int A=12;
		int B=9;
		
			if(A>10) {
			System.out.println("A > 10");
			}
			if((A+B)==20){
				System.out.println("A + B == 20");
			}else if(A<10 && (A+B)!=20) {
				System.out.println("n�meros n�o v�lidos");
		}	

	}

}
