package com.upc.problema0;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //validar que todos los campos ingresados

        /*escribir los puntajes de cada equipo y sus barras*/
        /*
         * EQUIPO_MUERTE, EQUIPO_DESTRUCCION, EQUIPO_NUCLEAR
         * */
        int puntaje_EQUIPO_MUERTE = 56;
        int puntaje_barra_EQUIPO_MUERTE = 30;

        int puntaje_EQUIPO_DESTRUCCION = 66;
        int puntaje_barra_EQUIPO_DESTRUCCION = 22;

        int puntaje_EQUIPO_NUCLEAR = 35;
        int puntaje_barra_EQUIPO_NUCLEAR = 28;

        Scanner sc = new Scanner(System.in);
        
        int optSelec;
        do {
            optSelec = MenuAdmin();
            switch (optSelec) {
                case 1:
                    System.out.println("¿Cuantos concursantes quiere ingresar?");
                    int numeroConcursantes = sc.nextInt();
                    for (int i = 1; i <= numeroConcursantes; i++) {
                        System.out.println("Concursante  :" + i);
                        System.out.println("Ingrese nombre :");
                        sc.nextLine();
                        String concursanteNombre = sc.nextLine();
                        System.out.println("Ingrese apellido :");
                        sc.nextLine();
                        String concursanteApellido = sc.nextLine();
                        System.out.println("Ingrese DNI :");
                        sc.nextLine();
                        String concursanteDni = sc.nextLine();
                        System.out.println("Ingrese edad :");
                        sc.nextInt();
                        Integer concursanteEdad = sc.nextInt();
                        System.out.println("Ingrese numero de Mensajes :");
                        sc.nextInt();
                        Integer concursanteNumeroMensaje = sc.nextInt();
                        System.out.println("Ingrese el tipo de concursante :");
                        System.out.println("Opcion 1 : FanMasacre");
                        System.out.println("Opcion 2 : Televidente");
                                    sc.nextInt();
                                    Integer concursanteTipo = sc.nextInt();
                                    switch (concursanteTipo) {
                                        case 1:
                                            //Fan masacre
                                            System.out.println("Ingrese el Equipo que pertenece :");
                                            System.out.println("Opcion 1 : EQUIPO_MUERTE");
                                            System.out.println("Opcion 2 : EQUIPO_DESTRUCCION");
                                            System.out.println("Opcion 3 : EQUIPO_NUCLEAR");
                                            sc.nextInt();
                                            Integer SelecConcursanteEquipo = sc.nextInt();
                                            switch (SelecConcursanteEquipo)
                                            {
                                                case 1:
                                                    Int concursantePuntajeEquipo= puntaje_EQUIPO_MUERTE;
                                                break;
                                                case 2:
                                                    Int concursantePuntajeEquipo= puntaje_EQUIPO_DESTRUCCION;
                                                break;
                                                case 3:
                                                    Int concursantePuntajeEquipo= puntaje_EQUIPO_NUCLEAR;
                                                break;
                                            }
                                            //private Equipo nombre_Equipo;
                                            /*private Integer puntaje_Equipo;
                                            private Integer puntaje_Barra;
                                            * */
                                            break;
                                        case 2:
                                            //Televidente
                                            System.out.println("Ingrese Ingrese la cantidad de llamada realizadas :");
                                            sc.nextInt();
                                            Int concursanteCantidadLlamadas = sc.nextInt();
                                            break;
                                    }

                    }
                    break;
                case 2:
                    /*Menu Principal opcion 2
                    * •	Yo como administrador del sistema debo poder conocer al nombre del concursante ganador y su puntaje.
                    * */

                    break;
                case 3:
                    /*Menu Principal opcion 3
                    * •	Yo como administrador dado un tipo concursantes debo poder obtener un listado de todos los datos
                    * de concursantes incluidos sus puntajes.
                    * */

                    break;
            }
        } while (optSelec > 3);

    }
    public static int MenuAdmin()
    {
        int selection;
        Scanner sc =new Scanner(System.in);
        System.out.println("Seleccione una opcion:");
        System.out.println("-------------------\n");
        System.out.println("1-Registrar Concursante");
        System.out.println("2-Conocer ganador");
        System.out.println("3-Listado de un Tipo de concursantes");
        System.out.println("--------->  :");
        selection=sc.nextInt();
        return selection;
    }
}

//        Scanner sc= new Scanner(System.in);

       /*poder registrar concursantes
       /////////recibir un menaje “El participante tiene que ser mayor de edad” en caso intente
       ingresar a un menor de 18 años.
        * private String dni;
          private String nombre;
          private String apellido;
          private Integer edad;
          private Integer numeroDeMensajes;
          *
          * ****if televidente
          * private Integer numeroDeLlamadas;
          *
        /*
        * if equipo EQUIPO_MUERTE,
        *
        * if EQUIPO_DESTRUCCIÓN,
        *
        * if EQUIPO_NUCLEAR
        * */


        //Conocer al ganador


        //Seleccionar tipo concursante
        ///Dar listado de todos los datos de concursantes incluidos sus puntajes.


