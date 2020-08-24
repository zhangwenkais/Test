package aaa.com.Web.Entity;

public class Statistics {
    private Integer sid;
    private String sfrom;
    private Double smoney;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSfrom() {
        return sfrom;
    }

    public void setSfrom(String sfrom) {
        this.sfrom = sfrom;
    }

    public Double getSmoney() {
        return smoney;
    }

    public void setSmoney(Double smoney) {
        this.smoney = smoney;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "sid=" + sid +
                ", sfrom='" + sfrom + '\'' +
                ", smoney=" + smoney +
                '}';
    }
}
