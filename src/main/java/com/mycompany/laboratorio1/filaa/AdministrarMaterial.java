package com.mycompany.laboratorio1.filaa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Misael
 */
public class AdministrarMaterial implements Serializable{
    private ArrayList<MaterialBibliografico> materiales;
    public AdministrarMaterial(){
        this.materiales = new ArrayList<>();
    }
    
    public void adicionarMaterial(MaterialBibliografico material){
        Scanner read =  new Scanner(System.in);
        System.out.println("Título:");
        String titulo = read.nextLine();
        System.out.println("Autor: ");
        String autor = read.nextLine();  
        if (material instanceof Libro) {
            Libro libro = new Libro();
            System.out.println("Edición: ");
            int edicion = Integer.valueOf(read.nextLine());
            System.out.println("Área: ");
            String area = read.nextLine();
            libro.crear(titulo, autor, edicion, area);
            materiales.add(libro);
            System.out.println("Registro Exitoso!");
        }else if(material instanceof ProyectoGrado){
            ProyectoGrado proyecto =  new ProyectoGrado();
            System.out.println("Tutor: " );
            String tutor = read.nextLine();
            System.out.println("Revisor: ");
            String revisor = read.nextLine();
            proyecto.crear(titulo, autor, tutor, revisor);
            materiales.add(proyecto);
            System.out.println("Registro Exitoso!");
        }
    }
    public void mostrarMateriales(MaterialBibliografico material){
        if (this.materiales != null) {
            if (material instanceof Libro) {
                for (MaterialBibliografico mate : materiales) {
                    if (mate instanceof Libro) {
                        Libro libro = (Libro)mate;
                        libro.mostrar();
                    }
                }
            }else if(material instanceof ProyectoGrado){
                for (MaterialBibliografico mate : materiales) {
                    if (mate instanceof ProyectoGrado) {
                        ProyectoGrado proyecto = (ProyectoGrado)mate;
                        proyecto.mostrar();
                    }
                }
            }
        }
    }

    public void buscarLibro(){
        Scanner read =  new Scanner(System.in);
        boolean existe = false;
        
        System.out.println("Titulo del libro: ");
        String titulo = read.nextLine();
        if (this.materiales != null) {
            for (MaterialBibliografico material : materiales) {
                if (material instanceof Libro) {
                    Libro libro = (Libro)material;
                    if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                        libro.mostrar();
                        existe = true;
                    }
                }
            }
        }
        
        if (!existe) {
            System.out.println("No se encontro el Libro que busca!");
        }
    }
    public void eliminarMaterial(MaterialBibliografico material){
        Scanner read =  new Scanner(System.in);
        boolean existe = false;
        System.out.println("Titulo del Material: ");
        String titulo = read.nextLine();
        if (this.materiales != null) {
            if (material instanceof Libro) {
                for (MaterialBibliografico mate : materiales) {
                    if (mate instanceof Libro) {
                        Libro libro = (Libro)mate;
                        if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                            materiales.remove((MaterialBibliografico)libro);
                            System.out.println("El material " + titulo + " se eliminó!");
                            existe = true;
                            break;
                        }
                    }
                }
            }else if (material instanceof ProyectoGrado) {
                for (MaterialBibliografico mate : materiales) {
                    if (mate instanceof ProyectoGrado) {
                        ProyectoGrado proyecto = (ProyectoGrado)mate;
                        if (proyecto.getTitulo().equalsIgnoreCase(titulo)) {
                            materiales.remove((MaterialBibliografico)proyecto);
                            System.out.println("El material " + titulo + " se eliminó!");
                            existe = true;
                            break;
                        }
                    }
                }
            }
        }
        
        if(!existe)System.out.println("No se encontro el Material");
    }
}
