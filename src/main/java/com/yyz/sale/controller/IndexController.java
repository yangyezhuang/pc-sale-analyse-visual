package com.yyz.sale.controller;

import com.yyz.sale.service.IGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class IndexController {
    @Autowired
    IGoodsService goodsService;

    @GetMapping("/")
    public ModelAndView index() {
        int pcTotal = goodsService.getPcTotal();
        int brandTotal = goodsService.getBrandTotal();
        log.info("电脑上架总数:" + pcTotal);
        log.info("品牌总数:" + brandTotal);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("pcTotal", pcTotal);
        mv.addObject("brandTotal", brandTotal);

        return mv;
    }
}
