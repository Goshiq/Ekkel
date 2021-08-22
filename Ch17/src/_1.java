import jdk.dynalink.linker.LinkerServices;

import java.util.*;

public class _1 {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Russia");
        countries.add("Italy");
        countries.add("Spain");
        countries.add("France");
        System.out.println("Before sorting:\n" + countries);
        Collections.sort(countries);
        System.out.println("After sorting:\n" + countries);
        for (int i = 0; i < 5; ++i) {
            Collections.shuffle(countries);
            System.out.println("After shuffling #" + (i + 1) + ":\n" + countries);
        }
    }
}
