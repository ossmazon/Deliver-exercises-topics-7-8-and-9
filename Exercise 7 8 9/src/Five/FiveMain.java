package Five;

import java.util.ArrayList;

public class FiveMain {
    public static void main(String[] args) {

        ArrayList<Integer> a =new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            a.add(i);
        }
        for (int i = 0; i <a.size() ; i++) {
            if (a.get(i)%2==0){
                a.remove(i);
            }
        }
        System.out.println(a);

    }
}
