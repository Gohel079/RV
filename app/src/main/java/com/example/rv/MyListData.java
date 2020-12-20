package com.example.rv;

public class MyListData {
    private String descripition;
    private int imgid;

    public  MyListData(String desc,int imgid)
    {
        this.descripition=desc;
        this.imgid=imgid;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
