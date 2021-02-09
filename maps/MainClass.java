package maps;
import java.util.*;
public class MainClass {
	public static void main(String args[])
	{
		Map<String,String> elements=new LinkedHashMap<>();
		elements.put("H","hydrogen");
		elements.put("He","helium");
		elements.put("Li","lithium");
		elements.put("Be","berillium");
		elements.put("b","boron");
		
		elements.put("H","Hydrogen");
		System.out.println(elements);
		System.out.println(elements.values());
		System.out.println(elements);
		
	}

}
