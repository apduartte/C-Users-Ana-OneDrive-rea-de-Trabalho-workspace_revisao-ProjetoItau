import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GravarCliente {
	//public void GravarCliente(Clientes[] cliente) throws IOException {
		// TODO Auto-generated method stub
		public void GravarCliente(ArrayList<Clientes> cliente) throws IOException {
			// TODO Auto-generated method stub

		FileWriter arquivo = new FileWriter("C:\\Users\\Ana\\OneDrive\\Área de Trabalho\\clientes.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);

		gravarArquivo.printf ("%n");
		gravarArquivo.printf ("3- Gravar  Clientes");
		gravarArquivo.printf ("%n");
		
		int contador =0;
		
		for (Clientes c: cliente) {
			if( contador <Clientes.size()) {
		}
						
			gravarArquivo.print("Registros de Clientes"+"%n");
			gravarArquivo.print("Nome: ");
			gravarArquivo.printf(c.getNome() + "%n");
			
			gravarArquivo.print("Agencia: ");
			gravarArquivo.printf(c.getAgencia() + "%n");
			
			gravarArquivo.print("Conta: ");
			gravarArquivo.printf(c.getConta() + "%n");
			
			gravarArquivo.print("E-mail: ");
			gravarArquivo.printf(c.getEmail() + "%n");
			
			gravarArquivo.print("Telefone: ");
			gravarArquivo.printf(c.getTelefone() + "%n");
			
			gravarArquivo.print("Saldo: ");
			gravarArquivo.printf(c.getSaldo() + "%n");
			
			gravarArquivo.printf("*************************************************" + "%n");
		}
			arquivo.close();
			System.out.println("Arquivo gravado na unidade C:\\Users\\Ana\\OneDrive\\Área de Trabalho");
	}


		
	}




	


