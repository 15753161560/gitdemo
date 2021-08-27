package springcloud;

import java.util.Date;

public class Goout {
    private Long goid;

    private Long userid;

    private Long ckid;

    private Long cid;

    private Date godate;

    private String beizhu;

    public Long getGoid() {
        return goid;
    }

    public void setGoid(Long goid) {
        this.goid = goid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getCkid() {
        return ckid;
    }

    public void setCkid(Long ckid) {
        this.ckid = ckid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Date getGodate() {
        return godate;
    }

    public void setGodate(Date godate) {
        this.godate = godate;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}