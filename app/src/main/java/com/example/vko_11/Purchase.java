package com.example.vko_11;

import java.util.ArrayList;

public class Purchase {
    protected String item;
    protected String notice;
    protected int id;

    public static int itemId = 1000;

    public Purchase(String item, String notice){
        this.item = item;
        this.notice = notice;

        id = itemId;
        itemId++;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getItem() {
        return item;
    }

    public String getNotice() {
        return notice;
    }

    public int getId() {
        return id;
    }
}
