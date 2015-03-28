import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class PrimeGeneratorTest{
	   private Integer inputNumber;
	   private List<Integer> expectedResult;
	   private PrimeGenerator primeGen;

	   @Before
	   public void initialize() {
	      primeGen = new PrimeGenerator();
	   }

	   // Each parameter should be placed as an argument here
	   // Every time runner triggers, it will pass the arguments
	   // from parameters we defined in primeNumbers() method
	   public PrimeGeneratorTest(Integer inputNumber, 
	      List<Integer> expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }

	   @Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	    	 {1, new ArrayList()},
	    	 { 2, Arrays.asList()},
	         { 3, Arrays.asList(2) },
	         { 4, Arrays.asList(2,3) },
	         { 6, Arrays.asList(2,3,5) },
		   //  { 13, Arrays.asList(2,3,5,7,11) },
	    	 
	      });
	   }

	   // This test will run 4 times since we have 5 parameters defined
	   @Test
	   public void testPrimeNumberChecker() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, 
	      primeGen.generate(inputNumber));
	   }

}
