package com.example.demo.common;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;


public class MyPageRequest extends PageRequest {

    private static final long serialVersionUID = -76703640096945681L;

    /**
     * Creates a new {@link PageRequest} with sort parameters applied.
     *
     * @param page zero-based page index, must not be negative.
     * @param size the size of the page to be returned, must be greater than 0.
     * @param sort must not be {@literal null}, use {@link Sort#unsorted()} instead.
     */
    protected MyPageRequest(int page, int size, Sort sort) {
        super(page, size, sort);
    }

    public static MyPageRequest getPageable(MyPage page){
        return new MyPageRequest(page.getPageNumber(), page.getPageSize(), Sort.unsorted());
    }
}
