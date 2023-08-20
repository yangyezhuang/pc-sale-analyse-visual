package com.yyz.sale.service;

import com.yyz.sale.pojo.CpuTypeCount;

import java.util.List;
import java.util.Map;


public interface IGoodsService {
    int getPcTotal();

    int getBrandTotal();

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
