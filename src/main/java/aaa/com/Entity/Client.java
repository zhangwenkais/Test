package aaa.com.Entity;

import lombok.Data;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Table(name = "Client")
public class Client {
    @Id
    @Column

    private  Integer cus_id;
    @Column
    private String cusName;
    @Column
    private String pwd;
    @Column
    private long telphone;
    @Column
    private String idcard;
    @Column
    private String email;
    @Column
    private String address;
    @Column
    private String photo;
    @Column
    private String demo;
    private String state;

    public Client(String cusName, String pwd) {
        this.cusName = cusName;
        this.pwd = pwd;
    }

    public Client() {

    }


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

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
                ", demo='" + demo + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
