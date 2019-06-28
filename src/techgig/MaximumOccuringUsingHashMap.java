package techgig;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaximumOccuringUsingHashMap {
	static String input = "aaaaaaabbbbaaaccccccaaannnnaaaddd";

	// This is not completed Yet
	public static void main(String[] args) {
		char charArray[] = input.toCharArray();
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		char temp = '@';
		int value = 0;
		for (int i = 0; i < charArray.length; i++) {
			hashmap.put(charArray[i] + "axy", value++);

			if (temp != charArray[i]) {
				value = 0;
				hashmap.put(charArray[i] + "axy", value++);
				temp = charArray[i];
			} else {
				hashmap.put(temp + "axy", value++);
			}
			for (Entry entry : hashmap.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}

}
