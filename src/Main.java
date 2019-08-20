import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//Initialize Integer List
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);

		//Initialize string List
		ArrayList<String> strings = new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");

		System.out.println("====Integer List====");
		System.out.println("====Integer List====");
		System.out.println("====Integer List====");
		System.out.println("Before...");
		integers.forEach(System.out::println);
		System.out.println("After using static method on integer list...");
		Util.swapElements(integers);
		integers.forEach(System.out::println);
		Util.swapElements(integers);	/*Revert Integer List*/

		System.out.println("====String List====");
		System.out.println("====String List====");
		System.out.println("====String List====");
		System.out.println("Before...");
		strings.forEach(System.out::println);
		System.out.println("After using static method on string list...");
		Util.swapElements(strings);
		strings.forEach(System.out::println);
		Util.swapElements(strings);	/*Revert String List*/

		System.out.println("Using Instance Method");
		GenericsManipulator<Integer> manipulator = new GenericsManipulator<>(integers);
		GenericsManipulator<String> manipulator2 = new GenericsManipulator<>(strings);

		System.out.println("====Integer List====");
		System.out.println("====Integer List====");
		System.out.println("====Integer List====");
		System.out.println("Before...");
		manipulator.getMyList().forEach(System.out::println);
		manipulator.swapElements();
		System.out.println("After using instance method on integer list...");
		manipulator.getMyList().forEach(System.out::println);
		System.out.println("====String List====");
		System.out.println("====String List====");
		System.out.println("====String List====");
		System.out.println("Before...");
		manipulator2.getMyList().forEach(System.out::println);
		manipulator2.swapElements();
		System.out.println("After using instance method on string list...");
		manipulator2.getMyList().forEach(System.out::println);

	}

}
