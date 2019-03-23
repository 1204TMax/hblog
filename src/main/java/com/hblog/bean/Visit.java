package com.hblog.bean;

import org.springframework.stereotype.Component;

@Component
public class Visit {
    private Integer id;

    private String visit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit == null ? null : visit.trim();
    }
}