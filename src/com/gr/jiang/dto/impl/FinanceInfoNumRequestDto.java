package com.gr.jiang.dto.impl;

import com.gr.jiang.dto.BaseRequestDto;
import com.gr.jiang.dto.BaseResponseDto;

/**
 * Created by jiang on 16/7/9.
 */
public class FinanceInfoNumRequestDto extends BaseRequestDto {
    private String organ;

    public FinanceInfoNumRequestDto() {
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    @Override
    public String toString() {
        return "FinanceInfoNumRequestDto{" +
                "organ='" + organ + '\'' +
                '}';
    }
}
