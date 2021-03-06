
public class TesteBanco {

	public static void main(String[] args) {
		System.out.println("-------------------------------------------------------");
		
		Pessoa p = new Pessoa("Goku", 123, 10);
		System.out.println(
				"Nome: " + p.getNome() +
				"\nCPF: " + p.getCpf() +
				"\nIdade: " + p.getIdade()
 				);
		
		System.out.println("-------------------------------------------------------");
		
		Conta c = new Conta("Corrente",p, "senha", 123);
		c.setSaldo(5000.00);
		
		Pessoa x = c.getTitular();
		System.out.println(
				"Tipo de Conta: " + c.getTipo() +
				"\nTitular: " + x.getNome() + // Outra opção c.getTitular().getNome();
				"\nSenha: " + c.getSenha() +
				"\nCodigo: " + c.getCodigo() +
				"\nSaldo: " + c.getSaldo()
				);
		
		System.out.println("-------------------------------------------------------");
		
		Banco b = new Banco(66, "Banco do Tony", c);
		
		System.out.println(
				"Nome: " + b.getNome() +
				"\nNumero: " + b.getNumero() +
				"\nConta: " + b.getConta().getCodigo()
				);
		
		System.out.println("-------------------------------------------------------");
	}
}











