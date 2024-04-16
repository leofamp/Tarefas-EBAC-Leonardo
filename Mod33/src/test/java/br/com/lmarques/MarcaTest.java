package test.java.br.com.lmarques;

import main.java.br.com.lmarques.dao.IMarcaDao;
import main.java.br.com.lmarques.dao.MarcaDao;
import main.java.br.com.lmarques.domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MarcaTest {

    private IMarcaDao marcaDao;

    public MarcaTest(){
        marcaDao = new MarcaDao();
    }

    @Test
    public void cadastrar(){
        Marca marca = new Marca("A1", "Ford");
        marca = marcaDao.cadastrar(marca);
        assertNotNull(marca);
    }
}
