package com.murphy.base.model;

public class DictoryDetail {
    private String id;

    private String typeid;

    private String dictname;

    private String dicttype;

    private String dictlevel;

    private String dictorder;

    private String dictmemo;

    private String isegc;

    public DictoryDetail(String id, String typeid, String dictname, String dicttype, String dictlevel, String dictorder, String dictmemo, String isegc) {
        this.id = id;
        this.typeid = typeid;
        this.dictname = dictname;
        this.dicttype = dicttype;
        this.dictlevel = dictlevel;
        this.dictorder = dictorder;
        this.dictmemo = dictmemo;
        this.isegc = isegc;
    }

    public DictoryDetail() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getDictname() {
        return dictname;
    }

    public void setDictname(String dictname) {
        this.dictname = dictname == null ? null : dictname.trim();
    }

    public String getDicttype() {
        return dicttype;
    }

    public void setDicttype(String dicttype) {
        this.dicttype = dicttype == null ? null : dicttype.trim();
    }

    public String getDictlevel() {
        return dictlevel;
    }

    public void setDictlevel(String dictlevel) {
        this.dictlevel = dictlevel == null ? null : dictlevel.trim();
    }

    public String getDictorder() {
        return dictorder;
    }

    public void setDictorder(String dictorder) {
        this.dictorder = dictorder == null ? null : dictorder.trim();
    }

    public String getDictmemo() {
        return dictmemo;
    }

    public void setDictmemo(String dictmemo) {
        this.dictmemo = dictmemo == null ? null : dictmemo.trim();
    }

    public String getIsegc() {
        return isegc;
    }

    public void setIsegc(String isegc) {
        this.isegc = isegc == null ? null : isegc.trim();
    }
}