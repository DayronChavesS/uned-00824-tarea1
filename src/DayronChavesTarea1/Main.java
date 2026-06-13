/*
Universidad Estatal a Distancia de Costa Rica
Sede Turrialba N°27

Escuela de Ciencias Exactas y Naturales

Cátedra de Ingeniería de Software

Programación Intermedia

Código 00824

Tarea #1

Nombre del Estudiante
Dayron Antony Chaves Sandoval


Cedula
305240018


Grupo 3


Profesor Wilfrido Castilla Salas


Fecha de Entrega: 25 de Octubre del año 2020

Tercer Trimestre

Año 2020
 */

package DayronChavesTarea1;

//Importación de las librerías necesarias para el código
import java.util.Scanner;

//Clase Main
public class Main 
{
    //Función Main
    public static void main(String[] args)
    {
        //Variable que almacena la elección del usuario
        char opcion;
        //Habilitar el scanner para poder obtener los datos del usuario
        Scanner Input = new Scanner(System.in);
        
        //Impresión de la información del menu
        System.out.print("==ASEGURADORA SU CARRO FELIZ==\n\n");
        System.out.print("Este programa calculara la prima del seguro del automovil.\n");
        System.out.print("¿Desea ingresar un nuevo automovil?. S/N \n");
        opcion = Input.next().charAt(0);
        
        //Si la elección fue si, se crea el nuevo objeto y se invocan los métodos
        if (opcion == 'S' || opcion == 's')
        {
            DATCARSEG NuevoAutomovil = new DATCARSEG();
            NuevoAutomovil.obtenerDatos();
            NuevoAutomovil.calcularRecargo();
            NuevoAutomovil.calcularPrima();
            NuevoAutomovil.aplicarDescuento();
            NuevoAutomovil.imprimirDatos();
        }
        //De lo contrario, se emite un mensaje y se sale del programa.
         else
        {
            System.out.print("¡Que tenga un buen dia!\n");
        }
        
        System.exit(0);
    }
}

