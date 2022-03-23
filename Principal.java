import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal{

	
	public static void main(String[] args) throws IOException {

		//declarando váriavel Menu Principal
		int opcao=0;
		
		// recebendo as informações via teclado
		Scanner teclado = new Scanner(System.in);
		ArrayList<Clientes> cliente  = new ArrayList<Clientes>();
		
		while (opcao < 5 || opcao == 0 || opcao > 5) {
			
			System.out.println("***********************************************");
			System.out.println("*            Projeto Itáu                     *");
			System.out.println("***********************************************");
			System.out.println("*                                             *");
			System.out.println("*            Menu Principal                   *");
			System.out.println("*                                             *");
			System.out.println("*            1- Cadastra Clientes             *");
			System.out.println("*            2- Lista  Clientes               *");
			System.out.println("*            3- Grava  Clientes               *");
			System.out.println("*            4- Consulta Clientes             *");
			System.out.println("*            5- Sair                          *");
			System.out.println("*                                             *");
			System.out.println("***********************************************");
			System.out.println();
			System.out.println("Escolha uma opção: ");
			opcao = teclado.nextInt();
		
			switch (opcao) {
			
				case 1:{
				
					System.out.println("  1- Cadastra Clientes");
					System.out.println();

					System.out.println("Digite com a Agência: ");
					int agencia =(teclado.nextInt());
					
					System.out.println("Digite com a Conta: ");
					int conta = teclado.nextInt();
							
					System.out.println("Digite o nome: ");
					String nome=teclado.next();
				
					System.out.println("Digite o e-mail: ");
					String email=teclado.next();
					
					System.out.println("Digite o Telefone: ");
					double telefone =teclado.nextDouble();
					
					System.out.println("Digite o saldo: ");
					double saldo=teclado.nextDouble();
					
							
					System.out.println("Agência: "+agencia+" Conta: "+conta+" Nome: "+nome+ " E-mail: "+email+" Saldo: "+saldo);
					
					Clientes c = new Clientes();
					c.setAgencia(agencia);
					c.setConta(conta);
					c.setNome(nome);
					c.setEmail(email);
					c.setTelefone(telefone);
					c.setSaldo(saldo);
					cliente.add(c);
					
					break;
				}
				
				case 2:{
					ListarClientes listar = new ListarClientes();
					listar.ListarClientes(cliente);
					break;
				}
				case 3:{
					GravarCliente gravar = new GravarCliente();
					gravar.GravarCliente(cliente);
					break;
				}
				case 4:{
					ConsultarCliente consultar = new ConsultarCliente();
					consultar.ConsultarCliente();
					break;
				}
				case 5:{
					System.out.println("Sair");
					return;
				}
				default:
					System.out.println("Opção Inválida!");
			
				}

		

		}
}
}



	


