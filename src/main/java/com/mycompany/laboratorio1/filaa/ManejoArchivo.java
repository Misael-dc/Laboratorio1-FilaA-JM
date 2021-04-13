package com.mycompany.laboratorio1.filaa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Misael
 */
public class ManejoArchivo {
    private String url = "D:\\JavaMavenFiles\\archivoMaterial.txt";
    private FileOutputStream escritura;
    private FileInputStream lectura;
    
    public void crearArchivo(){
        Path path = Paths.get(url);
        try {
            if(!Files.exists(path)){
                Files.createFile(path); 
                AdministrarMaterial admin = new AdministrarMaterial();
                guardar(admin);
                System.out.println("Archivo Creado correctamente!");
            }else{
                System.out.println("Archivo ya creado!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void guardar(AdministrarMaterial datosAdmin){
        try{
            escritura = new FileOutputStream(url);
            ObjectOutputStream canal = new ObjectOutputStream(escritura);
            canal.writeObject(datosAdmin);
            escritura.close();
        }catch(FileNotFoundException falla){
            falla.printStackTrace();
        }catch(IOException falla){
            falla.printStackTrace();
        }
    }
    
    public AdministrarMaterial Recuperar(){
        AdministrarMaterial datosAdmin = new AdministrarMaterial();
        try{
            lectura = new FileInputStream(url);
            ObjectInputStream entrada = new ObjectInputStream(lectura);
            datosAdmin = (AdministrarMaterial) entrada.readObject();
            return datosAdmin;
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return datosAdmin;
    }
}
