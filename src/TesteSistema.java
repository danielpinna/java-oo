
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Autenticavel c = new Cliente();
		c.setSenha(2222);
		
		Autenticavel a = new Administrador();
		a.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(c);
		si.autentica(a);
	}

}
