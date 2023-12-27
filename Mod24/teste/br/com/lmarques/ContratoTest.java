package br.com.lmarques;

import br.com.lmarques.dao.ContratoDao;
import br.com.lmarques.dao.IContratoDao;
import br.com.lmarques.service.ContratoService;
import br.com.lmarques.service.IContratoService;

import org.junit.Assert;
import org.junit.Test;

public class ContratoTest {
	
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
        Assert.assertEquals(true, res);
    }

    @Test
    public void excluir() {
    	IContratoDao dao = new ContratoDao();
        Boolean res = dao.excluir();
        Assert.assertEquals(false, res);
    }

    @Test
    public void atualizar() {
    	IContratoDao dao = new ContratoDao();
        String res = dao.atualizar();
        Assert.assertEquals("Atualizado", res);
    }

}
