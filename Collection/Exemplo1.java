package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Exemplo1 {

	public static void main(String[] args) {
		
		String pais1 = "Brasil";
		String pais2 = "Marrocos";
		String pais3 = "Holanda";
		
		ArrayList<String>copa = new ArrayList<>();
		System.out.println(copa);
		copa.add(pais2);
		copa.add(pais3);
		copa.add(pais1);
		copa.add("Argentina");
		System.out.println(copa);
		copa.remove(3);
		System.out.println(copa);
		System.out.println(copa.get(2));
		Collections.sort(copa);
		System.out.println(copa.size());
		System.out.println(copa);
		System.out.println(copa.contains("Argentina"));
		System.out.println(copa.contains("Brasil"));
		copa.clear();
		System.out.println(copa);
	}

}
