package com.ksh.lenovo.service;

import com.ksh.lenovo.pojo.CpuTypeCount;

import java.util.List;
import java.util.Map;


public interface IGoodsService {
    int selectConut();

    int selectUnque();

    // 根据屏幕大小分类
    Map selectCountByScreen();

    // 根据显存分类
    List<CpuTypeCount> selectCountByGraphicMemory();

    // 词云
    List<CpuTypeCount> selectWordCloud();

    // 根据内存大小分类
    List<CpuTypeCount> selectCountByMemorySize();

    // 根据g7
    Map selectG7();

}
