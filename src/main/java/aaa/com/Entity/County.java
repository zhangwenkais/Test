package aaa.com.Entity;

public class County {
    private Integer countyid;
    private String county;
    private Integer cityid;

    public Integer getCountyid() {
        return countyid;
    }

    public void setCountyid(Integer countyid) {
        this.countyid = countyid;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    @Override
    public String toString() {
        return "County{" +
                "countyid=" + countyid +
                ", county='" + county + '\'' +
                ", cityid=" + cityid +
                '}';
    }
}
