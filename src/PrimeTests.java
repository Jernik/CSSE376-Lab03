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
	
	@Test
	public void testThree(){
		assertEquals(Arrays.asList(3),PrimeFactors.generate(3));
		
	}
	
	@Test
	public void testFour(){
		assertEquals(Arrays.asList(2,2),PrimeFactors.generate(4));
	}
	
	private List<Integer> list() {
		// TODO Auto-generated method stub
		return Arrays.asList();
	}

}
