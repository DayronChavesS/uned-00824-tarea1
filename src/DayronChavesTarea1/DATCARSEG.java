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

//Importanción de las librerías necesarias para el código
import java.util.Scanner;


//Declaración de la clase DATCARSEG
public class DATCARSEG 
{
        //Declaración de los atributos del objeto esta clase creara
         String PlacaAutomovil;
         String IdentificacionDueño;
         String Nombre;
         int ModeloAutomovil;
         int MontoAsegurado;
         boolean Discapacitado;
         //Atributos extra necesarios para el correcto funcionamiento del programa
         char AuxiliarDiscapacitado;
         int AñoCreacionAuto;
         int RecargoPorModelo;
         double PrimaMensuaIIncompleta;
         double Descuento;
         double PrimaMensuaICompleta;


        //Método que se encarga de obtener los datos que provee el usuario
        public void obtenerDatos()
        {
            //Habilitar el scanner para poder obtener los datos del usuario
            Scanner Input = new Scanner(System.in);

            
            System.out.print("\n ==INGRESE LA SIGUIENTE INFORMACION== \n\n");
            System.out.print("Digite la Placa del Automovil: ");
            PlacaAutomovil = Input.nextLine();


            System.out.print("Digite la Identificacion del Dueño: ");
            IdentificacionDueño = Input.nextLine();
    

            System.out.print("Digite el Nombre del Dueño: ");
            Nombre = Input.nextLine();
  

                    
                    
                    
            System.out.print("Ingrese el Modelo del Automovil: ");
            //Se maneja la excepción de que no se introduzca un numero en la variable de tipo entera.
            try
            {
                ModeloAutomovil = Input.nextInt();
            }
            catch(java.util.InputMismatchException ex)
            {
               System.out.print("ADVERTENCIA: No has introducido un numero. \n");
               Input.nextLine();
             }


                    
                    
                    
            //Se entra en bucle hasta que el monto sea valido
            do
            {
                System.out.print("Ingrese el Monto Asegurado: ");
                MontoAsegurado = Input.nextInt();

                 //Validación del monto asegurado
                 if ( (MontoAsegurado < 1000000) || (MontoAsegurado > 100000000 ) )
                 {
                    System.out.print("Error: El Monto Asegurado es invalido. \n");
                 }

             }         
             while( (MontoAsegurado < 1000000) || (MontoAsegurado > 100000000 ) );

                     
                     
                    
             System.out.print("¿El dueño es discapacitado? S/N: ");
             AuxiliarDiscapacitado = Input.next().charAt(0);

                    
             if (AuxiliarDiscapacitado == 'S' || AuxiliarDiscapacitado == 's')
             {
                  Discapacitado = true;
             }
             else if (AuxiliarDiscapacitado == 'N' || AuxiliarDiscapacitado == 'n' )
             {
                  Discapacitado = false;
             }
                    
         }

        
        
        
         //Método que calcula el recargo según el modelo del automóvil
         public int calcularRecargo()
         {
             AñoCreacionAuto = 2020 - ModeloAutomovil;

             if ( (AñoCreacionAuto >= 2019) && (AñoCreacionAuto <= 2021) )
             {
                 RecargoPorModelo = 0;
             }
             else if ((AñoCreacionAuto >= 2015) && (AñoCreacionAuto <= 2018))
             {
                 RecargoPorModelo = 25000;
             }
             else if ((AñoCreacionAuto >= 2000) && (AñoCreacionAuto <= 2014))
             {
                 RecargoPorModelo = 35000;
             }
             else if ((AñoCreacionAuto >= 1980) && (AñoCreacionAuto <= 1999))
             {
                 RecargoPorModelo = 45000;
             }
             else if ((AñoCreacionAuto >= 0) && (AñoCreacionAuto <= 1979))
             {
                 RecargoPorModelo = 90000;
             }
             return RecargoPorModelo;
         }
         
         
         
         //Método que calcula la prima con la formula proveída por la tarea
         public double calcularPrima()
         {
             PrimaMensuaIIncompleta = ( ( MontoAsegurado / 4 ) ) + RecargoPorModelo;
             return PrimaMensuaIIncompleta;
         }
         
         
         
         //Método que aplica un descuento si detecta que el dueño del automóvil es discapacitado
         public double aplicarDescuento()
         {
             if (  Discapacitado == true )
             {
                Descuento = ( 0.10 * PrimaMensuaIIncompleta );
                PrimaMensuaICompleta = PrimaMensuaIIncompleta - Descuento ;
             }
             else if ( Discapacitado == false ) 
             {  
                 PrimaMensuaICompleta = PrimaMensuaIIncompleta;
             }
             return PrimaMensuaICompleta;
         }
         
         
         
         //Método que imprime en pantalla los datos del usuario y el calculo de la prima
         public void imprimirDatos ()
         {
                    System.out.print("\n\n ==PRIMA DEL SEGURO DEL AUTOMOVIL== \n\n");
                    System.out.print("Placa: " + PlacaAutomovil + "\n");
                    System.out.print("Identificacion: " + IdentificacionDueño + "\n");
                    System.out.print("Nombre: " +Nombre + "\n");
                    System.out.print("Modelo: " + ModeloAutomovil + "\n");
                    System.out.print("Monto Asegurado: " + MontoAsegurado+ "\n");
                    System.out.print("Discapacitacion: " + AuxiliarDiscapacitado+ "\n");
                    System.out.print("Recargo: "+ RecargoPorModelo +"\n");
                    System.out.print("Descuento: "+ Descuento +"\n");
                    System.out.print("Prima Mensual: "+ PrimaMensuaICompleta +"\n\n");
         }
         
}