package org.foobarspam.proxyPattern;

import java.util.ArrayList;

public class ProxyMrMeeseeks extends MrMeeseeks {
	//Propiedad
	private ProxyMrMeeseeks mrMe;
	
	//Constructor
	public ProxyMrMeeseeks(){
		
	}
	
	//Metodos
	public ProxyMrMeeseeks getMrMe() {
		return mrMe;
	}

	public void setMrMe(ProxyMrMeeseeks mrMe) {
		this.mrMe = mrMe;
	}

	public void pushButton(ArrayList<MrMeeseeks> setMrMe) {
		
		
		
		
	
	}
	public void createMrMeeseeks(ArrayList<MrMeeseeks> setMrMe) {
		mrMe = (ProxyMrMeeseeks) new MrMeeseeks();
		mrMe.sayMessageOnCreate();
	}

	public void formulateRequest(String string, String string2) {
		
	}


	}
