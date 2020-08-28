package aaa.com.Entity;

public class Client {
    private  Integer cus_id;
    private String cusName;
    private String pwd;
    private long telphone;
    private String idcard;
    private String email;
    private String address;
    private String photo;
    private String state;
    private String demo;

    public Integer getCus_id() {
        return cus_id;
    }

    public void setCus_id(Integer cus_id) {
        this.cus_id = cus_id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public long getTelphone() {
        return telphone;
    }

    public void setTelphone(long telphone) {
        this.telphone = telphone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
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
        return "Client{" +
                "cus_id=" + cus_id +
                ", cusName='" + cusName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", telphone=" + telphone +
                ", idcard='" + idcard + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", photo='" + photo + '\'' +
                ", state='" + state + '\'' +
                ", demo='" + demo + '\'' +
                '}';
    }
}
