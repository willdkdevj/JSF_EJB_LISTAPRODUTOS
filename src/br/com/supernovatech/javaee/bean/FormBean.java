package br.com.supernovatech.javaee.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.RequestParameterMap;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.supernovatech.javaee.ejb.ListaProdutosBeanRemote;

@Named("bean")
@SessionScoped
public class FormBean implements Serializable{
	
	@Inject
	@RequestParameterMap
	private Map<String, String> params;
	
	@EJB
	private ListaProdutosBeanRemote listaItens;
	
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	public List<String> getItens(){
		return listaItens.getItens();
	}
	
	public void adicionar(AjaxBehaviorEvent evento) {
		listaItens.adicionarItem(item);
		item = null;
	}
	
	public void remover(AjaxBehaviorEvent evento) {
		String removeItem = params.get("removeItem");
		listaItens.removerItem(removeItem);
	}

}
