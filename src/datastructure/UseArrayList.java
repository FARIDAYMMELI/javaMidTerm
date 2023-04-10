package datastructure;
import java.util.ArrayList;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
			ArrayList<String> arrList=new ArrayList<String>();
			arrList.add("Steve");
			arrList.add("Tim");
			arrList.add("Lucy");
			arrList.add("Pat");
			arrList.add("Angela");
			arrList.add("Tom");

			arrList.add(2,"hemal");
			arrList.remove(1);
			System.out.println(arrList);
	

	}

}
