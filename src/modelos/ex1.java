/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class ex1 {
    
    public double encontrarPromedio(ArrayList<Integer> edades) {
        double sum = 0, average;
        
        for(int i = 0; i < edades.size(); i++) {
            sum += edades.get(i);
        }
        
        average = sum/(edades.size());
        return average;
    }
    
    
    
}
