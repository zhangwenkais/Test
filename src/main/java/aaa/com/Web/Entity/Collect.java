package aaa.com.Web.Entity;

public class Collect {
    private Integer co_id;
    private Integer c_hid;
    private Integer c_cid;

    public Integer getCo_id() {
        return co_id;
    }

    public void setCo_id(Integer co_id) {
        this.co_id = co_id;
    }

    public Integer getC_hid() {
        return c_hid;
    }

    public void setC_hid(Integer c_hid) {
        this.c_hid = c_hid;
    }

    public Integer getC_cid() {
        return c_cid;
    }

    public void setC_cid(Integer c_cid) {
        this.c_cid = c_cid;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "co_id=" + co_id +
                ", c_hid=" + c_hid +
                ", c_cid=" + c_cid +
                '}';
    }
}
