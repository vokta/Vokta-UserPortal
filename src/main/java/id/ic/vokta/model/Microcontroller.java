package id.ic.vokta.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Microcontroller {

    @JsonProperty("uid")
    private String uid;
    @JsonProperty("sensorId")
    private String sensorId;
    @JsonProperty("sensorName")
    private String sensorName;
    @JsonProperty("tankBrand")
    private String tankBrand;
    @JsonProperty("tankType")
    private String tankType;
    @JsonProperty("capacity")
    private String capacity;
    @JsonProperty("diameter")
    private String diameter;
    @JsonProperty("height")
    private String height;
    @JsonProperty("modifyDt")
    private String modifyDt;
    @JsonProperty("createDt")
    private String createDt;

    public Microcontroller() {
        //Empty Constructor
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getTankBrand() {
        return tankBrand;
    }

    public void setTankBrand(String tankBrand) {
        this.tankBrand = tankBrand;
    }

    public String getTankType() {
        return tankType;
    }

    public void setTankType(String tankType) {
        this.tankType = tankType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getModifyDt() {
        return modifyDt;
    }

    public void setModifyDt(String modifyDt) {
        this.modifyDt = modifyDt;
    }

    public String getCreateDt() {
        return createDt;
    }

    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }
}
