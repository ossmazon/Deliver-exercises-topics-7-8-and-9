package Nine;

import java.io.*;
import java.util.Scanner;

public class NineMain {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");
        String fileIn = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = scanner.nextLine();
        copiar(fileIn, fileOut);


    }

    private static void copiar(String fileIn, String fileOut) throws FileNotFoundException {
        try {
            InputStream in =new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();

        }catch (FileNotFoundException e){
            System.out.println("Exception "+e.getMessage());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
