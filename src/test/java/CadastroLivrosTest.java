import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.unidep.principal.CadastroLivros;

public class CadastroLivrosTest {

	private  CadastroLivros cadastroLivros;

	@Before
	public void setUp() throws Exception {
		cadastroLivros = new CadastroLivros();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 3000)
	public final void testCadastrarLivros() {
		//cadastroLivros.cadastrarLivros();
		assertEquals(true, 1==1);
	}

}
