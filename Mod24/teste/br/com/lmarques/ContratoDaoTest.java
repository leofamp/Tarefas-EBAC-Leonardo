package br.com.lmarques;

import br.com.lmarques.dao.ContratoDao;
import br.com.lmarques.dao.IContratoDao;
import br.com.lmarques.service.ContratoService;
import br.com.lmarques.service.IContratoService;

import org.junit.Assert;
import org.junit.Test;

public class ContratoDaoTest {

    @Test
    public void salvar() {
        IContratoDao dao = new ContratoDao();
        String res = dao.salvar();
        Assert.assertEquals("Salvo", res);
    }

    @Test
    public void buscar() {
    	IContratoDao dao = new ContratoDao();
        Boolean res = dao.buscar();
        Assertions.assertEquals(true, res);
    }

    @Test
    public void excluir() {
    	IContratoDao dao = new ContratoDao();
        Boolean res = dao.excluir();
        Assertions.assertEquals(false, res);
    }

    @Test
    public void atualizar() {
    	IContratoDao dao = new ContratoDao();
        String res = dao.atualizar();
        Assertions.assertEquals("Atualizado", res);
    }
	
}
