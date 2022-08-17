package models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tesoro {
	private int id_tesoro;
	private int id_usuario;
	private String tamano;
	private String dificultad;
	private String tipo_terreno;
	private String pista;
	private float longitud;
	private float latitud;
	private String fecha;
	
	public float getLongitud() {
		return longitud;
	}

	public Tesoro(int id_tesoro, int id_usuario, String tamano, String dificultad, String tipo_terreno, String pista,
			float longitud, float latitud, String fecha) {
		super();
		this.id_tesoro = id_tesoro;
		this.id_usuario = id_usuario;
		this.tamano = tamano;
		this.dificultad = dificultad;
		this.tipo_terreno = tipo_terreno;
		this.pista = pista;
		this.longitud = longitud;
		this.latitud = latitud;
		this.fecha = fecha;
	}
	
	public Tesoro(int id_tesoro) {
		this.id_tesoro=id_tesoro;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Tesoro() {}

	public int getId_tesoro() {
		return id_tesoro;
	}

	public void setId_tesoro(int id_tesoro) {
		this.id_tesoro = id_tesoro;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public String getTipo_terreno() {
		return tipo_terreno;
	}

	public void setTipo_terreno(String tipo_terreno) {
		this.tipo_terreno = tipo_terreno;
	}

	public String getPista() {
		return pista;
	}

	public void setPista(String pista) {
		this.pista = pista;
	}

	@Override
	public String toString() {
		return "Tesoro [id_tesoro=" + id_tesoro + ", id_usuario=" + id_usuario + ", tamano=" + tamano + ", dificultad="
				+ dificultad + ", tipo_terreno=" + tipo_terreno + ", pista=" + pista + ", longitud=" + longitud
				+ ", latitud=" + latitud + ", fecha=" + fecha + "]\n";
	}
	
	
}

