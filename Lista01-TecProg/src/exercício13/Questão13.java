package exercício13;

//13) Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
// se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
//Caso as afirmações não sejam verdadeiras, imprima: "números não
//válidos".

public class Questão13 {

	public static void main(String[] args) {
		
		int A=12;
		int B=9;
		
			if(A>10) {
			System.out.println("A > 10");
			}
			if((A+B)==20){
				System.out.println("A + B == 20");
			}else if(A<10 && (A+B)!=20) {
				System.out.println("números não válidos");
		}	

	}

}
