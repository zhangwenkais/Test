package aaa.com.Web.Entity;

public class Employee {
    private  Integer e_id;
    private  String ename;
    private String sex;
    private Integer age;
    private String idcard;
    private String address;
    private String phone;
    private Integer state;
    private  String demo;

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", ename='" + ename + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", idcard='" + idcard + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", state=" + state +
                ", demo='" + demo + '\'' +
                '}';
    }
}
