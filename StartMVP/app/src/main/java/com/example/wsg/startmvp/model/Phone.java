package com.example.wsg.startmvp.model;

/**
 * 项目名：StartMVP
 * 包名：com.example.wsg.startmvp.model
 * 文件名：Phone
 * 创建者：wsg
 * 创建时间：2017/8/3  1:01
 * 描述：手机号实体类信息
 */

public class Phone {
    String number;
    String province;
    String castName;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCastName() {
        return castName;
    }

    public void setCastName(String castName) {
        this.castName = castName;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    String carrier;

}
