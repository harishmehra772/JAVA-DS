package set;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Set<String> barca=new HashSet<>();
		barca.add("Messi");
		barca.add("Dembele");
		barca.add("Griezmann");
		barca.add("Umtiti");
		barca.add("Lenglet");
		barca.add("De Jong");
		Set<String> france=new HashSet<>();
		france.add("Pogba");
		france.add("Mbappe");
		france.add("Dembele");
		france.add("Griezmann");
		france.add("Lenglet");
		france.add("Umtiti");
		barca.retainAll(france);
		barca.addAll(france);
		System.out.println(barca.containsAll(france));
		System.out.println(barca);
	

	}

}
