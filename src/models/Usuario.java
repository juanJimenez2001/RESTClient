package models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Usuario {
	private int id_usuario;
	private String nombre;
	private int edad;
	private String correo;
	private String localidad;
	
	public Usuario() {}
	
	public Usuario(int id_usuario) {
		this.id_usuario=id_usuario;
	}
	
	public Usuario(int id_usuario, String nombre, int edad, String correo, String localidad) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.localidad = localidad;
	}


	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
}
