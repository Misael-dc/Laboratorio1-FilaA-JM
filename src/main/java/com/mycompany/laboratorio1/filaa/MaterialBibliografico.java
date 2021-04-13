package com.mycompany.laboratorio1.filaa;

import java.io.Serializable;

/**
 * @author Misael
 */
public class MaterialBibliografico implements Serializable{
    private String titulo;
    private String autor;
    
    public void crear(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void mostrar(){
        System.out.println("-----------------------");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
