package com.chinasoft.SSM.dao;


import java.util.List;
import java.util.Map;

public interface IUserDao {
    List<Map<String, Object>> selectCityAll();
    public  List<Map<String,Object>>  selectIndexPageHeadNumber(Map<String,Object> map);
    public List<Map<String,Object>>  selectCityCouponByCityId(Map<String,Object> map);
}
