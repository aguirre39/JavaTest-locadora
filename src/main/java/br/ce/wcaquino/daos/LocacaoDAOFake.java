package br.ce.wcaquino.daos;

import java.util.ArrayList;
import java.util.List;

import br.ce.wcaquino.entidades.Locacao;

public class LocacaoDAOFake implements LocacaoDAO {

    @Override
    public void salvar(Locacao locacao) {
        // código para salvar a locação
    }

    @Override
	public List<Locacao> obterLocacoesPendentes() {
    return new ArrayList<>();
	}
}