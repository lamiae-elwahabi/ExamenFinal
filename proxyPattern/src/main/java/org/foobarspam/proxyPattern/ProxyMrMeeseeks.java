package org.foobarspam.proxyPattern;

import java.util.ArrayList;

public class ProxyMrMeeseeks {
	//Propiedad
	private MrMeeseeks mrMe;
	
	//Constructor
	public ProxyMrMeeseeks(){
		
	}
	
	//Getter
	public MrMeeseeks getMrMe() {
		return mrMe;
	}
	//Metodos
	public void pushButton(ArrayList<MrMeeseeks> mrMeeseeks) {
		createMrMeeseeks(mrMeeseeks);
	
	}
	public void createMrMeeseeks(ArrayList<MrMeeseeks> mrMeeseeks) {
		mrMe =  new MrMeeseeks();
		mrMeeseeks.add(mrMe);
		mrMe.sayMessageOnCreate();
	}

	


}
