import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome completo: ");
		String nome = scanner.nextLine();
		
		System.out.print("logradouro: ");
		String rua = scanner.nextLine();
		
		System.out.print("Numero: ");
		String numero = scanner.nextLine();
		
		System.out.print("Bairro: ");
		String bairro = scanner.nextLine();
		
		System.out.print("CEP: ");
		String cep = scanner.nextLine();
		
		System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        
		System.out.print("Estado: ");
		String estado = scanner.nextLine();
		
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + rua + ", " + numero + " - " + bairro);
		System.out.println("CEP: " + cep);
		System.out.println("Cidade: " + cidade + " - " + estado);

	}

}
