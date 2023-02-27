package com.ksh.lenovo.controller;

import com.ksh.lenovo.pojo.CpuTypeCount;
import com.ksh.lenovo.service.IGoodsService;
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


    @GetMapping("/g1")
    public int g1() {
        log.info("联想电脑上架总数:" + goodsService.selectConut());
        return goodsService.selectConut();
    }

    @GetMapping("/g2")
    public int g2() {
        log.info("联想电脑品牌总数:" + goodsService.selectUnque());
        return goodsService.selectUnque();
    }

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
