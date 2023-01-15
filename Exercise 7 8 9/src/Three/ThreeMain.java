package Three;

import java.util.Vector;

public class ThreeMain {

    public static void main(String[] args) {

        Vector<String> names= new Vector<String>();

        names.add("Sergio");
        names.add("Daniel");
        names.add("Hugo");
        names.add("Galleta");
        names.add("Gato");
        System.out.println(names.get(1)+" has been eliminated");
        names.remove(1);
        System.out.println(names.get(1)+" has been eliminated");
        names.remove(1);
        System.out.println("The new vector is "+names);


    }
}
