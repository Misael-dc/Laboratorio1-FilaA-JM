package com.mycompany.laboratorio1.filaa;
/**
 *
 * @author Misael
 */
public class ProyectoGrado extends MaterialBibliografico{
    private String tutor;
    private String revisor;
    
    public void crear(String titulo, String autor, String tutor, String revisor){
        super.crear(titulo, autor);
        this.tutor = tutor;
        this.revisor = revisor;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Tutor: " + this.tutor);
        System.out.println("Revisor: " + this.revisor);
        System.out.println("-----------------------");
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }
    
    
}
