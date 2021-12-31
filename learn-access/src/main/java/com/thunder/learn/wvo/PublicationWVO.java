package com.thunder.learn.wvo;

import com.thunder.learn.entity.BaseWVO;


public class PublicationWVO extends BaseWVO {

    private Integer id;
    private String text;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
