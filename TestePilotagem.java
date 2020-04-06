import java.util.Scanner;
class TestePilotagem 
{
	public static void main(String[] args) 
	{
		int tot, voltas;
		String resp;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de piloto: ");
		tot = teclado.nextInt();

		Piloto p[] = new Piloto[tot];
		Formula1 f[] = new Formula1[tot];

		// Declarando as corridas
		Terminada t = new Terminada(tot);

		for(int i = 0; i < tot; i++){
			p[i] = new Piloto();
			System.out.println("==== PILOTO " + (i + 1) + " ====");
			System.out.print("Nome => ");
			p[i].setNome(teclado.next());
		}

		// Aplicando o resultado
		System.out.print("Digite a quantidade de voltas: ");
		voltas = teclado.nextInt();
		
		System.out.print("Quer comecar? [S/N] ");
		resp = teclado.next();
		
		// Preparando as corridas
		for(int i = 0; i < tot; i++){	
			f[i] = new Formula1(p[i], 500, voltas, t);
		}

		// Começando as corridas
		Corrida c = new Corrida(f, t);
		if(resp.toUpperCase().equals("S"))
			c.correr();
		else
			System.out.println("Corrida não iniciada!!!");
	}
}
