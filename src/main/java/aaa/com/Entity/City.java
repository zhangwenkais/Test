package aaa.com.Entity;

public class City {
    private Integer cityid;
    private String city;
    private Integer provinceid;

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityid=" + cityid +
                ", city='" + city + '\'' +
                ", provinceid=" + provinceid +
                '}';
    }
}
