package com.ketech.bq.ketech.entity;

import java.util.Date;

public class DmHmEntity {
    private String id;

    private String zjhm;

    private String zjhmgsd;

    private String bjhm;

    private String bjhmgsd;

    private String thkssj;

    private Long thsj;

    private String hjlx;

    private String djzLac;

    private String xjzCi;

    private String sjly;

    private Date cjsj;

    private Date gxsj;

    private Date tbsj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm == null ? null : zjhm.trim();
    }

    public String getZjhmgsd() {
        return zjhmgsd;
    }

    public void setZjhmgsd(String zjhmgsd) {
        this.zjhmgsd = zjhmgsd == null ? null : zjhmgsd.trim();
    }

    public String getBjhm() {
        return bjhm;
    }

    public void setBjhm(String bjhm) {
        this.bjhm = bjhm == null ? null : bjhm.trim();
    }

    public String getBjhmgsd() {
        return bjhmgsd;
    }

    public void setBjhmgsd(String bjhmgsd) {
        this.bjhmgsd = bjhmgsd == null ? null : bjhmgsd.trim();
    }

    public String getThkssj() {
        return thkssj;
    }

    public void setThkssj(String thkssj) {
        this.thkssj = thkssj == null ? null : thkssj.trim();
    }

    public Long getThsj() {
        return thsj;
    }

    public void setThsj(Long thsj) {
        this.thsj = thsj;
    }

    public String getHjlx() {
        return hjlx;
    }

    public void setHjlx(String hjlx) {
        this.hjlx = hjlx == null ? null : hjlx.trim();
    }

    public String getDjzLac() {
        return djzLac;
    }

    public void setDjzLac(String djzLac) {
        this.djzLac = djzLac == null ? null : djzLac.trim();
    }

    public String getXjzCi() {
        return xjzCi;
    }

    public void setXjzCi(String xjzCi) {
        this.xjzCi = xjzCi == null ? null : xjzCi.trim();
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly == null ? null : sjly.trim();
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public Date getGxsj() {
        return gxsj;
    }

    public void setGxsj(Date gxsj) {
        this.gxsj = gxsj;
    }

    public Date getTbsj() {
        return tbsj;
    }

    public void setTbsj(Date tbsj) {
        this.tbsj = tbsj;
    }
}