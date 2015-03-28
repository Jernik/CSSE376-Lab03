import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeFactors {

	public static List<Integer> generate(int l){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int j = 2; l > 1;j++) {
			for (; l % j == 0; l /= j) {
				list.add(j);
			}
		}
		return list;
	}
}
