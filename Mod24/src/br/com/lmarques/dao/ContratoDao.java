package br.com.lmarques.dao;

public class ContratoDao implements IContratoDao{

    @Override
    public String salvar() {
        return "Salvo";
    }

    @Override
    public Boolean buscar() {
        return true;
    }

    @Override
    public Boolean excluir() {
        return false;
    }

    @Override
    public String atualizar() {
        return "Atualizado";
        
    }
    
}
