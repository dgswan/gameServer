package UniverseModel;

/**
 * Created with IntelliJ IDEA.
 * User: dmitry
 * Date: 30.11.13
 * Time: 13:31
 * To change this template use File | Settings | File Templates.
 */
public class Planet {

    private Integer id;
    private Integer x;
    private Integer y;
    private String name;

    public Planet(Integer id, Integer x, Integer y, String name) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public String getName() {
        return name;
    }

}
