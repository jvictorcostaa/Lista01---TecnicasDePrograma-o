package exerc�cio4;
//Verifique se A � maior que 10 ou se A mais B � igual a 20, se verdade
//imprima: "n�mero v�lido". Caso as afirma��es n�o sejam verdadeiras,
//Verificar se A � igual B, caso verdade imprima: (A � igual B; A e B s�o
//diferentes de 10; A � menor que 10) caso n�o seja verdade imprima:
//"n�mero n�o v�lido".

public class Quest�o4 {

	public static void main(String[] args) {
		int A = 8;
		int B = 7;
		
		if(A > 10 || (A+B)==20){
			System.out.println("n�mero v�lido");
			
		}else if(A==B){
			System.out.println("A � igual B; A e B s�o diferentes de 10; A � menor que 10");
			 
		}else{
			System.out.println("n�mero n�o v�lido");
		}
		
		
	}

}
