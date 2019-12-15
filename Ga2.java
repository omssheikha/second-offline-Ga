/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg525.ga1;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class Ga2
{

    static ArrayList<Task> tasks;
            
    public static void main(String[] args)
    {
        fillArrylist();
        Genetic g = new Genetic(tasks);  
        g.StartGA();
        System.out.println("The best degredation found is "+ g.getBestDegredation());
    }

    private static void fillArrylist()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
