/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaalquilere;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Sistemaalquilere {

/**
 * SISTEMA DE CONTROL DE ALQUILERES, PAGOS Y MANTENIMIENTO
 * 
 * Proyecto realizado por:
 * Taniha Abigahil Hernandez Benitez
 * Roxana Nohemi Cabrera Lopez
 *
 * El programa permite administrar:
 * - Apartamentos y locales
 * - Inquilinos
 * - Pagos de renta, agua y energia
 * - Contratos
 * - Mantenimiento
 * - Reportes
 *
 * El programa utiliza arreglos, funciones, ciclos y estructuras
 * de seleccion.
 */
public class SistemaAlquileres {         
    //El static permite utilizar ese Scanner desde los diferentes métodos del programa
     // Scanner utilizado para ingresar informacion
    static Scanner entrada = new Scanner(System.in);

    // Cantidad maxima de registros
    static final int MAX = 100;//

    // ARREGLOS DE INMUEBLES
    static String[] codigo = new String[MAX];
    static String[] tipo = new String[MAX];
    static String[] ubicacion = new String[MAX];
    static String[] inquilino = new String[MAX];
    static double[] alquiler = new double[MAX];
    static String[] estado = new String[MAX];
    
    // ARREGLOS DE INQUILINOS
    static String[] nombreInquilino = new String[MAX];
    static String[] identidad = new String[MAX];
    static String[] telefono = new String[MAX];
    static String[] codigoInmueble = new String[MAX];
    
    // ARREGLOS DE PAGOS
    static double[] pagoRenta = new double[MAX];
    static double[] pagoAgua = new double[MAX];
    static double[] pagoEnergia = new double[MAX];
    static double[] totalPagado = new double[MAX];

    // ARREGLOS DE CONTRATOS
    static String[] fechaInicio = new String[MAX];
    static String[] fechaFinal = new String[MAX];
    static String[] fechaRenovacion = new String[MAX];
    static String[] estadoContrato = new String[MAX];

    // ARREGLOS DE MANTENIMIENTO
    static String[] tipoMantenimiento = new String[MAX];
    static String[] areaMantenimiento = new String[MAX];
    static String[] fechaMantenimiento = new String[MAX];
    static int[] periodicidad = new int[MAX];
    static String[] proximoMantenimiento = new String[MAX];
    static String[] estadoMantenimiento = new String[MAX];

    // Cantidad de registros
    static int cantidadInmuebles = 0;
    static int cantidadInquilinos = 0;
    static int cantidadContratos = 0;
    static int cantidadMantenimientos = 0;
    
    // METODO PRINCIPAL
    public static void main(String[] args) {
        cargarDatosEjemplo();
        menuPrincipal();
    }//Fin de Main 
    public static void menuPrincipal() {
        int opcion;
        do {
            System.out.println("     SISTEMA DE GESTION DE ALQUILERES");
            System.out.println("------------------------------------------");
            System.out.println("1. Apartamentos y Locales");
            System.out.println("2. Inquilinos");
            System.out.println("3. Pagos");
            System.out.println("4. Contratos");
            System.out.println("5. Mantenimiento");
            System.out.println("6. Reportes");
            System.out.println("7. Buscar informacion");
            System.out.println("8. Salir");
            opcion = leerEntero("Seleccione una opcion:\n ");
            switch (opcion) {
                case 1:
                    menuInmuebles();
                    break;
                case 2:
                    menuInquilinos();
                    break;
                case 3:
                    menuPagos();
                    break;
                case 4:
                    menuContratos();
                    break;
                case 5:
                    menuMantenimiento();
                    break;
                case 6:
                    menuReportes();
                    break;
                case 7:
                    menuBusqueda();
                    break;
                case 8:
                    System.out.println("\nGracias por utilizar el sistema.");
                    break;
                default:
                    System.out.println("\nOpcion no valida.");
            }//Fin de Switch
        } while (opcion != 8);
    }//Fin función de menuPrincipal
   public static void menuInmuebles() {
        int opcion;
        do {
            System.out.println("  \n MODULO DE APARTAMENTOS Y LOCALES");
            System.out.println("------------------------------------------");
            System.out.println("1. Registrar inmueble");
            System.out.println("2. Mostrar todos los inmuebles");
            System.out.println("3. Buscar inmueble por codigo");
            System.out.println("4. Modificar inmueble");
            System.out.println("5. Actualizar estado");
            System.out.println("6. Mostrar inmuebles disponibles");
            System.out.println("7. Mostrar apartamentos");
            System.out.println("8. Mostrar locales");
            System.out.println("9. Regresar");
            opcion = leerEntero("Seleccione una opcion: \n");
            switch (opcion) {
                case 1:
                    registrarInmueble();
                    break;
                case 2:
                    mostrarInmuebles();
                    break;
                case 3:
                    buscarInmueble();
                    break;
                case 4:
                    modificarInmueble();
                    break;
                case 5:
                    actualizarEstado();
                    break;
                case 6:
                    mostrarDisponibles();
                    break;
                case 7:
                    mostrarApartamentos();
                    break;
                case 8:
                    mostrarLocales();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 9);
    }//Fin función de menuInmuebles
    public static void registrarInmueble() {
        if (cantidadInmuebles >= MAX) {
            System.out.println("No hay espacio para mas inmuebles.");
            return;
        }
        System.out.println("        \n REGISTRAR INMUEBLE");
        System.out.println("------------------------------------------");
        String nuevoCodigo = leerTexto("Ingrese el codigo del inmueble: ");
        if (buscarIndiceInmueble(nuevoCodigo) != -1) {
            System.out.println("El codigo ya se encuentra registrado.");
            return;
        }
        codigo[cantidadInmuebles] = nuevoCodigo;
        tipo[cantidadInmuebles] = leerTexto("Ingrese el tipo (Apartamento/Local): ");
        ubicacion[cantidadInmuebles] = leerTexto("Ingrese la ubicacion: ");
        inquilino[cantidadInmuebles] = leerTexto("Ingrese el nombre del inquilino: ");
        alquiler[cantidadInmuebles] = leerDouble("Ingrese el monto mensual del alquiler: ");
        estado[cantidadInmuebles] = leerTexto("Ingrese el estado (Ocupado/Disponible): ");
        cantidadInmuebles++;
        System.out.println("\nInmueble registrado correctamente.");
    }//Fin función de registrarInmueble
    public static void mostrarInmuebles() {
        System.out.println("   \n    LISTADO DE INMUEBLES");
        System.out.println("------------------------------------------");
        if (cantidadInmuebles == 0) {
            System.out.println("No hay inmuebles registrados.");
            return;
        }
        for (int i = 0; i < cantidadInmuebles; i++) {
            System.out.println("\nInmueble #" + (i + 1));
            System.out.println("Codigo: " + codigo[i]);
            System.out.println("Tipo: " + tipo[i]);
            System.out.println("Ubicacion: " + ubicacion[i]);
            System.out.println("Inquilino: " + inquilino[i]);
            System.out.println("Alquiler: L " + alquiler[i]);
            System.out.println("Estado: " + estado[i]);
        }
    }//Fin función de mostrarInmuebles
    public static void buscarInmueble() {
        String buscar = leerTexto("\nIngrese el codigo del inmueble: ");
        int posicion = buscarIndiceInmueble(buscar);
        if (posicion == -1) {
            System.out.println("No se encontro el inmueble.");
        } else {
            mostrarInformacionInmueble(posicion);
        }
    }//Fin función de buscarInmueble
    public static void mostrarInformacionInmueble(int posicion) {
        System.out.println("  \n INFORMACION DEL INMUEBLE");
        System.out.println("------------------------------------------");
        System.out.println("Codigo: " + codigo[posicion]);
        System.out.println("Tipo: " + tipo[posicion]);
        System.out.println("Ubicacion: " + ubicacion[posicion]);
        System.out.println("Inquilino: " + inquilino[posicion]);
        System.out.println("Alquiler mensual: L " + alquiler[posicion]);
        System.out.println("Estado: " + estado[posicion]);
    }//Fin función de mostrarInformacionInmueble
    public static void modificarInmueble() {
        String buscar = leerTexto("\nIngrese el codigo del inmueble a modificar: ");
        int posicion = buscarIndiceInmueble(buscar);
        if (posicion == -1) {
            System.out.println("Inmueble no encontrado.");
            return;
        }
        System.out.println("\nDatos actuales:");
        mostrarInformacionInmueble(posicion);
        System.out.println("\nIngrese los nuevos datos.");
        ubicacion[posicion] = leerTexto("Nueva ubicacion: ");
        inquilino[posicion] = leerTexto("Nuevo inquilino: ");
        alquiler[posicion] = leerDouble("Nuevo alquiler: ");
        estado[posicion] = leerTexto( "Nuevo estado: ");
        System.out.println("\nInformacion modificada correctamente.");
    }//Fin función de modificarInmueble
    public static void actualizarEstado() {
        String buscar = leerTexto("\nIngrese el codigo del inmueble: ");
        int posicion = buscarIndiceInmueble(buscar);
        if (posicion == -1) {
            System.out.println("Inmueble no encontrado.");
        } else {
            System.out.println("Estado actual: " + estado[posicion]);
            String nuevoEstado = leerTexto("Ingrese el nuevo estado (Ocupado/Disponible): ");
            estado[posicion] = nuevoEstado;
            if (nuevoEstado.equalsIgnoreCase("Disponible")) {
                inquilino[posicion] = "Sin inquilino";
            }
            System.out.println("Estado actualizado correctamente.");
        }
    }//Fin de función actualizarEstado
    public static void mostrarDisponibles() {
        boolean encontrado = false;
        System.out.println("     \n  INMUEBLES DISPONIBLES");
        System.out.println("------------------------------------------");
        for (int i = 0; i < cantidadInmuebles; i++) {
            if (estado[i].equalsIgnoreCase("Disponible")) {
                System.out.println("Codigo: " + codigo[i]);
                System.out.println("Tipo: " + tipo[i]);
                System.out.println("Ubicacion: " + ubicacion[i]);
                System.out.println("Alquiler: L " + alquiler[i]);
                encontrado = true;
            }
        }//Fin Función For
        if (!encontrado) {
            System.out.println("No hay inmuebles disponibles.");
        }
    }//Fin de función mostrarDisponibles
    public static void mostrarApartamentos() {
        boolean encontrado = false;
        System.out.println("  \n     APARTAMENTOS");
        System.out.println("------------------------------------------");
        for (int i = 0; i < cantidadInmuebles; i++) {
            if (tipo[i].equalsIgnoreCase("Apartamento")) {
                mostrarInformacionInmueble(i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay apartamentos registrados.");
        }
    }//Fin de función mostrarApartamentos
    public static void mostrarLocales() {
        boolean encontrado = false;
        System.out.println("       \n LOCALES");
        System.out.println("------------------------------------------");
        for (int i = 0; i < cantidadInmuebles; i++) {
            if (tipo[i].equalsIgnoreCase("Local")) {
                mostrarInformacionInmueble(i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay locales registrados.");
        }
    }//Fin función de mostrarLocales
    public static void menuInquilinos() {
        int opcion;
        do {
            System.out.println("     \n     MODULO DE INQUILINOS");
            System.out.println("------------------------------------------");
            System.out.println("1. Registrar inquilino");
            System.out.println("2. Mostrar inquilinos");
            System.out.println("3. Buscar inquilino");
            System.out.println("4. Modificar inquilino");
            System.out.println("5. Regresar");
            opcion = leerEntero("Seleccione una opcion: \n");
            switch (opcion) {
                case 1:
                    registrarInquilino();
                    break;
                case 2:
                    mostrarInquilinos();
                    break;
                case 3:
                    buscarInquilino();
                    break;
                case 4:
                    modificarInquilino();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);
    }//Fin función de menuInquilinos
    public static void registrarInquilino() {
        if (cantidadInquilinos >= MAX) {
            System.out.println("No hay espacio para mas inquilinos.");
            return;
        }
        System.out.println(" \n         REGISTRAR INQUILINO");
        System.out.println("-----------------------------------------");
        nombreInquilino[cantidadInquilinos] = leerTexto("Nombre completo: ");
        identidad[cantidadInquilinos] = leerTexto("Numero de identidad: ");
        telefono[cantidadInquilinos] = leerTexto("Numero de telefono: ");
        codigoInmueble[cantidadInquilinos] = leerTexto("Codigo del inmueble: ");
        cantidadInquilinos++;
        System.out.println("Inquilino registrado correctamente.");
    }//Fin función de registrarInquilino
    public static void mostrarInquilinos() {
        if (cantidadInquilinos == 0) {
            System.out.println("No hay inquilinos registrados.");
            return;
        }
        System.out.println("   \n       LISTADO DE INQUILINOS");
        System.out.println("------------------------------------------");
        for (int i = 0; i < cantidadInquilinos; i++) {
            System.out.println("\nInquilino #" + (i + 1));
            System.out.println("Nombre: " + nombreInquilino[i]);
            System.out.println("Identidad: " + identidad[i]);
            System.out.println("Telefono: " + telefono[i]);
            System.out.println("Inmueble: " + codigoInmueble[i]);
        }
    }//Fin función de ostrarInquilinos
    public static void buscarInquilino() {
        String buscar = leerTexto("\nIngrese la identidad del inquilino: ");
        int posicion = buscarIndiceInquilino(buscar);
        if (posicion == -1) {
            System.out.println("Inquilino no encontrado.");
        } else {
            System.out.println("\nNombre: " + nombreInquilino[posicion]);
            System.out.println("Identidad: " + identidad[posicion]);
            System.out.println("Telefono: " + telefono[posicion]);
            System.out.println("Inmueble: " + codigoInmueble[posicion]);
        }//Fin función else 
    }//Fin función de buscarInquilino
    public static void modificarInquilino() {
        String buscar = leerTexto("\nIngrese la identidad del inquilino: ");
        int posicion = buscarIndiceInquilino(buscar);
        if (posicion == -1) {
            System.out.println("Inquilino no encontrado.");
            return;
        }
        nombreInquilino[posicion] = leerTexto("Nuevo nombre: ");
        telefono[posicion] =  leerTexto("Nuevo telefono: ");
        codigoInmueble[posicion] =leerTexto("Nuevo codigo de inmueble: ");
        System.out.println("Inquilino modificado correctamente.");
    }//Fin función de modificarInquilino
    public static void menuPagos() {
       int opcion;
        do {
            System.out.println("      \n  MODULO DE PAGOS");
            System.out.println("------------------------------------------");
            System.out.println("1. Registrar pago");
            System.out.println("2. Mostrar pagos");
            System.out.println("3. Consultar pago por inmueble");
            System.out.println("4. Calcular total pendiente");
            System.out.println("5. Regresar");
            opcion = leerEntero("Seleccione una opcion: \n");
            switch (opcion) {
                case 1:
                    registrarPago();
                    break;
                case 2:
                    mostrarPagos();
                    break;
                case 3:
                    consultarPago();
                    break;
                case 4:
                    calcularPendientes();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);
    }//Fin función de menuPagos
    public static void registrarPago() {
        String buscar = leerTexto("\nIngrese el codigo del inmueble: ");
        int posicion = buscarIndiceInmueble(buscar);
        if (posicion == -1) {
            System.out.println("Inmueble no encontrado.");
            return;
        }
        System.out.println("\nRenta mensual: L " + alquiler[posicion]);
        double renta = leerDouble("Pago de renta: ");
        double agua = leerDouble("Pago de agua: ");
        double energia = leerDouble("Pago de energia electrica: ");
        pagoRenta[posicion] = renta;
        pagoAgua[posicion] = agua;
        pagoEnergia[posicion] = energia;
        totalPagado[posicion] = renta + agua + energia;
        double total = alquiler[posicion] + agua + energia;
        System.out.println("    \n   RESUMEN DEL PAGO");
        System.out.println("------------------------------------------");
        System.out.println("Renta: L " + alquiler[posicion]);
        System.out.println("Agua: L " + agua);
        System.out.println("Energia: L " + energia);
        System.out.println("Total a pagar: L " + total);
        System.out.println("Total pagado: L " + totalPagado[posicion]);
        if (totalPagado[posicion] >= total) {
            System.out.println("Estado: PAGO COMPLETO");
        } else {
            double pendiente = total - totalPagado[posicion];
            System.out.println("Estado: PENDIENTE");
            System.out.println("Saldo pendiente: L " + pendiente);
        }
    }//Fin función de registrarPago
    public static void mostrarPagos() {
        boolean hayPagos = false;
        System.out.println("    \n   HISTORIAL DE PAGOS");
        System.out.println("------------------------------------------");
        for (int i = 0; i < cantidadInmuebles; i++) {
            if (totalPagado[i] > 0) {
                hayPagos = true;
                double total = alquiler[i] + pagoAgua[i] + pagoEnergia[i];
                System.out.println("\nInmueble: " + codigo[i]);
                System.out.println("Inquilino: " + inquilino[i]);
                System.out.println("Renta: L " + alquiler[i]);
                System.out.println("Agua: L " + pagoAgua[i]);
                System.out.println("Energia: L " + pagoEnergia[i]);
                System.out.println("Total: L " + total);
                System.out.println("Pagado: L " + totalPagado[i]);
                if (totalPagado[i] >= total) {
                    System.out.println("Estado: Completo");
                } else {
                    System.out.println("Estado: Pendiente");
                }
            }
        }//Fin de ciclo For 
        if (!hayPagos) {
            System.out.println("No hay pagos registrados.");
        }
    }//Fin función de mostrarPagos
    public static void consultarPago() {
        String buscar = leerTexto("\nIngrese el codigo del inmueble: ");
        int posicion = buscarIndiceInmueble(buscar);
        if (posicion == -1) {
            System.out.println("Inmueble no encontrado.");
            return;
        }
        double total = alquiler[posicion] + pagoAgua[posicion] + pagoEnergia[posicion];
        System.out.println(" \n      INFORMACION DE PAGO");
        System.out.println("------------------------------------------");
        System.out.println("Inmueble: " + codigo[posicion]);
        System.out.println("Renta: L " + alquiler[posicion]);
        System.out.println("Agua: L " + pagoAgua[posicion]);
        System.out.println("Energia: L " + pagoEnergia[posicion]);
        System.out.println("Total a pagar: L " + total);
        System.out.println("Total pagado: L " + totalPagado[posicion]);
        if (totalPagado[posicion] >= total) {
            System.out.println("Estado: COMPLETO");
        } else {
            System.out.println("Saldo pendiente: L " + (total - totalPagado[posicion]));
        }
    }//Fin función de consultarPago
    public static void calcularPendientes() {
        double totalPendiente = 0;
        for (int i = 0; i < cantidadInmuebles; i++) {
            double total = alquiler[i] + pagoAgua[i] + pagoEnergia[i];
            if (total > totalPagado[i]) {
                totalPendiente += total - totalPagado[i];
            }
        }
        System.out.println("  \n  TOTAL PENDIENTE");
        System.out.println("------------------------------------------");
        System.out.println("Monto total pendiente: L " + totalPendiente);
    }//Fin función de calcularPendientes
    public static void menuContratos() {
        int opcion;
        do {
            System.out.println("  \n  MODULO DE CONTRATOS");
            System.out.println("------------------------------------------");
            System.out.println("1. Registrar contrato");
            System.out.println("2. Mostrar contratos");
            System.out.println("3. Buscar contrato");
            System.out.println("4. Contratos proximos a renovar");
            System.out.println("5. Regresar");
            opcion = leerEntero("Seleccione una opcion: \n");
            switch (opcion) {
                case 1:
                    registrarContrato();
                    break;
                case 2:
                    mostrarContratos();
                    break;
                case 3:
                    buscarContrato();
                    break;
                case 4:
                    contratosPorRenovar();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);
    }//Fin función de menuContratos
    public static void registrarContrato() {
        if (cantidadContratos >= MAX) {
            System.out.println("No hay espacio.");
            return;
        }
        System.out.println("  \n    REGISTRAR CONTRATO");
        System.out.println("------------------------------------------");
        String codigoBuscar = leerTexto("Codigo del inmueble: ");
        int inmueble = buscarIndiceInmueble(codigoBuscar);
        if (inmueble == -1) {
            System.out.println("El inmueble no existe.");
            return;
        }
        fechaInicio[cantidadContratos] =leerTexto("Fecha de inicio: ");
        fechaFinal[cantidadContratos] = leerTexto("Fecha de finalizacion: ");
        fechaRenovacion[cantidadContratos] = leerTexto("Fecha de renovacion: ");
        estadoContrato[cantidadContratos] = leerTexto("Estado del contrato: ");
        cantidadContratos++;
        System.out.println("Contrato registrado correctamente.");
    }//Fin función de registrarContrato
    public static void mostrarContratos() {
        if (cantidadContratos == 0) {
            System.out.println("No hay contratos registrados.");
            return;
        }
        System.out.println("  \n    LISTADO DE CONTRATOS");
        System.out.println("------------------------------------------");
        for (int i = 0; i < cantidadContratos; i++) {
            System.out.println("\nContrato #" + (i + 1));
            System.out.println("Fecha inicio: " + fechaInicio[i]);
            System.out.println("Fecha final: " + fechaFinal[i]);
            System.out.println("Fecha renovacion: " + fechaRenovacion[i]);
            System.out.println("Estado: " + estadoContrato[i]);
        }
    }//Fin función de mostrarContratos
    public static void buscarContrato() {
            String fecha = leerTexto("\nIngrese la fecha de inicio del contrato: ");
        boolean encontrado = false;
        for (int i = 0; i < cantidadContratos; i++) {
            if (fechaInicio[i].equalsIgnoreCase(fecha)) {
                System.out.println("\nContrato encontrado.");
                System.out.println("Fecha inicio: " + fechaInicio[i]);
                System.out.println("Fecha final: " + fechaFinal[i]);
                System.out.println("Renovacion: " + fechaRenovacion[i]);
                System.out.println("Estado: " + estadoContrato[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contrato no encontrado.");
        }
    }//Fin función de buscarContrato
    public static void contratosPorRenovar() {
        boolean encontrado = false;
        System.out.println("  \n   CONTRATOS POR RENOVAR");
        System.out.println("------------------------------------------");
        for (int i = 0; i < cantidadContratos; i++) {
            if (estadoContrato[i].equalsIgnoreCase("Por renovar")|| estadoContrato[i].equalsIgnoreCase("Proximo")) {
                System.out.println("\nContrato #" + (i + 1));
                System.out.println("Inicio: " + fechaInicio[i]);
                System.out.println("Final: " + fechaFinal[i]);
                System.out.println("Renovacion: " + fechaRenovacion[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay contratos proximos a renovar.");
        }
    }//Fin función de contratosPorRenovar
    public static void menuMantenimiento() {
        int opcion;
        do {
            System.out.println("  \n   MODULO DE MANTENIMIENTO");
            System.out.println("------------------------------------------");
            System.out.println("1. Registrar mantenimiento");
            System.out.println("2. Mostrar mantenimientos");
            System.out.println("3. Buscar mantenimiento");
            System.out.println("4. Mantenimientos proximos");
            System.out.println("5. Regresar");
            opcion = leerEntero("Seleccione una opcion: \n");
            switch (opcion) {
                case 1:
                    registrarMantenimiento();
                    break;
                case 2:
                    mostrarMantenimientos();
                    break;
                case 3:
                    buscarMantenimiento();
                    break;
                case 4:
                    mantenimientosProximos();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);
    }//Fin función de menuMantenimiento
    public static void registrarMantenimiento() {
        if (cantidadMantenimientos >= MAX) {
            System.out.println("No hay espacio para mas registros.");
            return;
        }
        System.out.println("  \n   REGISTRAR MANTENIMIENTO");
        System.out.println("------------------------------------------");
        tipoMantenimiento[cantidadMantenimientos] = leerTexto("Tipo de mantenimiento: ");
        areaMantenimiento[cantidadMantenimientos] = leerTexto("Inmueble o area: ");
        fechaMantenimiento[cantidadMantenimientos] = leerTexto("Fecha del ultimo mantenimiento: ");
        periodicidad[cantidadMantenimientos] = leerEntero("Periodicidad en meses: ");
        proximoMantenimiento[cantidadMantenimientos] = leerTexto("Fecha del proximo mantenimiento: ");
        estadoMantenimiento[cantidadMantenimientos] = leerTexto("Estado del mantenimiento: ");
        cantidadMantenimientos++;
        System.out.println("Mantenimiento registrado correctamente.");
    }//Fin funcion de registrarMantenimiento
    public static void mostrarMantenimientos() {
        if (cantidadMantenimientos == 0) {
            System.out.println("No hay mantenimientos registrados.");
            return;
        }
        System.out.println("  \n    HISTORIAL DE MANTENIMIENTO");
        System.out.println("------------------------------------------");
        for (int i = 0; i < cantidadMantenimientos; i++) {
            System.out.println("\nMantenimiento #" + (i + 1));
            System.out.println("Tipo: " + tipoMantenimiento[i]);
            System.out.println("Area: " + areaMantenimiento[i]);
            System.out.println("Ultima fecha: " + fechaMantenimiento[i]);
            System.out.println("Periodicidad: " + periodicidad[i] + " meses");
            System.out.println("Proximo: "+ proximoMantenimiento[i]);
            System.out.println("Estado: "+ estadoMantenimiento[i]);
        }
    }//Fin función de mostrarMantenimientos
    public static void buscarMantenimiento() {
        String area = leerTexto("\nIngrese el inmueble o area: ");
        boolean encontrado = false;
        for (int i = 0; i < cantidadMantenimientos; i++) {
            if (areaMantenimiento[i].equalsIgnoreCase(area)) {
                System.out.println("\nMantenimiento encontrado.");
                System.out.println("Tipo: "+ tipoMantenimiento[i]);
                System.out.println("Area: " + areaMantenimiento[i]);
                System.out.println("Ultima fecha: "+ fechaMantenimiento[i]);
                System.out.println("Periodicidad: " + periodicidad[i]);
                System.out.println("Proximo: "+ proximoMantenimiento[i]);
                System.out.println("Estado: "+ estadoMantenimiento[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro mantenimiento.");
        }
    }//Fin función de buscarMantenimiento
    public static void mantenimientosProximos() {
        boolean encontrado = false;
        System.out.println(" \n  MANTENIMIENTOS PROXIMOS");
        System.out.println("------------------------------------------");
        for (int i = 0; i < cantidadMantenimientos; i++) {
            if (estadoMantenimiento[i].equalsIgnoreCase("Proximo")|| estadoMantenimiento[i].equalsIgnoreCase("Pendiente")) {
                System.out.println("\nArea: " + areaMantenimiento[i]);
                System.out.println("Tipo: " + tipoMantenimiento[i]);
                System.out.println("Proximo mantenimiento: " + proximoMantenimiento[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay mantenimientos proximos.");
        }
    }//Fin función de mantenimientosProximos
    public static void menuReportes() {
        int opcion;
        do {
            System.out.println("  \n   REPORTES");
            System.out.println("-----------------------------------");
            System.out.println("1. Resumen de inmuebles");
            System.out.println("2. Resumen de ingresos");
            System.out.println("3. Pagos pendientes");
            System.out.println("4. Resumen de contratos");
            System.out.println("5. Resumen de mantenimiento");
            System.out.println("6. Reporte general");
            System.out.println("7. Regresar");
            opcion = leerEntero("Seleccione una opcion: \n");
            switch (opcion) {
                case 1:
                    reporteInmuebles();
                    break;
                case 2:
                    reporteIngresos();
                    break;
                case 3:
                    reportePendientes();
                    break;
                case 4:
                    reporteContratos();
                    break;
                case 5:
                    reporteMantenimiento();
                    break;
                case 6:
                    reporteGeneral();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
    }
    public static void reporteInmuebles() {
        int apartamentos = 0;
        int locales = 0;
        int ocupados = 0;
        int disponibles = 0;
        for (int i = 0; i < cantidadInmuebles; i++) {
            if (tipo[i].equalsIgnoreCase("Apartamento")) {
                apartamentos++;
            } else if (tipo[i].equalsIgnoreCase("Local")) {
                locales++;
            }
            if (estado[i].equalsIgnoreCase("Ocupado")) {
                ocupados++;
            } else if (estado[i].equalsIgnoreCase("Disponible")) {
                disponibles++;
            }
        }//Fin función de menuReportes
        System.out.println("  \n  REPORTE DE INMUEBLES");
        System.out.println("------------------------------------------");
        System.out.println("Total de inmuebles: " + cantidadInmuebles);
        System.out.println("Apartamentos: " + apartamentos);
        System.out.println("Locales: " + locales);
        System.out.println("Ocupados: " + ocupados);
        System.out.println("Disponibles: " + disponibles);
    }
    public static void reporteIngresos() {
        double ingresos = 0;
        for (int i = 0; i < cantidadInmuebles; i++) {
            ingresos += totalPagado[i];
        }
        System.out.println("   \n    REPORTE DE INGRESOS");
        System.out.println("------------------------------------------");
        System.out.println("Total recaudado: L " + ingresos);
    }//Fin función de reporteIngresos
    public static void reportePendientes() {
        boolean encontrado = false;
        System.out.println("   \n   PAGOS PENDIENTES");
        System.out.println("------------------------------------------");
        for (int i = 0; i < cantidadInmuebles; i++) {
            double total = alquiler[i] + pagoAgua[i] + pagoEnergia[i];
            double pendiente = total - totalPagado[i];
            if (pendiente > 0) {
                System.out.println("\nInmueble: " + codigo[i]);
                System.out.println("Inquilino: " + inquilino[i]);
                System.out.println("Pendiente: L " + pendiente);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existen pagos pendientes.");
        }
    }//Fin función de reportePendientes
    public static void reporteContratos() {
        int activos = 0;
        int proximos = 0;
        for (int i = 0; i < cantidadContratos; i++) {
            if (estadoContrato[i].equalsIgnoreCase("Activo")) {
                activos++;
            } else if (estadoContrato[i].equalsIgnoreCase("Por renovar")|| estadoContrato[i].equalsIgnoreCase("Proximo")) {
                proximos++;
            }
        }
        System.out.println(" \n    REPORTE DE CONTRATOS");
        System.out.println("------------------------------------------");
        System.out.println("Total de contratos: "  + cantidadContratos);
        System.out.println("Contratos activos: "  + activos);
        System.out.println("Proximos a renovar: " + proximos);
    }//Fin función de reporteContratos
    public static void reporteMantenimiento() {
        int realizados = 0;
        int pendientes = 0;
        for (int i = 0; i < cantidadMantenimientos; i++) {
            if (estadoMantenimiento[i].equalsIgnoreCase("Realizado")) {
                realizados++;
            } else if (estadoMantenimiento[i].equalsIgnoreCase("Pendiente")|| estadoMantenimiento[i].equalsIgnoreCase("Proximo")) {
                pendientes++;
            }
        }
        System.out.println("  \n     REPORTE DE MANTENIMIENTO");
        System.out.println("------------------------------------------");
        System.out.println("Total de mantenimientos: "+ cantidadMantenimientos);
        System.out.println("Realizados: " + realizados);
        System.out.println("Pendientes/proximos: " + pendientes);
    }//Fin función de reporteMantenimiento
    public static void reporteGeneral() {
        System.out.println("  \n   REPORTE GENERAL");
        System.out.println("------------------------------------------");
        System.out.println("\nINMUEBLES");
        System.out.println("Total: " + cantidadInmuebles);
        System.out.println("\nINQUILINOS");
        System.out.println("Total: " + cantidadInquilinos);
        System.out.println("\nCONTRATOS");
        System.out.println("Total: " + cantidadContratos);
        System.out.println("\nMANTENIMIENTOS");
        System.out.println("Total: "+ cantidadMantenimientos);
        double ingresos = 0;
        double pendientes = 0;
        for (int i = 0; i < cantidadInmuebles; i++) {
            ingresos += totalPagado[i];
            double total = alquiler[i]+ pagoAgua[i]+ pagoEnergia[i];
            if (total > totalPagado[i]) {
                pendientes += total - totalPagado[i];
            }
        }
        System.out.println("\nINGRESOS");
        System.out.println("Recaudado: L " + ingresos);
        System.out.println("Pendiente: L " + pendientes);
    }//Fin función de reporteGeneral
    public static void menuBusqueda() {
        int opcion;
        do {
            System.out.println("   \n   BUSQUEDA DE INFORMACION");
            System.out.println("------------------------------------------");
            System.out.println("1. Buscar inmueble");
            System.out.println("2. Buscar inquilino");
            System.out.println("3. Buscar contrato");
            System.out.println("4. Buscar mantenimiento");
            System.out.println("5. Regresar");
            opcion = leerEntero("Seleccione una opcion: \n");
            switch (opcion) {
                case 1:
                    buscarInmueble();
                    break;
                case 2:
                    buscarInquilino();
                    break;
                case 3:
                    buscarContrato();
                    break;
                case 4:
                    buscarMantenimiento();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }//Fin de Switch
        } while (opcion != 5);
    }//Fin función de menuBusqueda
    public static int buscarIndiceInmueble(String codigoBuscar) {
        for (int i = 0; i < cantidadInmuebles; i++) {
            if (codigo[i].equalsIgnoreCase(codigoBuscar)) {
                return i;
            }
        }//Fin ciclo For
        return -1;
    }//Fin función de uscarIndiceInmueble
   public static int buscarIndiceInquilino(String identidadBuscar) {
        for (int i = 0; i < cantidadInquilinos; i++) {
            if (identidad[i].equalsIgnoreCase(identidadBuscar)) {
                return i;
            }
        }
        return -1;
    }//Fin función de buscarIndiceInquilino
    public static String leerTexto(String mensaje) {
        String texto;
        do {
            System.out.print(mensaje);
            texto = entrada.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("El campo no puede quedar vacio.");
            }
        } while (texto.isEmpty());
        return texto;
    }//Fin función de leerTexto
    public static int leerEntero(String mensaje) {
        int numero;
        while (true) {
            try {       //Este es un bloque de código propenso a errores
                System.out.print(mensaje);
                numero = Integer.parseInt(entrada.nextLine());
                return numero;
            } catch (NumberFormatException e) { //Esta es una red de seguridad, este atrapa el error y nos permite decidir que hacer 
                System.out.println("Debe ingresar un numero entero.");
            }
        }
    }//Fin funciónde leerEntero
    public static double leerDouble(String mensaje) {
        double numero;
        while (true) {
            try { 
                System.out.print(mensaje);
                numero = Double.parseDouble(entrada.nextLine());
                if (numero < 0) {
                    System.out.println("El valor no puede ser negativo.");
                } else {
                    return numero;
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero valido.");
            }//Fin de catch
        }//Fin de While
    }//Fin función de leerDouble
    public static void cargarDatosEjemplo() {
        codigo[0] = "111"; tipo[0] = "Apartamento"; ubicacion[0] = "Primer piso";
        inquilino[0] = "Joel Martinez"; alquiler[0] = 8000; estado[0] = "Ocupado";
        pagoRenta[0] = 8000; pagoAgua[0] = 500; pagoEnergia[0] = 1200; totalPagado[0] = 9700;
        codigo[1] = "222"; tipo[1] = "Local"; ubicacion[1] = "Segundo piso";
        inquilino[1] = "Maria Lopez"; alquiler[1] = 10000; estado[1] = "Ocupado";
        pagoRenta[1] = 10000; pagoAgua[1] = 400; pagoEnergia[1] = 1000; totalPagado[1] = 11400;
        codigo[2] = "333"; tipo[2] = "Apartamento"; ubicacion[2] = "Primer piso";
        inquilino[2] = "Sin inquilino"; alquiler[2] = 9500; estado[2] = "Disponible";
        cantidadInmuebles = 3;
        nombreInquilino[0] = "Joel Martinez"; identidad[0] = "0505-2006-00066";
        telefono[0] = "9653-7431"; codigoInmueble[0] = "111";
        nombreInquilino[1] = "Maria Lopez"; identidad[1] = "0505-2006-00066";
        telefono[1] = "9653-7431"; codigoInmueble[1] = "222";
        cantidadInquilinos = 2;
        fechaInicio[0] = "01/01/2026"; fechaFinal[0] = "31/12/2026";
        fechaRenovacion[0] = "01/12/2026"; estadoContrato[0] = "Activo";
        fechaInicio[1] = "01/06/2026"; fechaFinal[1] = "30/11/2026";
        fechaRenovacion[1] = "01/12/2026"; estadoContrato[1] = "Por renovar";
        cantidadContratos = 2;
        tipoMantenimiento[0] = "Limpieza"; areaMantenimiento[0] = "111";
        fechaMantenimiento[0] = "01/08/2026"; periodicidad[0] = 3;
        proximoMantenimiento[0] = "01/11/2026"; estadoMantenimiento[0] = "Proximo";
        tipoMantenimiento[1] = "Electricidad"; areaMantenimiento[1] = "Area comun";
        fechaMantenimiento[1] = "15/07/2026"; periodicidad[1] = 6;
        proximoMantenimiento[1] = "15/01/2027"; estadoMantenimiento[1] = "Realizado";
        cantidadMantenimientos = 2;
    }//Fin función de cargarDatosEjemplo
}//Fin de Class
        