import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num,palin=0;
		
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt();
		ler.close();
		
		if(num<10 || num>-10)
			System.out.println(num+" � um n�mero pal�ndromo.");
		else {
			while(num!=0) {
				palin=(palin*10)+(num%10);
				num=num/10;
			}
			if(num==palin)
				System.out.println(num+" � um n�mero pal�ndromo.");
			else
				System.out.println(num+" n�o � um n�mero pal�ndromo.");
		}
	}

}
