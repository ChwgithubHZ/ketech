package com.ketech.bq.ketech.bean;

import com.ketech.bq.ketech.entity.*;
import lombok.Data;

import java.util.List;

/******************
 * @描述：
 * @createBy:lailai
 * @data:2019/6/28 15:02
 */


public class MegerDataBean {

    private List<DmBqBean> dmBqData;

    private List<DmWpEntity> wpData;

    private List<DmTxhmEntity> txhmData;


   private List<NeofjDatabean> neofjData;

    public List<NeofjDatabean> getNeofjData() {
        return neofjData;
    }

    public void setNeofjData(List<NeofjDatabean> neofjData) {
        this.neofjData = neofjData;
    }



    public List<DmTxhmEntity> getTxhmData() {
        return txhmData;
    }

    public void setTxhmData(List<DmTxhmEntity> txhmData) {
        this.txhmData = txhmData;
    }

    public List<DmBqBean> getDmBqData() {
        return dmBqData;
    }

    public void setDmBqData(List<DmBqBean> dmBqData) {
        this.dmBqData = dmBqData;
    }

    public List<DmWpEntity> getWpData() {
        return wpData;
    }

    public void setWpData(List<DmWpEntity> wpData) {
        this.wpData = wpData;
    }
}
