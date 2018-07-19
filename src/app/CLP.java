package app;

import core.Einstein;
import core.MapColoring;
import core.Museum;

/**
 * Main class.
 * 
 * @author Tomasz Strzoda
 */
public class CLP {

    public static void main(String[] args) {
        
        System.out.println("***** Einstein *****"); 
        Einstein einstein = new Einstein();
        einstein.model();
        System.out.println(einstein.search() + "\n\n");
        
        System.out.println("***** Museum *****");
        Museum museum = new Museum();
        museum.model();
        System.out.println(museum.search() + "\n\n");
        
        System.out.println("***** Map coloring *****");
        MapColoring map = new MapColoring();
        map.model();
        System.out.println(map.search() + "\n\n");
    }
    
}
