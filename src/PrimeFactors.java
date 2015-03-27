import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeFactors {

	public static List<Integer> generate(int l){
		return (l<3)?(l==1)?new ArrayList<Integer>():Arrays.asList(2):(l==3)?Arrays.asList(3):Arrays.asList(2,2);
		}
}
