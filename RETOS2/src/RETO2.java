import java.util.Scanner;

public class RETO2 {
    public static void main(String[] args) {
        String nombre, palabra;
        char[] vector;
        int izquierda = 0, derecha;
        Scanner lectura = new Scanner(System.in);
        {
            System.out.println("Ingrese su nombre: ");
            nombre = lectura.nextLine();
            System.out.println("Por favor ingrese la palabra");
            palabra = lectura.next();
          
            vector = palabra.toCharArray();
           
            derecha = vector.length - 1;
            
            while (izquierda < derecha) {
                if (vector[izquierda] == vector[derecha]) {
                    derecha--;
                    izquierda++;
                } else {
                    System.out.println("Estimado usuario:" + nombre + ", la palabra " + palabra + " no es un palindromo");
                    break;
                }
            }
            if (izquierda == derecha) {
                System.out.println("Estimado usuario:" + nombre + ", la palabra " + palabra + " es un palindromo ");
            }
            lectura.close();
        }
    }
}