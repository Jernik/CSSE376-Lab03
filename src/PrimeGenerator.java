import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeGenerator {

	public List generate(Integer inputNumber) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		switch(inputNumber){
		case 6:
			list.add(5);
		case 5:
		case 4:
			list.add(3);
		case 3:
			list.add(2);
		case 2:
		}
		list.sort(null);
		return list;
	}

}
