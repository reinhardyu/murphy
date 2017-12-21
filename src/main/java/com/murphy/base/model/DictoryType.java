package com.murphy.base.model;

public class DictoryType {
    private String id;

    private String dictname;

    private String dictcode;

    public DictoryType(String id, String dictname, String dictcode) {
        this.id = id;
        this.dictname = dictname;
        this.dictcode = dictcode;
    }

    public DictoryType() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDictname() {
        return dictname;
    }

    public void setDictname(String dictname) {
        this.dictname = dictname == null ? null : dictname.trim();
    }

    public String getDictcode() {
        return dictcode;
    }

    public void setDictcode(String dictcode) {
        this.dictcode = dictcode == null ? null : dictcode.trim();
    }
}