package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: OrderServiceImpl02 <br>
 * date: 2020/10/6 10:01 <br>
 * author: vae <br>
 * version: 1.0 <br>
 */
@Service
public class OrderServiceImpl02 implements OrderService {
    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("---用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
