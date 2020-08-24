package aaa.com.Entity;

public class Position {
    private Integer perm_id;
    private String perm_name;
    private  String url;
    private Integer parentPid;

    public Integer getPerm_id() {
        return perm_id;
    }

    public void setPerm_id(Integer perm_id) {
        this.perm_id = perm_id;
    }

    public String getPerm_name() {
        return perm_name;
    }

    public void setPerm_name(String perm_name) {
        this.perm_name = perm_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getParentPid() {
        return parentPid;
    }

    public void setParentPid(Integer parentPid) {
        this.parentPid = parentPid;
    }

    @Override
    public String toString() {
        return "Position{" +
                "perm_id=" + perm_id +
                ", perm_name='" + perm_name + '\'' +
                ", url='" + url + '\'' +
                ", parentPid=" + parentPid +
                '}';
    }
}
