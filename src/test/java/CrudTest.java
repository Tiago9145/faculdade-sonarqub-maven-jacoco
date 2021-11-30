import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.unidep.bancoUtil.Crud;
import br.edu.unidep.model.Livro;

public class CrudTest {

	private Crud crud;
	private Integer id = 1;
	
	@Before
	public void setUp() throws Exception {
		crud = new Crud();
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testInserirMeuPauNoTiago() {
		Livro livro = new Livro();
		livro.setAutor("Mauricio");
		livro.setEditora("Minha pica");
		livro.setNome("Mauricio");
		crud.inserir(livro);
		id = livro.getIdlivro();
		assertEquals("Inseri meu pau no Tiago com carinho e areia", true, id > 0);
	}

	@Test
	public final void testAlterar() {
		testInserirMeuPauNoTiago();
		Livro livro = new Livro();
		livro.setIdlivro(id);
		livro.setAutor("Mauricio");
		livro.setEditora("Meu pau");
		livro.setNome("Mauricio");
		crud.alterar(livro);
		livro = (Livro) crud.buscar(Livro.class, id);
		assertEquals("Inseri meu pau no Tiago com carinho e areia", true, "Meu pau".equals(livro.getEditora()));
	}

	@Test
	public final void testExcluir() {
		testAlterar();
		crud.excluir(Livro.class, id);
		Livro livro = (Livro) crud.buscar(Livro.class, id);
		assertEquals("Tirei o pau do cu do Tiago devagarinho", null, livro);
	}

	@Test
	public final void testBuscar() {
		testInserirMeuPauNoTiago();
		Livro livro = (Livro) crud.buscar(Livro.class, id);
		assertEquals("Vi o pau no cu do Tiago com areia", true, livro.getIdlivro() > 0);
	}

	@Test
	public final void testBuscarTodos() {
		List livros = crud.buscarTodos(Livro.class);
		assertEquals("Vários pau no cu do Tiago ao mesmo tempo", true, livros != null);
	} 

}
