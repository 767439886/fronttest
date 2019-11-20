package com.example.yunyoupersonnel.common;


import com.example.yunyoupersonnel.entity.User;

import java.util.List;
import java.util.Map;

public class PageResult {

    private String nowPage ;
    private Long pagetotal ;
    private List<User> list1 ;
    private Boolean bool ;

    public PageResult(String nowPage, Long pagetotal, List<User> list, Boolean bool) {
        this.nowPage = nowPage;
        this.pagetotal = pagetotal;
        this.list1 = list;
        this.bool = bool;
    }

    public PageResult(Boolean bool) {
        this.bool = bool;
    }

    public Boolean getBool() {
        return bool;
    }
    public void setBool(Boolean bool) {
        this.bool = bool;
    }
    public String getNowPage() {
        return nowPage;
    }
    public void setNowPage(String nowPage) {
        this.nowPage = nowPage;
    }
    public Long getPagetotal() {
        return pagetotal;
    }
    public void setPagetotal(Long pagetotal) {
        this.pagetotal = pagetotal;
    }
    public List<User> getList1() {
        return list1;
    }
    public void setList1(List<User> list1) {
        this.list1 = list1;
    }
}
