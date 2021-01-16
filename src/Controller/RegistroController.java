/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Empleados;
import Views.RegistroFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;

/**
 *
 * @author Mauro
 */
public class RegistroController implements ActionListener {
    private RegistroFrame vframe;
    private Empleados vh;
    private int seleccion;
    JFileChooser f;

    public RegistroController(RegistroFrame v) {
        vframe = v;
        f = new JFileChooser();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
            case "clean":
                vframe.cleanVehiculoData();
                break;       
            case "save":
                seleccion = f.showSaveDialog(vframe);
                if(seleccion == JFileChooser.APPROVE_OPTION){
                    File file = f.getSelectedFile();
                    vh = vframe.getVehiculoData();
                    save(file);                       
                }else if(seleccion == JFileChooser.CANCEL_OPTION){
                }
                break;
            case "load":
                f.showOpenDialog(vframe);
                if(seleccion == JFileChooser.APPROVE_OPTION){
                    vh = open(f.getSelectedFile());
                    vframe.setVehiculoData(vh);                
                }else if(seleccion == JFileChooser.CANCEL_OPTION ){
                }
                break;
        }  
    }
    
    public void save(File file){
        try{
            ObjectOutputStream w = new ObjectOutputStream (new FileOutputStream(file));
            w.writeObject(vh);
            w.flush();
        }catch(IOException ex){   
        }
    }
    
    public Empleados open (File file){
        
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            return (Empleados)ois.readObject();        
        }catch(IOException | ClassNotFoundException ex){
        }
        return null;
    }
}
