import java.util.*;

public class Unit {
    private int id;
    private String title;

    public Unit(String t, int i) {
        title = t;
        id = i;
    }

    /**
     * @return id of unit
     */
    public int getId() {
        return id;
    }

    /**
     * @return title of unit
     */
    public String getTitle() {
        return this.title;
    }




}
