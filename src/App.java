public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido = Integer.parseInt(System.console().readLine("Introduzca un número entero mayor que 1: "));

        int contador = 0;
        int suma = 0;
        int sol = 3;
        
        while (sol < numeroIntroducido) {
            System.out.print(sol + " ");
            contador++;
            suma += sol; 
            sol += 3;
        }
        System.out.println();

        System.out.printf("Desde 1 hasta %d hay %d múltiplos de 3 y suman %d", numeroIntroducido, contador, suma);
    }   
}
