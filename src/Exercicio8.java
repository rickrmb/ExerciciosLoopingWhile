import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		//*Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a média. Faça um programa onde o professor informe a média e as notas de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior à média e quantos tiveram nota inferior à média.*/
		
		Scanner leitor = new Scanner (System.in);
		
		double media;
		double notas;
		int i = 0;
		int totalMaior=0, totalMenor=0;
		
		System.out.println("Por favor, informe a média de notas dessa turma");
		media=leitor.nextDouble();
		
		while(i<3) {
			System.out.println("Por favor, digite a nota do " + (i+1) + " aluno");
			notas=leitor.nextDouble();
			
			if(notas > media) {
				totalMaior = totalMaior +1;
			}else {
				totalMenor = totalMenor +1;
			}
			i++;			;
		}
		
		System.out.println("Tiveram " + totalMaior + " alunos com nota maior que média, e " + totalMenor + " com nota menor que a média");
				
		leitor.close();
		
			
	}

}