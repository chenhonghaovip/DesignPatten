package com.test.builderpatten;

/**
 * @author chenhonghao
 * @date 2019-6-21
 */
public class WaybillBcListDetail {
    private String id;

    private String wId;

    private String unitId;

    private String kappId;

    private String kappName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getKappId() {
        return kappId;
    }

    public void setKappId(String kappId) {
        this.kappId = kappId;
    }

    public String getKappName() {
        return kappName;
    }

    public void setKappName(String kappName) {
        this.kappName = kappName;
    }

    public static class Builder{
        private WaybillBcListDetail waybillBcListDetail;

        public Builder id(String id){
            waybillBcListDetail.setId(id);
            return this;
        }
        public Builder wId(String wId){
            waybillBcListDetail.setwId(wId);
            return this;
        }
        public Builder unitId(String unitId){
            waybillBcListDetail.setId(unitId);
            return this;
        }
        public Builder kappId(String kappId){
            waybillBcListDetail.setId(kappId);
            return this;
        }
        public Builder kappName(String kappName){
            waybillBcListDetail.setId(kappName);
            return this;
        }
        public WaybillBcListDetail build(){
            return waybillBcListDetail;
        }
    }
}