package aaa.com.Web.Entity;

public class Village_name {
    private Integer P_id;
    private String P_name;
    private String details;

    public Integer getP_id() {
        return P_id;
    }

    public void setP_id(Integer p_id) {
        P_id = p_id;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String p_name) {
        P_name = p_name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Village_name{" +
                "P_id=" + P_id +
                ", P_name='" + P_name + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
