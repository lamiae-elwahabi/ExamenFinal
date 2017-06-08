package org.foobarspam.proxyPattern;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ProxyMrMeeseeksTest {
	

	private ArrayList<MrMeeseeks> mrMeeseeks;
	ProxyMrMeeseeks box = new ProxyMrMeeseeks() ;
	
	@Before
	public  void setup() {
		mrMeeseeks = new ArrayList();
	}
	@Test
	public void createMrMeeseekstest() {
		box.createMrMeeseeks(mrMeeseeks);
		box.createMrMeeseeks(mrMeeseeks);
		box.createMrMeeseeks(mrMeeseeks);
		box.createMrMeeseeks(mrMeeseeks);
		box.createMrMeeseeks(mrMeeseeks);
		assertTrue(mrMeeseeks.size()==5);
	}

}
