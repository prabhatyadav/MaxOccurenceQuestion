package techgig;

import java.util.HashSet;
import java.util.Set;

public class setExample {

	public static void main(String[] args) {
		Set set = new HashSet<Object>();
		set.add(new Integer(10));
		set.add(new Long(10));
		for (Object object : set) {
			System.out.println(object);
		}
	}

}
