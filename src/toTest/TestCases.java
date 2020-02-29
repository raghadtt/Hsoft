package toTest;

import static org.junit.Assert.*;
import org.junit.Test;

import code.calc;

public class TestCases {

	calc c = new calc();
	@Test
	public void test1() {
		int act= c.add(4,2);
		assertTrue (act==6);
	}
	@Test
	public void test2() {
		int act= c.add(4,-2);
		assertTrue (act==2);
	}
	@Test
	public void test3() {
		int act= c.add(-4,2);
		assertTrue (act==-2);
	}

	@Test
	public void test4() {
		int act= c.add(-4,-2);
		assertTrue (act==-6);
	}
}
