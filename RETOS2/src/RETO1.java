 import java.util.Scanner;

public class RETO1 {

        public static void main(String[] args) {
        
        
        String[] palabras = {"freefire","lanza","libro","sistemas","java","celular"};
        String palabra = palabras[(int)(Math.random() * palabras.length)];                                                                                       // Selecciona una palabra al azar del arreglo
        char[] letras = new char[palabra.length()];                                                                                                       // Arreglo para almacenar las letras adivinadas
        int intentos = 6;                                                                                                                               // Número de intentos permitidos




        try (Scanner lectura = new Scanner(System.in)) {
            for (int i = 0; i < letras.length; i++) {
                letras[i] = '_';                       
            }
            

            
            while (intentos > 0) {
                System.out.print("Palabra: ");
                for (int i = 0; i < letras.length; i++) {
                    System.out.print(letras[i] + " ");
                }

                System.out.println("\nIntentos restantes: " + intentos);
                System.out.print("Ingrese una letra: ");

                char letra = lectura.next().charAt(0);

                boolean acierto = false;

                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra) {
                        letras[i] = letra; 
                        acierto = true;
                    }
                }

                if (acierto) {
                    intentos--;
                }
                
                boolean palabraCompleta = true;
                for (int i = 0; i < letras.length; i++) {
                    if (letras[i] == '_') {
                        palabraCompleta = false; 
                    }
                }
                if (palabraCompleta) {
                    System.out.println("Te Felicitamos, acertaste  la palabra!");
                    System.out.println("La palabra era: " + palabra);
                    return; 
                }
            }
            System.out.println("Te equivocaste  La palabra era: " + palabra);
            lectura.close();
        }
    }
 }