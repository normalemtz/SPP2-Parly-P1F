/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.parly.p1f;
import javax.swing.JOptionPane;

/** 
 *Parly
 *CECILIA GUTIÉRREZ DE LARA HERNÁNDEZ
 *NORMA LEDEZMA MARTÍNEZ
 *ERICK EDUARDO GERVACCI ROMERO
 *DIEGO SANTANA LEIVA
 *BENITO RAFAEL MORANTE VÁZQUEZ
 */
public class SPP2ParlyP1F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar variables
        int a=0;
        double calf, prom, par1=0, par2=0;
        
        a=pedirEntero("Introduce el número de materias que cursas:");
        
        String[][] miVector=new String[a][4];
        for (int i=0; i<miVector.length; i++){
            
        miVector[i][0]=pedirString("Nombre de la materia:");
        miVector[i][1]=pedirDouble("Introduce la calificación parcial 1:");
        miVector[i][2]=pedirDouble("Introduce la calificación parcial 2:");
        
        par1=Double.parseDouble(miVector[i][1]);
        par2=Double.parseDouble(miVector[i][2]);
        prom=(par1+par2)/2;
        JOptionPane.showMessageDialog(null, "Tu promedio es:" +prom);
        }
    }
    public static int pedirEntero(String mensaje){
        String dato="";
        int num=0;
        boolean flag;
        do{
            try{ 
                dato=JOptionPane.showInputDialog(null, mensaje);
                num=Integer.parseInt(dato);
                flag=false;
            }catch (Exception ex){
                JOptionPane.showInputDialog(null, "Error");
                flag=true;
            }
            }while (flag);
        return num;
    }
    public static String pedirString(String mensaje){
        String dato="";
        boolean flag;
        do{
            try{
                dato=JOptionPane.showInputDialog(null, mensaje);
                flag=false; 
            }catch (Exception ex){
                JOptionPane.showInputDialog(null, "Error");
                flag=true;
            }
        }while(flag);
        return dato;
    }
    public static String pedirDouble(String mensaje){
        String dato="";
        double num=0;
        String d="";
        boolean flag;
        do{
            try{
                dato=JOptionPane.showInputDialog(null, mensaje);
                num=Double.parseDouble(dato);
                flag=false;
            }catch (Exception ex){
                JOptionPane.showInputDialog(null, "Error");
                flag=true;
            }
        }while(flag);
        d=String.valueOf(num);
    return d;
}
}

