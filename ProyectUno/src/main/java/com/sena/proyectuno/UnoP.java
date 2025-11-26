
package com.sena.proyectuno;
import javax.swing.JOptionPane;
public class UnoP {
    public void vectorNombre(){
        String n=JOptionPane.showInputDialog("Ingrese la cantidad de usuarios");
        int numsu=Integer.parseInt(n);
        String nombreV[]=new String[numsu],mensaje="Los nombres de los usuarios son: \n";
        for(int i=0;i<nombreV.length;i++){
            nombreV[i]=JOptionPane.showInputDialog("Ingrese el nombre ");
        }
        for(int i=0;i<nombreV.length;i++){
            mensaje+="Usuario "+(i+1)+" se llama: "+nombreV[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void ejer2(){
        /*Realiza un programa que pida la cantidad de animales y sus nombres, al finalizar mostrar*/
        String animal=JOptionPane.showInputDialog("Ingrese la cantidad de animales: ");
        int nomA=Integer.parseInt(animal);
        String animalN[]=new String[nomA], mensaje="Los animales son: \n ";
        for(int i=0; i<animalN.length;i++){
            animalN[i]=JOptionPane.showInputDialog("Ingrese el animal: ");
        }
        for(int i=0;i<animalN.length;i++){
            mensaje+="El animal "+(i+1)+" es: "+animalN[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void ejer3(){
        /*Escribe un programa que solicite 5 nombres de productos y sus 
    respectivos precios, almacenándolos en dos vectores paralelos. Luego, 
    muestre todos los productos cuyo precio sea mayor a $1000.*/
        
        String producto[]=new String[5];
        int precio[]=new int[5];
        String precios, mensaje="";
        int i;
        for(i=0;i<producto.length;i++){
            producto[i]=JOptionPane.showInputDialog("Producto: \n");
            precios=JOptionPane.showInputDialog("Precios: \n");
            precio[i]=Integer.parseInt(precios);
        }
        for(i=0;i<producto.length;i++){
            if(precio[i]>1000){
                mensaje="========Productos mayores a 1000$===============";
                
            }
        }
    }
}
