package simple;

import static org.junit.Assert.*;

import org.junit.Test;

public class S1test {


	@Test
	public void test() {
		S1 a = new S1();
		double result=300000-30000;
		assertEquals(result,a.add(), 0.000001);
		System.out.println("Sucess");
		System.out.println(result);
	}

}
