package springcloud;

import java.util.Date;

public class Comein {
    private Long ciid;

    private Long cid;

    private Long userid;

    private Long ckid;

    private Date cidate;

    private String beizhu;

    public Long getCiid() {
        return ciid;
    }

    public void setCiid(Long ciid) {
        this.ciid = ciid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
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

    public Date getCidate() {
        return cidate;
    }

    public void setCidate(Date cidate) {
        this.cidate = cidate;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}