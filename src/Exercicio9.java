import java.util.Scanner;

/*Para uma sequ�ncia matem�tica onde cada elemento � calculado da seguinte forma:
1!/N! ; 2!/(N-1)!; 3!/(N-2)!; ... ; (N! / 1!)
Crie um programa onde o usu�rio digite a quantidade de elementos que deseja exibir e sejam exibidos os elementos da sequ�ncia.
*/
public class Exercicio9 {
	//Nosso problema apresenta uma s�rie de problemas menores: precisamos calcular o fatorial do dividendo (n�mero que ser� dividido), do divisor(n�mero que dividir�), realizar a divis�o e, al�m disso, controlar quantas divis�es ser�o feitas. 
	//O c�lculo do fatorial � feito multiplicando um n�mero por todos os inteiros positivos anteriores a ele, at� 1. Logo 5! � 5x4x3x2x1 e 10! � 10x9x8x7x6x5x4x3x2x1.
	//Para realizar o c�lculo do fatorial de um valor qualquer, podemos contar com uma vari�vel para o resultado que inicia valendo 1 e multiplica a si mesma pelo pr�ximo valor, at� chegar em no valor que desejamos calcular. Veja esse exemplo:
	/* i = 1;
	 * resultado = 1;
	 * while(i<valor){
	 * 	resultado = resultado * i;
	 *  i++;
	 * }
	 * */
	
	//No exemplo acima, supondo que a vari�vel valor seja 5 e, portanto, que nosso desejo seja calcular o fatorial de 5, teremos as seguintes execu��es do loop:
	/*1� volta - resultado = 1 * 1
	 *2� volta - resultado = 1 * 2
	 *3� volta - resultado = 2 * 3
	 *4� volta - resultado = 6 * 4
	 *5� volta - resultado = 24 * 5 */
	//Quando o loop terminar, a vari�vel resultado valer� 120, que � o fatorial de 5
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Para nossa sorte, o usu�rio s� informar� um �nico valor: n. N ser� usado para sabermos quantas divis�es devemos realizar, mas tamb�m para avan�armos com o dividendo (que inicia em 1 e vai at� N!) e retroceder com o divisor (que inicia em N! e vai at� 1). Vamos criar, portanto, 6 vari�veis: n, dividendo, divisor, sendo do tipo int e elemento, que representar� o elemento calculado que ser� exibido e, por ser uma divis�o, ser� do tipo double. Nossa 5� vari�vel ser� usada para controlar o n�mero de voltas do nosso loop e nossa 6� vari�vel ser� usada para controlar o loop que calcula o fatorial. Ufa!
		int n, dividendo, divisor;
		double elemento;
		int i=0, iFatorial=1;
		
		//Primeiro vamos solicitar que o usu�rio informe n
		System.out.println("Por favor, informe quantos elementos da sequ�ncia deseja exibir: ");
		n = leitor.nextInt();
		
		//Para controlar a quantidade de elementos que precisamos calcular e exibir, vamos criar um loop que rode n vezes. Nossa condi��o, portanto, ser� i<n:
		while(i<n) {
			//Cada vez que esse loop executar, devemos calcular o dividendo, o divisor, realizar a divis�o e exibir. Vamos iniciar calculando o dividendo (n�mero de cima)
			dividendo = 1;
			iFatorial =1;
			while(iFatorial<=(i+1)) {
				//Esse loop ser� usado para calcular o fatorial do dividendo. Isso acontecer� fazendo a multiplica��o do dividendo por iFatorial e armazenado o resultado em dividendo. 
				dividendo = dividendo * iFatorial;
				iFatorial = iFatorial + 1;
			}
			//Agora vamos calcular o fatorial do divisor. Isso acontecer� fazendo a multiplica��o do divisor por IFatorial e armazenando o resultado em divisor
			iFatorial = n-i;
			divisor = 1;
			while (iFatorial>1) {
				divisor = divisor * iFatorial;
				iFatorial = iFatorial - 1;
			}
			
			//Quando chegarmos nesse ponto, j� temos o nosso dividendo e nosso divisor calculados. Resta realizarmos a divis�o entre eles, guardar na vari�vel elemento e exibir:
			elemento = dividendo / (double) divisor;
			//Se voc� quiser verificar o valor do dividendo e do divisor a cada volta, pode remover o coment�rio (//) no in�cio da linha 61 e colocar na linha 62
			//System.out.println(dividendo + "/" + divisor + "=" + elemento);
			System.out.print(elemento + ";");
			
			//N�o podemos esquecer de incrementar a vari�vel i para que nosso loop eventualmente se encerre
			i++;
		}
		leitor.close();
		
	}

}