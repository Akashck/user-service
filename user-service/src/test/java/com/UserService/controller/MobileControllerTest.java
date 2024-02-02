package com.UserService.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.UserService.model.Mobile;
import com.UserService.service.MobileName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

@RunWith(MockitoJUnitRunner.class)
public class MobileControllerTest {
    @InjectMocks
    MobileController mobileController;

    @Mock
    MobileName mobileName;

    @Test
    public void shouldCallGetMobile() {
        Mobile mobile = new Mobile();
        mobile.setRAM(Collections.singletonList("6 GB"));
        when(mobileName.getMobile()).thenReturn(mobile);
        Mobile mb = mobileController.getMobile("Mobile");
        assertEquals(mb, mobile);

    }

}