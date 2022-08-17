package models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Resumen {
	
	private Usuario usuario;
	private int encontrados;
	private int tesoros;
	private int amigos;
	private ListaTesoros lista;
	
	public Resumen(){}

	public Resumen(Usuario usuario, int encontrados, int tesoros, int amigos, ListaTesoros lista) {
		super();
		this.usuario = usuario;
		this.encontrados = encontrados;
		this.tesoros = tesoros;
		this.amigos = amigos;
		this.lista = lista;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getEncontrados() {
		return encontrados;
	}

	public void setEncontrados(int encontrados) {
		this.encontrados = encontrados;
	}

	public int getTesoros() {
		return tesoros;
	}

	public void setTesoros(int tesoros) {
		this.tesoros = tesoros;
	}

	public int getAmigos() {
		return amigos;
	}

	public void setAmigos(int amigos) {
		this.amigos = amigos;
	}

	public ListaTesoros getLista() {
		return lista;
	}

	public void setLista(ListaTesoros lista) {
		this.lista = lista;
	}
	
}
