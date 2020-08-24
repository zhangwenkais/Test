package aaa.com.Web.Entity;

public class Position_permission {
    private Integer fk_post_id;
    private Integer fk_perm_id;

    public Integer getFk_post_id() {
        return fk_post_id;
    }

    public void setFk_post_id(Integer fk_post_id) {
        this.fk_post_id = fk_post_id;
    }

    public Integer getFk_perm_id() {
        return fk_perm_id;
    }

    public void setFk_perm_id(Integer fk_perm_id) {
        this.fk_perm_id = fk_perm_id;
    }

    @Override
    public String toString() {
        return "Position_permission{" +
                "fk_post_id=" + fk_post_id +
                ", fk_perm_id=" + fk_perm_id +
                '}';
    }
}
