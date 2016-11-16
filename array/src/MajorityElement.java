import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 2, 3, 4, 5, 5, 5, 4 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		int temp = 0;
		int majorelement = 0;
		Iterator<?> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> enrty = (Entry<Integer, Integer>) iterator.next();
			if (enrty.getValue() > temp) {
				temp = enrty.getValue();
				majorelement = enrty.getKey();
			}
		}
		System.out.println(temp + ":: " + majorelement);

	}

}
