import java.util.ArrayList;
import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Float> notasAlumnos = new ArrayList<>();
        int opcion;
        do {
            System.out.println("1.Introducir nota al final de la lista");
            System.out.println("2.Consultar la nota de un índice");
            System.out.println("3.Eliminar una nota de un índice");
            System.out.println("4.Modificar la nota de un índice");
            System.out.println("5.Salir");
            do {
                System.out.println("Elige una opción");
                opcion = input.nextInt();
                if (opcion < 1 || opcion > 5) {
                    System.out.println("Opción no válida elige un número del 1 al 5");
                }
            } while (opcion < 1 || opcion > 5);

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la nota: ");
                    float nota = input.nextFloat();
                    notasAlumnos.add(nota);
                    System.out.println("Nota añadida");
                    break;

                case 2:
                    System.out.println("Introduce el índice (1-" + notasAlumnos.size() + "): ");
                    int indiceConsulta = input.nextInt();
                    System.out.println("Nota: " + notasAlumnos.get(indiceConsulta - 1));
                    break;

                case 3:
                    System.out.println("Introduce el índice (1-" + notasAlumnos.size() + "): ");
                    int indiceEliminar = input.nextInt();
                    notasAlumnos.remove(indiceEliminar - 1);
                    System.out.println("Nota eliminada. Lista actual: " + notasAlumnos);
                    break;

                case 4:
                    System.out.println("Introduce el índice (1-" + notasAlumnos.size() + "): ");
                    int indiceModificar = input.nextInt();
                    System.out.println("Introduce la nueva nota");
                    float nuevaNota = input.nextFloat();
                    notasAlumnos.set(indiceModificar - 1, nuevaNota);
                    System.out.println("Nota modificada. Lista actual: " + notasAlumnos);
                    break;

                case 5:
                    System.out.println("Saliendo");
                    break;
            }
        } while (opcion != 5);
    }
}