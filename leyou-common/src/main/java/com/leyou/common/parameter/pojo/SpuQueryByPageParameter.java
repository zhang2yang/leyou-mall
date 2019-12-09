package com.leyou.common.parameter.pojo;

/**
 * @author Administrator on 2019/12/8.
 */
public class SpuQueryByPageParameter extends  BrandQueryByPageParament {
    /**
     *         - page：当前页，int
     *         - rows：每页大小，int
     *         - sortBy：排序字段，String
     *         - desc：是否为降序，boolean
     *         - key：搜索关键词，String
     *         - saleable: 是否上下架
     */
    private Boolean saleable;


    public Boolean getSaleable() {
        return saleable;
    }

    public void setSaleable(Boolean saleable) {
        this.saleable = saleable;
    }

    public SpuQueryByPageParameter(Integer page) {
        super(page);
    }

    public SpuQueryByPageParameter(Integer page, Integer rows, String soryBy, Boolean desc, String key) {
        super(page, rows, soryBy, desc, key);
    }
    @Override
    public String toString() {
        return "SpuQueryByPageParameter{" +
                "saleable=" + saleable +
                '}';
    }
}
