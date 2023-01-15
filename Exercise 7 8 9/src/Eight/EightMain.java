package Eight;

import java.util.ArrayList;
import java.util.LinkedList;

public class EightMain {

    public static void main(String[] args) {
        ArrayList<String> ArrayNames = new ArrayList<String>();

        ArrayNames.add("Helllo");
        ArrayNames.add("my");
        ArrayNames.add("name");
        ArrayNames.add("is");
        ArrayNames.add("Sergio");

        LinkedList<String> Linkednames=new LinkedList<>();
        Linkednames.addAll(ArrayNames);
        System.out.println("I'm a ArrayList ");
        for (String a:ArrayNames
             ) {
            System.out.print(a+" ");
        }

        System.out.println("\n\nI'm a LinkedList ");
        for (String b:Linkednames
        ) {
            System.out.print(b+" ");
        }
    }
}
