import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeGenerator {

	public List generate(Integer inputNumber) {
		ArrayList<Integer> value = new ArrayList<Integer>();
		PrimeFactors pf=new PrimeFactors();
		for (int i =inputNumber-1;i >= 2; i --)
		{
			if (pf.generate(i).size()==1)
				value.add(i);
		}
		value.sort(null);
		return value;

		}
	}
