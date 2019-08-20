import java.util.ArrayList;
import java.util.List;

public class Util {

	public static <T> ArrayList<T> swapElements(ArrayList<T> list){
		T t = null;
		if (list.size() > 1){
			t = list.get(1);
			list.remove(t);
			list.add(1, list.get(0));
			list.remove(0);
			list.add(0, t);
		}
		return list;
	}

}
