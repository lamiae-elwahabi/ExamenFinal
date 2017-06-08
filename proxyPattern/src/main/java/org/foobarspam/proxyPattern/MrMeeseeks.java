package org.foobarspam.proxyPattern;

import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks implements Dorable {
	//Propiedades
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	private String[] messageOnRequest;
	private String messageOnDone = " ";
	private String messageOnExplode = " ";
	
	//Constructor
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}
	//Getters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	//Metodos 
	public void sayMessageOnCreate(){
		
		System.out.println("I'm Mr Meeseeks 1001. Look at meeee!");
		
		
	}
	//public void sayMessageOnRequest(){
		//String[] requestMessage = new String[];
	
	
	/* generateMessageOnRequest()
	 * elige al azar uno de los tres mensajes
         * que lanza Mr Meeseeks cuando se le formula
	 * la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
         */	
}



