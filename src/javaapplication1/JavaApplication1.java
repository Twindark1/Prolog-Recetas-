/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Twindark1
 */

import org.jpl7.Query;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String archivo = "consult('practica1.pl')";
        Query q = new Query(archivo); 
        System.out.println(q.hasSolution());
        
        String person = "adonis";
        
        String consulta = "estudiante(" + person + ", X)";
        Query query = new Query(consulta);
        Object solucionObtenida = query.oneSolution().get("X");
        String ans = String.valueOf(solucionObtenida);
        System.out.println(ans);
    } 
}
