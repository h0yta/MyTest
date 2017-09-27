package se.otdev.entity;

import java.util.List;

public class TestTwo {
    private Integer id;
    private String name;
    private String desc;
    private List<TestFour> four;

    public TestTwo(Integer id, String name, String desc, List<TestFour> four) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.four = four;
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

    public List<TestFour> getFour() {
        return four;
    }
}
