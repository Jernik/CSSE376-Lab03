import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class PrimeTests {

	
	@Test
	public void testOne(){
		assertEquals(list(), PrimeFactors.generate(1));
	}
	
	@Test
	public void testTwo(){
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		assertEquals(a, PrimeFactors.generate(2));
	}
	private List<Integer> list() {
		// TODO Auto-generated method stub
		return Arrays.asList();
	}

}
