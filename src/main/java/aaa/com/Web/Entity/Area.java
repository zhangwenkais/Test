package aaa.com.Web.Entity;

public class Area {
    private Integer a_id;
    private String a_name;

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    @Override
    public String toString() {
        return "Area{" +
                "a_id=" + a_id +
                ", a_name='" + a_name + '\'' +
                '}';
    }
}
