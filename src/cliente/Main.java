package cliente;
import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import models.ListaTesoros;
import models.Tesoro;
import models.Usuario;


public class Main {
	public static void main(String args[]) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI());
		Response response;
		
		//Añadir usuario
		
		
		Usuario usuario6 = new Usuario(6,"pedro",23,"pedro@gmail.com","Madrid");
		response = target.path("api").path("usuarios").request().accept(MediaType.APPLICATION_JSON).post(Entity.json(usuario6), Response.class);
		System.out.println("Añadir usuario " + response.getStatus());
		
		
		//Consultar los datos de un usuario
		System.out.println("Consultar los datos de un usuario " + target.path("api").path("usuarios").path("1").request().accept(MediaType.APPLICATION_JSON).get(String.class));
		
		//Cambiar los datos de un usuario
		
		Usuario usuario3 = new Usuario(3,"juan", 21, "juan01@gmail.com", "Barcelona");
		response = target.path("api").path("usuarios").path("3").request().accept(MediaType.APPLICATION_JSON).put(Entity.json(usuario3), Response.class);
		System.out.println("Cambiar los datos de un usuario " + response.getStatus());
		
		
		//Borrar un usuario
		
		response = target.path("api").path("usuarios").path("5").request().delete();
		System.out.println("Eliminar un usuario " + response.getStatus());
		
		
		//Obtener todos los usuarios
		System.out.println("Consultar los datos de un usuario " + target.path("api").path("usuarios").request().accept(MediaType.APPLICATION_JSON).get(String.class));
		
		//Añadir tesoro
		
		Tesoro tesoro6 = new Tesoro(6,1, "pequeño", "fácil", "arenoso", "Hacia la luz azul donde apunta el barco", (float)-23.43, (float)98.15, "2001-12-13");
		response = target.path("api").path("usuarios").path("1").path("tesoros").request().accept(MediaType.APPLICATION_JSON).post(Entity.json(tesoro6), Response.class);
		System.out.println("Añadir tesoro " + response.getStatus());
		
		
		//Editar tesoro
		
		Tesoro tesoro3 = new Tesoro(3,1,"grande","dificil", "fangoso", "Donde apunta el sol!", (float)-23, (float)23, "");
		response = target.path("api").path("tesoros").path("3").request().accept(MediaType.APPLICATION_JSON).put(Entity.json(tesoro3), Response.class);
		System.out.println("Cambiar los datos de un tesoro " + response.getStatus());
		
		
		//Consultar los tesoros de un usuario
		System.out.println("Consultar los tesoros de un usuario " + target.path("api").path("usuarios").path("1").path("tesoros").request().accept(MediaType.APPLICATION_JSON).get(String.class));

		//Añadir un tesoro encontrado
		
		Tesoro tesoro4 = new Tesoro(4);
		response = target.path("api").path("usuarios").path("1").path("encontrados").request().accept(MediaType.APPLICATION_JSON).post(Entity.json(tesoro4), Response.class);
		System.out.println("Añadir tesoro encontrado " + response.getStatus());
		
		
		//Consultar tesoros encontrados de un usuario
		System.out.println("Consultar los tesoros encontrados de un usuario " + target.path("api").path("usuarios").path("1").path("encontrados").request().accept(MediaType.APPLICATION_JSON).get(String.class));

		//Usuario añade amigo
		
		Usuario usuario4 = new Usuario(4);
		response = target.path("api").path("usuarios").path("1").path("amigos").request().accept(MediaType.APPLICATION_JSON).post(Entity.json(usuario4), Response.class);
		System.out.println("Usuario agrega amigo " + response.getStatus());
		
		
		//Obtener amigos de un usuario
		System.out.println("Consultar los amigos de un usuario " + target.path("api").path("usuarios").path("1").path("amigos").request().accept(MediaType.APPLICATION_JSON).get(String.class));

		//Eliminar amigo de un usuario
		
		response = target.path("api").path("usuarios").path("2").path("amigos").path("4").request().delete();
		System.out.println("Eliminar un amigo de un usuario " + response.getStatus());
		
		
		//Consultar tesoros más cercanos a unas coordenadas
	
		
		String l = target.path("api").path("tesoros").path("23").path("-23").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println("Consultar tesoros más cercanos a unas coordenadas " + l);
		

		//Consultar resumen de un usuario
		System.out.println("Consultar resumen de un usuario " + target.path("api").path("usuarios").path("1").path("resumen").request().accept(MediaType.APPLICATION_JSON).get(String.class));

	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/RESTProject/").build();
	}
	
	
}