package com.chinasoft.SSM.service.impl;

import com.chinasoft.SSM.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public List<Map<String, Object>> selectAll() {
        System.out.println("Service   .... ");
        return null;
    }
}
