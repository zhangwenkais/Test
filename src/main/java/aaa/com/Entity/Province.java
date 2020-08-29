package aaa.com.Entity;

public class Province {
    private Integer provinceid;
    private String province;

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "province{" +
                "provinceid=" + provinceid +
                ", province='" + province + '\'' +
                '}';
    }
}
