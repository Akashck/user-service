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
        mb.setRAM(Collections.singletonList("6 GB"));
        mb.setROM(Collections.singletonList("125 GB"));
        mb.setMobileName(Collections.singletonList("VIVO-T2"));
        mb.setMobileBrand(Collections.singletonList(MobileBrand.IPHONE));
        return mb;
    }
}
