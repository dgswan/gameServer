package UniverseModel;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: dmitry
 * Date: 30.11.13
 * Time: 13:32
 * To change this template use File | Settings | File Templates.
 */

public class Universe {

    private static Universe universe;

    private ArrayList<Galaxy> galaxies;
    private Integer width;
    private Integer height;

    private Universe(){
        galaxies = new ArrayList<Galaxy>();
        galaxies.add(new Galaxy(1, "Deneba", 100, 100));
        galaxies.add(new Galaxy(2, "Altair", 100, 100));
        width = 1000;
        height = 1000;

    }

    public ArrayList<Galaxy> getGalaxies() {
        return (ArrayList<Galaxy>)galaxies.clone();
    }

    public static void Initialize() {
        universe = new Universe();
    }

    public static Universe Instance(){
        if (universe!=null) {
            universe = new Universe();
        }
        return universe;
    }




}
