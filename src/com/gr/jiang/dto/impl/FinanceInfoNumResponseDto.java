package com.gr.jiang.dto.impl;

import com.gr.jiang.dto.BaseResponseDto;

/**
 * Created by jiang on 16/7/9.
 */
public class FinanceInfoNumResponseDto extends BaseResponseDto {
    private int num ;

    public FinanceInfoNumResponseDto() {
    }

    public FinanceInfoNumResponseDto(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
