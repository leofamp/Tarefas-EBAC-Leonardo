package test.java.br.com.lmarques;

import main.java.br.com.lmarques.dao.CursoDao;
import main.java.br.com.lmarques.dao.ICursoDao;
import main.java.br.com.lmarques.domain.Curso;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {

    private ICursoDao cursoDao;

    public CursoTest(){
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar(){
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("Curso Teste");
        curso.setNome("Curso Teste");
        curso = cursoDao.cadastrar(curso);
        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
