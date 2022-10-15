
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Pinna");
		gerente.setCpf("000.000.000-00");
		gerente.setSalario(25000.0);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(222);
		boolean autenticou = gerente.autentica(222);
		
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonificacao());
	}
}
