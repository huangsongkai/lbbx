package iphone.dataobject;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "car_info")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    String transmissioncase;//变速箱类型{"name":"黄嵩Kauai","iphone":"123","brand":"123","model":"123","colour":"","vehiclelocation":"","purchasedate":"
    // ","mileage":"","transmissioncase"
    // :"自动","displacement":"","emissionstandard":"","price":"","remarks":"","picturesList":
    String displacement;//排量
    String emissionstandard;//排放标准
    String price;//出售价格
    String remarks;//备注
    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, cascade = javax.persistence.CascadeType.ALL)
    List<Picture> picturesList;

    public List<Picture> getPicturesList() {
        return picturesList;
    }

    public void setPicturesList(List<Picture> picturesList) {
        this.picturesList = picturesList;
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