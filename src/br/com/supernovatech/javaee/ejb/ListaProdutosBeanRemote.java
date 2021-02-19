package br.com.supernovatech.javaee.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ListaProdutosBeanRemote {
	List<String> itens = new ArrayList<>();
	public void adicionarItem(String item);
	public void removerItem(String item);
	public List<String> getItens();
}
