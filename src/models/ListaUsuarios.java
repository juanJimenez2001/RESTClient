package models;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaUsuarios {
	
	private List<Link> usuarios;
	
	public ListaUsuarios(){}

	public List<Link> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Link> usuarios) {
		this.usuarios = usuarios;
	}


}
