package com.yyz.sale.service.impl;

import com.yyz.sale.dao.GoodDao;
import com.yyz.sale.pojo.CpuTypeCount;
import com.yyz.sale.service.IGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodDao goodDao;


    @Override
    public int getPcTotal() {
        return goodDao.getPcTotal();
    }

    @Override
    public int getBrandTotal() {
        return goodDao.getBrandTotal();
    }

    @Override
    public Map selectCountByScreen() {
        List<CpuTypeCount> lists = goodDao.selectCountByScreen();
        List<String> nameList = new ArrayList<>();
        List<Integer> valueList = new ArrayList<>();
        Map resMap = new HashMap<>();

        for (CpuTypeCount li : lists) {
            nameList.add(li.getName());
            valueList.add(li.getValue());
        }

        resMap.put("name", nameList);
        resMap.put("value", valueList);
        return resMap;
    }

    @Override
    public List<CpuTypeCount> selectCountByGraphicMemory() {
        return goodDao.selectCountByGraphicMemory();
    }

    @Override
    public List<CpuTypeCount> selectWordCloud() {
        return goodDao.selectWordCloud();
    }

    @Override
    public List<CpuTypeCount> selectCountByMemorySize() {
        return goodDao.selectCountByMemorySize();
    }

    @Override
    public Map selectG7() {
        List<CpuTypeCount> lists = goodDao.selectG7();
        List<String> nameList = new ArrayList<>();
        List<Integer> valueList = new ArrayList<>();
        Map resMap = new HashMap<>();

        for (CpuTypeCount li : lists) {
            nameList.add(li.getName());
            valueList.add(li.getValue());
        }

        resMap.put("name", nameList);
        resMap.put("value", valueList);

        return resMap;
    }

}
