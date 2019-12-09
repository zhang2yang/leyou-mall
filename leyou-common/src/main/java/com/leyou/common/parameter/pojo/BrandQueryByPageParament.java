package com.leyou.common.parameter.pojo;

/**
 * @author Administrator on 2019/12/8.
 */
public class BrandQueryByPageParament {
    /**
     * - page：当前页，int
     * - rows：每页大小，int
     * - sortBy：排序字段，String
     * - desc：是否为降序，boolean
     * - key：搜索关键词，String
     */
    private Integer page;
    private Integer rows;
    private String soryBy;
    private Boolean desc;
    private String key;

    @Override
    public String toString() {
        return "BrandQueryByPageParament{" +
                "page=" + page +
                ", rows=" + rows +
                ", soryBy='" + soryBy + '\'' +
                ", desc=" + desc +
                ", key='" + key + '\'' +
                '}';
    }

    public BrandQueryByPageParament(Integer page) {
        this.page = page;
    }

    public BrandQueryByPageParament(Integer page, Integer rows, String soryBy, Boolean desc, String key) {
        this.page = page;
        this.rows = rows;
        this.soryBy = soryBy;
        this.desc = desc;
        this.key = key;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getSoryBy() {
        return soryBy;
    }

    public void setSoryBy(String soryBy) {
        this.soryBy = soryBy;
    }

    public Boolean getDesc() {
        return desc;
    }

    public void setDesc(Boolean desc) {
        this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
