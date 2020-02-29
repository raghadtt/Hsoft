package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.calc;

public class TestCases {

	calc c = new calc();
	
	@Test
    public void testAdd_TwoPositiveInt_positive() {
		int act = c.add(2,3);
		assertTrue(act == 5);
	}

	@Test
   public void testAdd_TwoNegativeInt_negative() {
		int act = c.add(-2,-3);
		assertTrue(act == -5);
	}

	@Test
    public void testAdd_positiveNegativeInt_negative() {
		int act = c.add(2,-3);
		assertTrue(act == -1);
	}
	
	@Test
   public  void testAdd_positiveNegativeInt_positive() {
		int act = c.add(-2,3);
		assertTrue(act == 1);
	}
}
