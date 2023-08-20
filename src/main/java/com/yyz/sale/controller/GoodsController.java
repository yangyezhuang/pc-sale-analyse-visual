package com.yyz.sale.controller;

import com.yyz.sale.pojo.CpuTypeCount;
import com.yyz.sale.service.IGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @GetMapping("/g3")
    public Map g3() {
        log.info(goodsService.selectCountByScreen().toString());
        return goodsService.selectCountByScreen();
    }

    @GetMapping("/g4")
    public List<CpuTypeCount> g4() {
        log.info(goodsService.selectCountByGraphicMemory().toString());
        return goodsService.selectCountByGraphicMemory();
    }

    @GetMapping("/g5")
    public List<CpuTypeCount> g5() {
        log.info(goodsService.selectWordCloud().toString());
        return goodsService.selectWordCloud();
    }

    @GetMapping("/g6")
    public List<CpuTypeCount> g6() {
        log.info(goodsService.selectCountByMemorySize().toString());
        return goodsService.selectCountByMemorySize();
    }

    @GetMapping("/g7")
    public Map g7() {
        log.info(goodsService.selectG7().toString());
        return goodsService.selectG7();
    }

}
