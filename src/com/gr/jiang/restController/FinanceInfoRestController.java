package com.gr.jiang.restController;

import com.gr.jiang.dto.impl.FinanceInfoNumRequestDto;
import com.gr.jiang.dto.impl.FinanceInfoNumResponseDto;
import com.gr.jiang.service.FinanceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.ServletWebRequest;


/**
 * Created by jiang on 16/7/9.
 */
@Controller
public class FinanceInfoRestController {
    @Autowired
    private FinanceInfoService financeInfoService;

    @RequestMapping(value={"/financeOrganNum.do","/"},consumes = "application/json")
    @ResponseBody
    public  FinanceInfoNumResponseDto FinanceOrganNum(
            @RequestBody FinanceInfoNumRequestDto financeInfoNumRequestDto){
//        System.out.println("val = "+bean.getParameterValues("val")[0]);
        System.out.println("print = "+financeInfoNumRequestDto);
        FinanceInfoNumResponseDto dto =
                new FinanceInfoNumResponseDto(
                        financeInfoService.queryRowNum(financeInfoNumRequestDto.getOrgan())
                );
        return dto;
    }
}
