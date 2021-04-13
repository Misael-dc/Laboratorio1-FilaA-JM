
package com.mycompany.laboratorio1.filaa;

/**
 *
 * @author Misael
 */
public class Libro extends MaterialBibliografico{
    private int edicion;
    private String area;
    
    public void crear(String titulo, String autor, int edicion, String area){
        super.crear(titulo, autor);
        this.edicion = edicion;
        this.area = area;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Edición: " + this.edicion);
        System.out.println("Área: " + this.area);
        System.out.println("-----------------------");
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
}
