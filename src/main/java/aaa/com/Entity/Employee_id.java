package aaa.com.Entity;

public class Employee_id {
    private Integer m_id;
    private String m_name;
    private String pwd;
    private String photo;
    private Integer state;
    private String demo;
    private Integer m_eid;

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    public Integer getM_eid() {
        return m_eid;
    }

    public void setM_eid(Integer m_eid) {
        this.m_eid = m_eid;
    }

    @Override
    public String toString() {
        return "Employee_id{" +
                "m_id=" + m_id +
                ", m_name='" + m_name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", photo='" + photo + '\'' +
                ", state=" + state +
                ", demo='" + demo + '\'' +
                ", m_eid=" + m_eid +
                '}';
    }
}
