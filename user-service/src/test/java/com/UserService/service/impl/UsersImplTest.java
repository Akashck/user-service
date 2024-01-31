package com.UserService.service.impl;

import com.UserService.Repository.UserRepository;
import com.UserService.model.UserModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UsersImpl.class)
class UsersImplTest {

    @InjectMocks
    private UsersImpl usersImpl;

   // @MockBean
    private UserRepository userRepository;

   // @Before
    public void init(){
        MockitoAnnotations.openMocks(UsersImpl.class);
    }

    @Test
    public void getUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void setManuallyUsers() {
        List<UserModel> model = new ArrayList<>();
        UserModel data = new UserModel();
        data.setUserId(101);
        data.setUserName("user101");
        data.setAddress("HYD");
        model.add(data);
        PowerMockito.mockStatic(UsersImpl.class);
        when(UsersImpl.setManuallyUsers()).then((Answer<?>) model);
    }

   // @Test
    public void userData() throws Exception {
       // System.out.println(userRepository+"******");
        usersImpl = new UsersImpl();
      List<UserModel> modelList = new ArrayList<>();
        UserModel data = new UserModel();
        data.setUserId(101);
        data.setUserName("user101");
        data.setAddress("HYD");

        UserModel data2= new UserModel();
        data2.setUserId(102);
        data2.setUserName("user102");
        data2.setAddress("BLR");

        UserModel data3 = new UserModel();
        data3.setUserId(103);
        data3.setUserName("user103");
        data3.setAddress("CHN");

        modelList.add(data);
        modelList.add(data2);
        modelList.add(data3);
        List<UserModel> models = Whitebox.invokeMethod(this.usersImpl, "userData", modelList);

       Assert.assertEquals(modelList, models);
    }
}