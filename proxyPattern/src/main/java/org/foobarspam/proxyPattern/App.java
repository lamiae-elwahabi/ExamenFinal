package org.foobarspam.proxyPattern;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
      	
    	public static void main( String[] args ){
            
    		// Crea una estructura de datos llamada setMrMe donde almacenar los Mr Meeseeks creados
    		ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
    		
    		// Crea una estructura de datos llamada ids donde almacenar los ids de los Mr Meeseeks creados
    		ArrayList<Integer> ids = new ArrayList<Integer>(); 
    		
    		ProxyMrMeeseeks box = new ProxyMrMeeseeks();
    		       
   		    box.pushButton(setMrMe);
    		System.out.println("Open Jerry's stupid mayonnaise jar");
    		box.getMrMe().formulateRequest("Open", "stupid jar");
    		System.out.println();
    		
    		box.pushButton(setMrMe);    
    		System.out.println("I wanna be popular at school!");
    		box.getMrMe().formulateRequest("Be", "popular at school");
    		System.out.println();
    		
    		box.pushButton(setMrMe);
    		System.out.println("I wanna be a more complete woman!");
    		box.getMrMe().formulateRequest("Be", "a more complete woman");
    		System.out.println();
    		
    		System.out.println("Estos son los Mr Meeseeks creados:");
    		listMrMeeseeks(setMrMe);
    		System.out.println();
    		
    		collectIds(setMrMe, ids);
    		
    		System.out.println("Adios, Mr Meeseeks...");
    		for(Integer id : ids){
    			explodeMrMeeseeks(setMrMe, id);   
    		}
    		
      }
	
    		
    	/* explodeMrMeeseeks(setMrMe, id)
    	 * elimna del conjunto de Mr Meeseeks creados el que ya ha completado su cometido
    	 */	

    	private static void explodeMrMeeseeks(ArrayList<MrMeeseeks> setMrMe, Integer id) {
		
			
		}

    	/* listMrMeeseeks(setMrMe)
		 * Lista los ids de todos los Mr Meeseeks creados
		 */

    	public static void listMrMeeseeks(ArrayList<MrMeeseeks> setMrMe) {
    		for (MrMeeseeks mester : setMrMe)
    			System.out.println(mester.getId());
    	}
    	
		/* collectIds(setMrMe, ids)
		 * Almacena en un array los ids de los Mr Meeseeks creados
		 */
    	private static void collectIds(ArrayList<MrMeeseeks> setMrMe, ArrayList<Integer> ids) {
    		for (MrMeeseeks mester: setMrMe)
    			ids.add(mester.getId());
    	}
}

