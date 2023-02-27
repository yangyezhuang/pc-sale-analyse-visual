package com.ksh.lenovo.service.impl;

import com.ksh.lenovo.mapper.GoodsMapper;
import com.ksh.lenovo.pojo.CpuTypeCount;
import com.ksh.lenovo.service.IGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public int selectConut() {
        return goodsMapper.selectConut();
    }

    @Override
    public int selectUnque() {
        return goodsMapper.selectUnque();
    }

    @Override
    public Map selectCountByScreen() {
        List<CpuTypeCount> lists = goodsMapper.selectCountByScreen();
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
        return goodsMapper.selectCountByGraphicMemory();
    }

    @Override
    public List<CpuTypeCount> selectWordCloud() {
        return goodsMapper.selectWordCloud();
    }

    @Override
    public List<CpuTypeCount> selectCountByMemorySize() {
        return goodsMapper.selectCountByMemorySize();
    }

    @Override
    public Map selectG7() {
        List<CpuTypeCount> lists = goodsMapper.selectG7();
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
