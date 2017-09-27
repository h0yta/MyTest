package se.otdev.entity;

public class TestOne {
    private Integer id;
    private String name;
    private String desc;
    private TestTwo two;
    private TestThree three;

    public TestOne(Integer id, String name, String desc, TestTwo two, TestThree three) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.two = two;
        this.three = three;
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

    public TestTwo getTwo() {
        return two;
    }

    public TestThree getThree() {
        return three;
    }
}
