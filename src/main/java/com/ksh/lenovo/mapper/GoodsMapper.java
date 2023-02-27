package com.ksh.lenovo.mapper;

import com.ksh.lenovo.pojo.CpuTypeCount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    int selectConut();

    int selectUnque();

    // 根据屏幕大小分类
    List<CpuTypeCount> selectCountByScreen();

    // 根据显存分类
    List<CpuTypeCount> selectCountByGraphicMemory();

    // 词云
    List<CpuTypeCount> selectWordCloud();

    // 根据内存大小分类
    List<CpuTypeCount> selectCountByMemorySize();

    // 根据g7
    List<CpuTypeCount> selectG7();

}
