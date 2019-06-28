package techgig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRemove {

	public static void main(String[] args) {
		
		List<String> nam = new ArrayList<String>(Arrays.asList("1", "2", "1", "2"));
		for (int i = 0; i <= nam.size(); i++) {
			nam.remove(i);
		}
		System.out.println(nam.size());
		
	}

}
