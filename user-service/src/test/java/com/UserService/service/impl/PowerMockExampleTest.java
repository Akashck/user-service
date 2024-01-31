package com.UserService.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PowerMockExample.class)
@PowerMockIgnore("jdk.internal.reflect.*")
public class PowerMockExampleTest {

    @InjectMocks
    PowerMockExample powerMockExample;
    @Test
    public void ShouldTestStaticMethod() {

        PowerMockito.mockStatic(PowerMockExample.class);
        PowerMockito.when(powerMockExample.staticMethod()).thenReturn("static");
        String s = powerMockExample.staticMethod();
        assertEquals("staic", s);

    }

}