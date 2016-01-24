package br.com.consumerestful.model;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;


public class ConsumerClient {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		
		
		WebTarget target = client.target("http://localhost:8080/Restful/cliente/listarTodos");
		
		String stringJson = target.request(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println(stringJson);
		
		
		
			Gson gson = new Gson();
			
			JSON json = gson.fromJson(stringJson, JSON.class);
			
			
			System.out.println(json);
			
			System.out.println(json.getCliente().getNome());		

	}

}
