package br.com.lmarques.service;

import br.com.lmarques.dao.ContratoDao;

public class ContratoService implements IContratoService{

    private ContratoDao contradoDao;

    public ContratoService(ContratoDao contradoDao) {
        this.contradoDao = contradoDao;
    }

    @Override
    public String salvar() {
        contradoDao.salvar();
        return "Salvo";
    }

    @Override
    public Boolean buscar() {
        contradoDao.buscar();
        return true;
    }

    @Override
    public Boolean excluir() {
        contradoDao.excluir();
        return false;
    }

    @Override
    public String atualizar() {
        contradoDao.atualizar();
        return "Atualizado";
    }
}
