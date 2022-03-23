import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.*;

public class ConsultarCliente {



		public void ConsultarCliente() {
			String mostra="";
			String nomeArq="C:\\Users\\Ana\\OneDrive\\Área de Trabalho";
			String linha="";
			File arq = new File(nomeArq);
			
			//uma analise para verificar se o arquivo existe
			if(arq.exists()) {
				mostra="Arquivo - "+arq+",Arquivo aberto com sucesso";
				mostra="Tamanho do Arquivo - "+Long.toString(arq.length())+"\n";
			}
			// uma tentativa de leitura do arquivo
			try {
			FileReader reader = new FileReader(nomeArq);
			
			//Ler todo o arquivo e armazenar no Buffer de memória
			BufferedReader leitor = new BufferedReader(reader);
			while(true) {
				linha = leitor.readLine();
				System.out.println(linha);
				
			if(linha==null)
			break;
			mostra+=linha+"\n";
			}
			}
			catch(Exception erro) {
			}	
			System.out.println("conteúdo existente");
		}
}