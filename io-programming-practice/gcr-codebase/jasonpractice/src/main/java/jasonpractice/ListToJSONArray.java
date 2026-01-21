package jasonpractice;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.*;

public class ListToJSONArray {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("java");
		list.add("spring");
		list.add("CSS");
		JSONObject job =new JSONObject();
		job.put("name", "Alice");
		JSONArray jarr=new JSONArray();
		for(int i=0;i<list.size();i++) {
			jarr.put(list.get(i));
		}
		System.out.println(job.toString());
		System.out.println(jarr.toString());

	}

}
