import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num,i,soma=0;
		
		System.out.print("Digite um n�mero: ");
		num=ler.nextInt();
		ler.close();
		for(i=1;i<=num;i++) {
			if(i%2!=0) {
				soma+=i;
				System.out.println(i);
			}
		}
		
		System.out.println("A soma dos n�meros �mpares naturais at� "+num+" �: "+soma);

	}

}
