import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. Para isso, devem acertar quantos feij�es est�o em um jarro (1238). Fa�a um programa que solicite a digita��o da quantidade de feij�es at� que um cliente acerte.
		
		Scanner leitor = new Scanner(System.in);
		
		int digitado=0;
		int tentativa=0;

		System.out.println("Por favor digite a quantidade de feij�es");
		digitado = leitor.nextInt();
		
		while(digitado != 1238 && tentativa < 4) {
			System.out.println("Por favor, digite novamente");
			digitado = leitor.nextInt();
			tentativa = tentativa + 1;
		}
		
		if(digitado==1238) {
			System.out.println("Parab�ns! Voc� ganhou uma noite no castelo da princesa Javarella!");
			System.out.println("Voc� tentou " + tentativa + " vezes");
		}else {
			System.out.println("Voc� gastou todas as tentativas.");
		}
				
		
		leitor.close();
	}

}
