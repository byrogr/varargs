package ejemplovarargs;

/**
 *
 * @author Roger Rojas
 */
public class EjemploVarArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printNumbers(10, 15, 20, 25, 30);
        System.out.println("================================================");
        printNumber(10, 15, 20, 25, 30);
        System.out.println("================================================");
        showProfileEmployee("Roger", 29, 2000, 2500, 2300, 2000);
        
    }
    
    public static void printNumbers(int... numeros) {
        int number;
        for (int i = 0; i < numeros.length; i++) {
            number = numeros[i];
            System.out.println("Elemento " + i + ": " + number);
        }
    }
    
    public static void printNumber(int... numeros) {
        for (int number : numeros) {
            System.out.println("Elemento: " + number);
        }
    }
    
    public static void showProfileEmployee(
        String nombre, 
        int edad, 
        int... sueldos) {
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
        double promedio;
        int total = 0;
        for (int sueldo : sueldos) {
            total += sueldo;
        }
        promedio = total * 1.0 / sueldos.length;
        System.out.println("Prom. Sueldo: S/. " + promedio);
    }
}
