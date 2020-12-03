package com.example.privatenotes.model;

public class Note {
    private String title;
    private String content;
    private String tag;

    public Note(){}

    public Note(String title,String content){
        this.title = title;
        this.content = content;
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }




}