package aaa.com.Entity;

public class House_info {
    private Integer h_id;
    private Integer h_pid;
    private Integer h_aid;
    private Integer h_tid;
    private Integer flors;
    private Integer counts;
    private Integer type_room;
    private Integer type_hall;
    private Integer type_toilet;
    private String fitment;
    private double area;
    private  String year;
    private String land;
    private Double deal;
    private String create;

    private String cases;//case
    private String facility;
    private String images;
    private Integer letset;
    private Integer state;
    private Integer h_cusid;
    private String dateissued;//date issued

    public Integer getH_id() {
        return h_id;
    }

    public void setH_id(Integer h_id) {
        this.h_id = h_id;
    }

    public Integer getH_pid() {
        return h_pid;
    }

    public void setH_pid(Integer h_pid) {
        this.h_pid = h_pid;
    }

    public Integer getH_aid() {
        return h_aid;
    }

    public void setH_aid(Integer h_aid) {
        this.h_aid = h_aid;
    }

    public Integer getH_tid() {
        return h_tid;
    }

    public void setH_tid(Integer h_tid) {
        this.h_tid = h_tid;
    }

    public Integer getFlors() {
        return flors;
    }

    public void setFlors(Integer flors) {
        this.flors = flors;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public Integer getType_room() {
        return type_room;
    }

    public void setType_room(Integer type_room) {
        this.type_room = type_room;
    }

    public Integer getType_hall() {
        return type_hall;
    }

    public void setType_hall(Integer type_hall) {
        this.type_hall = type_hall;
    }

    public Integer getType_toilet() {
        return type_toilet;
    }

    public void setType_toilet(Integer type_toilet) {
        this.type_toilet = type_toilet;
    }

    public String getFitment() {
        return fitment;
    }

    public void setFitment(String fitment) {
        this.fitment = fitment;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public Double getDeal() {
        return deal;
    }

    public void setDeal(Double deal) {
        this.deal = deal;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getLetset() {
        return letset;
    }

    public void setLetset(Integer letset) {
        this.letset = letset;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getH_cusid() {
        return h_cusid;
    }

    public void setH_cusid(Integer h_cusid) {
        this.h_cusid = h_cusid;
    }

    public String getDateissued() {
        return dateissued;
    }

    public void setDateissued(String dateissued) {
        this.dateissued = dateissued;
    }

    @Override
    public String toString() {
        return "House_info{" +
                "h_id=" + h_id +
                ", h_pid=" + h_pid +
                ", h_aid=" + h_aid +
                ", h_tid=" + h_tid +
                ", flors=" + flors +
                ", counts=" + counts +
                ", type_room=" + type_room +
                ", type_hall=" + type_hall +
                ", type_toilet=" + type_toilet +
                ", fitment='" + fitment + '\'' +
                ", area=" + area +
                ", year='" + year + '\'' +
                ", land='" + land + '\'' +
                ", deal=" + deal +
                ", create='" + create + '\'' +
                ", cases='" + cases + '\'' +
                ", facility='" + facility + '\'' +
                ", images='" + images + '\'' +
                ", letset=" + letset +
                ", state=" + state +
                ", h_cusid=" + h_cusid +
                ", dateissued='" + dateissued + '\'' +
                '}';
    }
}
