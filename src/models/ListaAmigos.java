package models;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaAmigos {
	
	private List<Link> amigos;
	
	public ListaAmigos(){}

	public List<Link> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Link> amigos) {
		this.amigos = amigos;
	}
}
