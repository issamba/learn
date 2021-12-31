package com.thunder.learn.bvo;

import com.thunder.learn.entity.BaseBVO;

public class PublicationBVO extends BaseBVO {

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
