package iphone.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;


public class CarInfoDTO {
    int id;
    String name;
    String iphone;
    String brand;//品牌
    String model;//型号
    String colour;
    String vehiclelocation;//车辆所在地
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMdd")
    Date purchasedate; //车辆购买日期
    String mileage;//里程
    String transmissioncase;//变速箱类型
    String displacement;//排量
    String emissionstandard;//排放标准
    String price;//出售价格
    String remarks;//备注
    List<String> pictore;


    public List<String> getPictore() {
        return pictore;
    }

    public void setPictore(List<String> pictore) {
        this.pictore = pictore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getVehiclelocation() {
        return vehiclelocation;
    }

    public void setVehiclelocation(String vehiclelocation) {
        this.vehiclelocation = vehiclelocation;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getTransmissioncase() {
        return transmissioncase;
    }

    public void setTransmissioncase(String transmissioncase) {
        this.transmissioncase = transmissioncase;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getEmissionstandard() {
        return emissionstandard;
    }

    public void setEmissionstandard(String emissionstandard) {
        this.emissionstandard = emissionstandard;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}