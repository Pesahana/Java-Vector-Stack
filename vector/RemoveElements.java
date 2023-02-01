package vector;

import java.util.Vector;

class RemoveElements {

	public static void main(String[] args) {
        Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("Initial Vector: " + animals);

        
        String element = animals.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("New Vector: " + animals);

        
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
    }
}
