package UniverseModel;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: dmitry
 * Date: 30.11.13
 * Time: 13:30
 * To change this template use File | Settings | File Templates.
 */
public class Galaxy {

    private int id;
    private String name;
    private ArrayList<Planet> planets;
    private Integer width;
    private Integer height;

    public Galaxy(int id, String name, Integer width, Integer height) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.height = height;
        planets = new ArrayList<Planet>();
        planets.add(new Planet(
                1,
                new Random().nextInt(width),
                new Random().nextInt(height),
                "Earth")
        );
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Planet> getPlanets() {
        return (ArrayList<Planet>)planets.clone();
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

}
