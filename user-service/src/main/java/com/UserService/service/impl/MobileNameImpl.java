package com.UserService.service.impl;

import com.UserService.model.Mobile;
import com.UserService.model.MobileBrand;
import com.UserService.service.MobileName;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MobileNameImpl implements MobileName {
    @Override
    public Mobile getMobile() {
        Mobile mb = new Mobile();
        List<String> RAM = new ArrayList<>();
        mb.setRAM(getAllRAM(RAM));
        mb.setROM(getAllROM(RAM));
        mb.setMobileName(getAllIphoneName(RAM));
        mb.setMobileName(getAllVivoName(RAM));
        mb.setMobileName(getAllOppoName(RAM));
        mb.setMobileBrand(Collections.singletonList(MobileBrand.IPHONE));
        System.out.println(mb.toString());
        return mb;
    }

    public List<String> getAllRAM(List<String> RAM) {
        RAM.add("6 GB");
        RAM.add("8 GB");
        RAM.add("12 GB");
        return RAM;
    }

    public List<String> getAllROM(List<String> ROM) {
        ROM.add("64 GB");
        ROM.add("128 GB");
        ROM.add("256 GB");
        return ROM;
    }

    public List<String> getAllVivoName(List<String> mobileName) {
        mobileName.add("VIVO T1");
        mobileName.add("VIVO T1 X");
        mobileName.add("VIVO Y9 PRO");
        mobileName.add("VIVO Y12 PRO");
        mobileName.add("VIVO T1 5G PRO");
        return mobileName;
    }
    public List<String> getAllIphoneName(List<String> mobileName) {
        mobileName.add("IPHONE X");
        mobileName.add("IPHONE X1");
        mobileName.add("IPHONE 15");
        mobileName.add("IPHONE 14 PRO");
        mobileName.add("IPHONE 13");
        return mobileName;
    }

    public List<String> getAllOppoName(List<String> mobileName) {
        mobileName.add("OPPO A1");
        mobileName.add("OPPO A2");
        mobileName.add("OPPO A3");
        return mobileName;
    }
}
