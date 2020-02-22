package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

public interface OrderService {
    //1 通过前端url传过来秒杀活动id,然后下单接口内校验对应id是否属于对应商品且活动已经开始
    //2 直接再下单接口内判断对应的商品是否存在秒杀活动，若存在进行中，则直接下单
    OrderModel createOder(Integer userId,Integer itemId,Integer promoId,Integer amount) throws BusinessException;

}
