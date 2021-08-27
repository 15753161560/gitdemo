package springcloud;

public class Cangku {
    private Long ckid;

    private String ckname;

    public Long getCkid() {
        return ckid;
    }

    public void setCkid(Long ckid) {
        this.ckid = ckid;
    }

    public String getCkname() {
        return ckname;
    }

    public void setCkname(String ckname) {
        this.ckname = ckname == null ? null : ckname.trim();
    }
}