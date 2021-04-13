package com.mycompany.laboratorio1.filaa;

import java.util.Scanner;

/**
 * @author Misael
 */
public class main {
     public static void main(String args[]){
        ManejoArchivo archivo = new ManejoArchivo();
        AdministrarMaterial admin = new AdministrarMaterial();
        Scanner leer = new Scanner (System.in);
        Libro libro = new Libro();
        ProyectoGrado proyecto = new ProyectoGrado();
        
        int opc;
        boolean continuar = true;
        do {            
            System.out.println(" -------------------------------------");
            System.out.println("|      Material Bibliografico         |");
            System.out.println(" -------------------------------------");
            System.out.println("| 1. Crear Archivo                    |");
            System.out.println("| 2. Adicionar Libros                 |");
            System.out.println("| 3. Adicionar Proyectos.             |");
            System.out.println("| 4. Mostrar Libros.                  |");
            System.out.println("| 5. Mostrar Proyectos de grado.      |");
            System.out.println("| 6. Buscar Libro.                    |");
            System.out.println("| 7. Eliminar Libro.                  |");
            System.out.println("| 8. Eliminar Proyecto de grado.      |");
            System.out.println("| 9. Salir.                           |");
            System.out.println(" ------------------------------------");
            System.out.println("Ingrese una opción: ");
            opc = Integer.valueOf(leer.nextLine());
            System.out.println("---------------------------");
            
            switch(opc){
                case 1:
                    archivo.crearArchivo();
                    break;
                case 2:
                    admin = archivo.Recuperar();
                    admin.adicionarMaterial(libro);
                    archivo.guardar(admin);
                    break;
                case 3:
                    admin = archivo.Recuperar();
                     admin.adicionarMaterial(proyecto);
                    archivo.guardar(admin);
                    break;
                case 4:
                    admin = archivo.Recuperar();
                    admin.mostrarMateriales(libro);           
                    break;
                case 5:
                    admin = archivo.Recuperar();
                    admin.mostrarMateriales(proyecto);
                    break;
                case 6:
                    admin = archivo.Recuperar();
                    admin.buscarLibro();
                    break;
                case 7:
                    admin = archivo.Recuperar();
                    admin.eliminarMaterial(libro);
                    archivo.guardar(admin);
                    break;
                case 8:
                    admin = archivo.Recuperar();
                    admin.eliminarMaterial(proyecto);
                    archivo.guardar(admin);
                    break;
                default :
                    continuar = false;
                    break;
            }
            
            
        } while (continuar);
    }
}
