package exerc�cio12;

//12) Verifique se A � maior que 10 imprima: "A > 10" ou verifique se A mais
//B � igual a 20, imprima: "A + B == 20'', caso as afirma��es n�o sejam
//verdadeiras, imprima: "n�meros n�o v�lidos". Sejam as afirma��es
//anteriores falsas ou verdadeiras imprima: �Sejam bem-vindos �
//disciplina de T�cnicas de Programa��o�.


public class Quest�o12 {

	public static void main(String[] args) {
		
		int A=8;
		int B=10;
		
			if(A>10) {
			System.out.println("A > 10");
			}else if((A+B)==20) {
				System.out.println("A + B == 20");
				}else {
				System.out.println("n�meros n�o v�lidos");
			}
			System.out.println("Sejam bem-vindos � disciplina de T�cnicas de Programa��o S2");
	}
}	

/*		int A=9;
		int B=11;
		
			if(A>10) {
			System.out.println("A > 10");
			}
			if((A+B)==20){
				System.out.println("A + B == 20");
			}
			 
			if(A<10 && (A+B)!=20) {
				System.out.println("n�meros n�o v�lidos");

		}
		System.out.println("Sejam bem-vindos � disciplina de T�cnicas de Programa��o S2");
	}

}*/
