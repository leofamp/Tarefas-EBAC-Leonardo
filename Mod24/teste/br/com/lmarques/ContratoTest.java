package br.com.lmarques;

import br.com.lmarques.dao.ContratoDao;
import br.com.lmarques.dao.IContratoDao;
import br.com.lmarques.service.ContratoService;
import br.com.lmarques.service.IContratoService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContratoTest {
	
    @Test
    public void salvar() {
        IContratoDAO dao = new ContratoDAO();
        String res = dao.salvar();
        Assertions.assertEquals("Salvo", res);
    }

    @Test
    public void buscar() {
        IContratoDAO dao = new ContratoDAO();
        Boolean res = dao.buscar();
        Assertions.assertEquals(true, res);
    }

    @Test
    public void excluir() {
        IContratoDAO dao = new ContratoDAO();
        Boolean res = dao.excluir();
        Assertions.assertEquals(false, res);
    }

    @Test
    public void atualizar() {
        IContratoDAO dao = new ContratoDAO();
        String res = dao.atualizar();
        Assertions.assertEquals("Atualizado", res);
    }

}
