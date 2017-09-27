package se.otdev.entity;

public class TestFour {
    private Integer id;
    private String name;
    private String desc;

    public TestFour(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
