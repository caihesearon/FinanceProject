package com.chinasoft.SSM.service;

import java.util.List;
import java.util.Map;

public interface IUserService {

    List<Map<String, Object>> selectCityAll();

    public  List<Map<String,Object>>  selectIndexPageHeadNumber(Map<String,Object> map);
    public List<Map<String,Object>>  selectCityCouponByCityId(Map<String,Object> map);
}
