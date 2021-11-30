import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.unidep.util.JPAUtil;

public class JPAUtilTest {

	private JPAUtil jpautil;
	@Before
	public void setUp() throws Exception {
		jpautil = new JPAUtil();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetEntityManager() {
		EntityManager em = jpautil.getEntityManager();
		assertEquals(true, em != null);
	}

}
