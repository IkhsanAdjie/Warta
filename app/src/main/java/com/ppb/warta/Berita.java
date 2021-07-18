package com.ppb.warta;

public class Berita {
    private String title;
    private String context;

    public Berita(){}

    public Berita(String title, String context){
        this.title = title;
        this.context = context;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
