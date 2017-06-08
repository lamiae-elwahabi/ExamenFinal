package org.foobarspam.proxyPattern;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

public class MrMeeseeks implements Doable {
	//Propiedades
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	private String[] messageOnRequest;
	private String messageOnDone = " ";
	private String messageOnExplode = " ";
	//Instanciar la clase Random
	Random random = new Random();
	
	//Constructor
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}
	//Getters y Setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	//Metodos 
	public void sayMessageOnCreate(){
		System.out.println("I'm Mr Meeseeks "+ getId() + "."+ " Look at meeee!");
		
		
	}
	public void sayMessageOnRequest(){
		System.out.println(generateMessageOnRequest());
		
	}

		//String[] requestMessage = new String[];
	
	
	public String generateMessageOnRequest() {
	/* elige al azar uno de los tres mensajes
          que lanza Mr Meeseeks cuando se le formula
	 * la peticion:*/
	String [] mensaje = {"Oooh yeah! Can do!", "Yes sireee!", "Oh, yeah! Yes, ma'am!"};
	int numRandom =  ThreadLocalRandom.current().nextInt(mensaje.length);
	//System.out.println( mensaje[numRandon] );
		//return messageOnDone;
     	return mensaje[numRandom];
	}
	public String doRequest(Object accion, Object objeto) {
		return null;
	}
	public void sayMessageOnDone() {
		System.out.println("All done!");
	}
	public void sayMessageOnExplode(){
		
	}
	public void formulateRequest(String first, String second) {
		sayMessageOnRequest();
		System.out.println(doRequest(first, second));
		
		
	}

}


