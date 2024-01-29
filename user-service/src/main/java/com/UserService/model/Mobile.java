package com.UserService.model;

import java.util.List;

public class Mobile {
    @Override
    public String toString() {
        return "Mobile{" +
                "RAM=" + RAM +
                ", ROM=" + ROM +
                ", mobileName=" + mobileName +
                ", MobileBrand=" + MobileBrand +
                '}';
    }

    public List<String> getRAM() {
        return RAM;
    }

    public void setRAM(List<String> RAM) {
        this.RAM = RAM;
    }

    public List<String> getROM() {
        return ROM;
    }

    public void setROM(List<String> ROM) {
        this.ROM = ROM;
    }

    public List<String> getMobileName() {
        return mobileName;
    }

    public void setMobileName(List<String> mobileName) {
        this.mobileName = mobileName;
    }

    public List<com.UserService.model.MobileBrand> getMobileBrand() {
        return MobileBrand;
    }

    public void setMobileBrand(List<com.UserService.model.MobileBrand> mobileBrand) {
        MobileBrand = mobileBrand;
    }

    public List<String> RAM;
    public List<String> ROM;

    public List<String> mobileName;

    public List<MobileBrand> MobileBrand;
}
