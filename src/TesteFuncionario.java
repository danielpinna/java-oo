
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNome("Pinna");
		funcionario.setCpf("000.000.000-00");
		funcionario.setSalario(19000.0);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
	}
}
