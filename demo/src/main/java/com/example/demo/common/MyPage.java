package com.example.demo.common;

import lombok.Data;

@Data
public class MyPage<T> {

    /**
     * 每页大小
     */
    private Integer pageSize = 2;
    /**
     * 第几页
     */
    private Integer pageNumber = 1;
}
