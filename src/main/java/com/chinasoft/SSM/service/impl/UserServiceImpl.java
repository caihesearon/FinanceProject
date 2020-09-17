package com.chinasoft.SSM.service.impl;

import com.chinasoft.SSM.dao.IUserDao;
import com.chinasoft.SSM.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao dao;

    @Override
    public List<Map<String, Object>> selectCityAll() {
        return dao.selectCityAll();
    }
    @Override
    public List<Map<String, Object>> selectIndexPageHeadNumber(
            Map<String, Object> map) {
        // TODO Auto-generated method stub
        return dao.selectIndexPageHeadNumber(map);
    }

    @Override
    public List<Map<String, Object>> selectCityCouponByCityId(
            Map<String, Object> map) {
        // TODO Auto-generated method stub
        return dao.selectCityCouponByCityId(map);
    }

}
