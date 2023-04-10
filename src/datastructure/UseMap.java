package datastructure;

import databases.ConnectToMongoDB;

import java.util.HashMap;
import java.util.Iterator;

public class UseMap {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

			HashMap<Object, Object> map = new HashMap<>();
			map.put(8454, "lamia");
			map.put(4567, "azar");
			map.put(7898, "rahim");

			// Retrieving "Keys" & "Values" using an Iterator
			Iterator<Object> mapIter = map.keySet().iterator();
			Object key;
			while (mapIter.hasNext()) {
				key = mapIter.next();
				System.out.println("KEY: " + key);
				System.out.println("VALUE: " + map.get(key));
			}

			String tableName = "`test_hash_map`";
			ConnectToMongoDB sql = new ConnectToMongoDB();

		}

}
