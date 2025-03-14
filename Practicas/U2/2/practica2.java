public class practica2 {
    public static void main(String[] args) {
        byte miByte = 127; 
        short miShort = 32000;
        int miInt = 2147483647; 
        long miLong = 9223372036854775807L; 
        float miFloat = 3.14f; 
        double miDouble = 3.1415926535; 
        char miChar = 'A'; 
        boolean miBooleano = true; 

        String miCadena = "Hola, mundo!";
        
        // Mostrar valores en consola
        System.out.println("Valores de tipos primitivos:");
        System.out.println("byte: " + miByte);
        System.out.println("short: " + miShort);
        System.out.println("int: " + miInt);
        System.out.println("long: " + miLong);
        System.out.println("float: " + miFloat);
        System.out.println("double: " + miDouble);
        System.out.println("char: " + miChar);
        System.out.println("boolean: " + miBooleano);
        
        System.out.println("\nValores de tipos por referencia:");
        System.out.println("String: " + miCadena);
    }
}
