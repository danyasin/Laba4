public class Man {
    private String id;
    private String name;
    private String gender;
    private String salary;
    private String birthday;
    private Unit unit;

    public

    Man(String id_, String name_, String gender_, String unit_, String birthday_, String title_, int id_unit) {
        id = id_;
        name = name_;
        gender = gender_;
        salary = unit_;
        birthday = birthday_;
        unit = new Unit(title_, id_unit);
    }

    /**
     * @return id of man
     */
    public String getId() {
        return id;
    }

    /**
     * @return man's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return gender man
     */
    public String getGender() {
        return gender;
    }

    /**
     * @return man's salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @return man's birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @return id of unit
     */
    public int getUnitId() {
        return unit.getId();
    }

    /**
     * @return title of unit
     */
    public String getUnitTitle() {
        return unit.getTitle();
    }

}
