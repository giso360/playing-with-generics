import java.util.ArrayList;
import java.util.List;


public class GenericsManipulator<T> {

	private ArrayList<T> myList;

	public GenericsManipulator(ArrayList<T> myList) {
		this.myList = myList;
	}

	public ArrayList<T> getMyList() {
		return myList;
	}

	public void setMyList(ArrayList<T> myList) {
		this.myList = myList;
	}

	public ArrayList<T> swapElements(){
		T t = null;
		if (myList.size() > 1){
			t = myList.get(1);
			myList.remove(t);
			myList.add(1, myList.get(0));
			myList.remove(0);
			myList.add(0, t);
		}
		return myList;
	}


}
