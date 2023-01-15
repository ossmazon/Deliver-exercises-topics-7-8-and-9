package Six;

public class SixMain {


    private static void DividePorCero(float a, float b) throws ArithmeticException{


        if (b!=0){
            float resultado=a/b;
            System.out.println(resultado);
        }else{
            throw new ArithmeticException ("Esto no se puede hacer");
        }


    }

    public static void main(String[] args) {
        try {
            DividePorCero(100,0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }



    }
}
