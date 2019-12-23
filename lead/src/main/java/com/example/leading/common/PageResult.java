package com.example.leading.common;


import com.example.leading.entity.Peoplemessage;

import java.util.List;

public class PageResult {

    private String nowPage ;
    private Long pagetotal ;
    private List<Peoplemessage> list1 ;
    private Boolean bool ;

    public PageResult(String nowPage, Long pagetotal, List<Peoplemessage> list, Boolean bool) {
        this.nowPage = nowPage;
        this.pagetotal = pagetotal;
        this.list1 = list;
        this.bool = bool;
    }



    public List<Peoplemessage> getList1() {
        return list1;
    }
    public void setList1(List<Peoplemessage> list1) {
        this.list1 = list1;
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
}
