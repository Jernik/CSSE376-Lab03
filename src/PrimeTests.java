import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


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
	@Test
	public void testSix(){
		assertEquals(Arrays.asList(2,3),PrimeFactors.generate(6));
		
	}
	
	@Test
	public void testEight(){
		assertEquals(Arrays.asList(2,2,2),PrimeFactors.generate(8));
		
	}
	
	@Test
	public void testNine(){
		assertEquals(Arrays.asList(3,3),PrimeFactors.generate(9));
		
	}
	
	@Test
	public void testBig(){
		assertEquals(Arrays.asList(5,7,7, 1327),PrimeFactors.generate(325115));
		
	}
	private List<Integer> list() {
		// TODO Auto-generated method stub
		return Arrays.asList();
	}
}
