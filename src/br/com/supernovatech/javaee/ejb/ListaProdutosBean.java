package br.com.supernovatech.javaee.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateful;

@Stateful
@Remote
public class ListaProdutosBean implements ListaProdutosBeanRemote {

	private List<String> itens = new ArrayList<>();
	
	public List<String> getItens() {
		return itens;
	}

	@Override
	public void adicionarItem(String item) {
		itens.add(item);
		imprimirItens();
	}

	@Override
	public void removerItem(String item) {
		itens.remove(item);
		imprimirItens();		
	}

	public void imprimirItens() {
		System.out.println("Itens Cadastrados: " + itens);
	}

}
