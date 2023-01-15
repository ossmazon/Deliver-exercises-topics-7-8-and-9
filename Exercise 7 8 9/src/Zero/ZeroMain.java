package Zero;

public class ZeroMain {

    public static void main(String[] args) {

        String a ="hola como estas";

        for (int i = a.length(); i > 0; i--) {

            System.out.print(a.charAt(i-1));
        }
    }
}
