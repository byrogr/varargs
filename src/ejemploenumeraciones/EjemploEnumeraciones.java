package ejemploenumeraciones;

import ejemploenum.Continentes;
import ejemploenum.Dias;

/**
 *
 * @author Roger Rojas
 */
public class EjemploEnumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El valor 1: " + Dias.LUNES);
        
        indicarDia(Dias.LUNES);
        
        indicarPaises(Continentes.AFRICA);
        
        imprimirContinentes();
        
    }
    
    public static void indicarDia(Dias dia) {
        switch (dia) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
        }
    }
    
    public static void indicarPaises(Continentes continente) {
        switch (continente) {
            case AFRICA:
                System.out.println("# Paises en: " + continente + 
                        ": " + continente.getPaises());
                break;
        }
    }
    
    public static void imprimirContinentes() {
        for (Continentes c : Continentes.values()) {
            System.out.println("Continente " + c + " contiene " + 
                    c.getPaises() + " paises.");
        }
    }
}
