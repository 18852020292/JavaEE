package main.java.entity;

public class School {

    /**
     * ID
     */
    private int id;
    /**
     * 级别
     */
    private int level;
    /**
     * 名称
     */
    private String name;

    public School() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
