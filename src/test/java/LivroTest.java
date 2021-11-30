import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.unidep.model.Livro;
import br.edu.unidep.unumeracao.Status;

public class LivroTest {

	private Livro livro;
	
	@Before
	public void setUp() throws Exception {
		livro = new Livro();
	}

	@Test
	public final void testLivroStringStringStringDateStatus() {
	}

	@Test
	public final void testGetIdlivro() {
		livro.setIdlivro(1);
		assertEquals(1, livro.getIdlivro()); 
	}

	@Test
	public final void testGetStatus() {
		livro.setStatus(Status.ATIVO);
		assertEquals(Status.ATIVO,livro.getStatus()); 
	}

	@Test
	public final void testSetStatus() {
		livro.setStatus(Status.ATIVO);
		assertEquals(Status.ATIVO,livro.getStatus());  
	}

	@Test
	public final void testSetIdlivro() {
		livro.setIdlivro(1);
		assertEquals(1, livro.getIdlivro()); 
	}

	@Test
	public final void testGetNome() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetNome() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAutor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetAutor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetEditora() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetEditora() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetDataedicao() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetDataedicao() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testLivro() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToString() {
		fail("Not yet implemented"); // TODO
	}

}
