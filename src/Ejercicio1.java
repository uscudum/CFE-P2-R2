import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String nombreEstudiante;
        double notaEstudiante;
        String continuar;


        do {
            System.out.print("Nombre estudiante: ");
            nombreEstudiante = leer.next();
            System.out.print("Nota del estudiante: ");
            notaEstudiante = leer.nextDouble();

            System.out.println("Nombre: " + nombreEstudiante + " Nota: " + notaEstudiante);

            String resultado = (notaEstudiante >= 70) ? "Aprobado" : "No aprobado";
            System.out.println("Resultado final: " + resultado);

            if (resultado.equals("No aprobado")) {
                System.out.print("Deseas realizar prueba adicional (Si/No): ");
                String respuesta = leer.next();

                if (respuesta.equalsIgnoreCase("Si")) {
                    System.out.print("Nueva nota: ");
                    notaEstudiante = leer.nextDouble();

                    resultado = (notaEstudiante >= 70) ? "Aprobado" : "No aprobado";
                    System.out.println("Resultado final: " + resultado);
                }
            }
            System.out.println("Desea ingresar un nuevo estudiante (Si/No)");
            continuar = leer.next();

        }while(continuar.equalsIgnoreCase("Si"));

    }
}
