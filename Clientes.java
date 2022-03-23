import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {
	static Scanner teclado = new Scanner(System.in);
	
	
	
	
	// Declaração das variáveis privadas
	private int agencia;
	private int conta;
	private String nome;
	private String email;
	private double telefone;
	private double saldo;
	
	//criando um ArrayList
	ArrayList<Clientes> cliente = new ArrayList<Clientes>();
	int contador = 0;
	
	//criando métodp para cadastrar clientes
	
	public static int size() {
		// TODO Auto-generated method stub
		return 0;
		
	}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getConta() {
			return conta;
		}

		public void setConta(int conta) {
			this.conta = conta;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public double getTelefone() {
			return telefone;
		}

		public void setTelefone(double telefone) {
			this.telefone = telefone;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

}